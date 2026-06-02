package com.gr4vy.sdk.util;

import java.io.IOException;
import java.net.http.HttpClient;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.Assumptions;

import com.gr4vy.sdk.BearerSecuritySource;
import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.Gr4vy.AvailableServers;
import com.gr4vy.sdk.models.components.Field;
import com.gr4vy.sdk.models.components.MerchantAccount;
import com.gr4vy.sdk.models.components.MerchantAccountCreate;
import com.gr4vy.sdk.models.components.PaymentServiceCreate;
import com.gr4vy.sdk.models.operations.CreateMerchantAccountResponse;
import com.gr4vy.sdk.utils.HTTPClient;

/**
 * One isolated merchant account per JVM, provisioned on first use.
 *
 * <p>In CI each shard is a <em>separate</em> {@code ./gradlew test} invocation
 * (one per package — see {@code .github/workflows/ci.yaml}), so each runs in its
 * own JVM and this static holder yields exactly one merchant per shard with no
 * cross-shard sharing — the Java analogue of the per-process merchant the other
 * SDKs use. A single local {@code ./gradlew test} runs every package in one JVM
 * and therefore shares one merchant across all of them, which is fine locally.
 *
 * <p>The signing key is read from {@code PRIVATE_KEY} or a {@code private_key.pem}
 * at the repo root. When no key is available the calling test is <em>skipped</em>
 * (JUnit assumption) rather than failed: fork PRs and laptops without the sandbox
 * key skip the live suite, while a missing key on a trusted ref is caught in CI.
 */
public final class Harness {

    private Harness() {}

    /** A provisioned merchant: a merchant-bound client plus its identifiers. */
    public static final class TestMerchant {
        public final Gr4vy client;
        public final String merchantAccountId;
        public final String privateKey;

        TestMerchant(Gr4vy client, String merchantAccountId, String privateKey) {
            this.client = client;
            this.merchantAccountId = merchantAccountId;
            this.privateKey = privateKey;
        }
    }

    private static final class NoKeyException extends RuntimeException {
        NoKeyException(String message) {
            super(message);
        }
    }

    private static boolean attempted;
    private static TestMerchant shared;
    private static RuntimeException setupError;

    /**
     * Returns the shard's shared merchant, provisioning it on first use. Skips
     * the calling test when no signing key is available; any other setup failure
     * fails the test.
     */
    public static synchronized TestMerchant merchant() {
        if (!attempted) {
            attempted = true;
            try {
                shared = setup();
            } catch (NoKeyException e) {
                setupError = e;
            } catch (Exception e) {
                setupError = new RuntimeException("merchant setup failed: " + e.getMessage(), e);
            }
        }
        if (setupError != null) {
            if (setupError instanceof NoKeyException) {
                Assumptions.abort("skipping live E2E: " + setupError.getMessage());
            }
            throw setupError;
        }
        return shared;
    }

    /** Convenience accessor for the merchant-bound client. */
    public static Gr4vy client() {
        return merchant().client;
    }

    /** The signing key, read from {@code PRIVATE_KEY} or {@code private_key.pem}. */
    static String loadPrivateKey() {
        String key = System.getenv("PRIVATE_KEY");
        if (key != null && !key.isEmpty()) {
            return key;
        }
        // Test JVMs run from the repo root; probe parents too for safety.
        List<Path> candidates = List.of(
                Paths.get("private_key.pem"),
                Paths.get("..", "private_key.pem"),
                Paths.get("..", "..", "private_key.pem"));
        for (Path c : candidates) {
            try {
                if (Files.exists(c)) {
                    return Files.readString(c);
                }
            } catch (IOException ignored) {
                // try next candidate
            }
        }
        throw new NoKeyException("no private key (set PRIVATE_KEY or add private_key.pem)");
    }

    /**
     * Builds an SDK client pointed at the sandbox, signing every request with a
     * fresh JWT and routing through the forward-compat/recording transport. When
     * {@code merchantAccountId} is non-null the client is bound to it.
     */
    public static Gr4vy newClient(String privateKey, String merchantAccountId) {
        HttpClient defaultHttpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)
                .connectTimeout(Duration.ofSeconds(20))
                .build();
        HTTPClient interceptingClient = new JsonInterceptorHttpClient(defaultHttpClient);

        return Gr4vy.builder()
                .client(interceptingClient)
                .server(AvailableServers.SANDBOX)
                .id("e2e")
                .merchantAccountId(merchantAccountId)
                .securitySource(new BearerSecuritySource.Builder(privateKey).build())
                .build();
    }

    private static String randomMerchantId() {
        byte[] bytes = new byte[4];
        new SecureRandom().nextBytes(bytes);
        StringBuilder sb = new StringBuilder(8);
        for (byte b : bytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    private static TestMerchant setup() throws Exception {
        String privateKey = loadPrivateKey();
        String merchantAccountId = randomMerchantId();

        // Admin client (not merchant-scoped) creates the merchant account.
        Gr4vy admin = newClient(privateKey, null);
        CreateMerchantAccountResponse res = admin.merchantAccounts().create()
                .request(MerchantAccountCreate.builder()
                        .id(merchantAccountId)
                        .displayName(merchantAccountId)
                        .build())
                .call();
        MerchantAccount account = res.merchantAccount()
                .orElseThrow(() -> new IllegalStateException("merchant account create returned no body"));

        Gr4vy merchant = newClient(privateKey, account.id());

        // A deterministic mock-card service so card flows reach a real 2xx.
        // Cover every currency/country the fixtures generator can emit.
        merchant.paymentServices().create()
                .paymentServiceCreate(PaymentServiceCreate.builder()
                        .displayName("E2E mock card")
                        .paymentServiceDefinitionId("mock-card")
                        .acceptedCurrencies(List.of("USD", "EUR", "GBP"))
                        .acceptedCountries(List.of("US", "GB"))
                        .fields(List.of(Field.builder()
                                .key("merchant_id")
                                .value(account.id())
                                .build()))
                        .build())
                .call();

        return new TestMerchant(merchant, account.id(), privateKey);
    }
}
