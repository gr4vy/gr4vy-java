package com.gr4vy.sdk.util;

import java.io.IOException;
import java.nio.file.*;
import java.security.SecureRandom;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;

import com.gr4vy.sdk.BearerSecuritySource;
import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.Gr4vy.AvailableServers;
import com.gr4vy.sdk.models.components.Field;
import com.gr4vy.sdk.models.components.MerchantAccount;
import com.gr4vy.sdk.models.components.MerchantAccountCreate;
import com.gr4vy.sdk.models.components.PaymentService;
import com.gr4vy.sdk.models.components.PaymentServiceCreate;
import com.gr4vy.sdk.models.operations.CreateMerchantAccountResponse;
import com.gr4vy.sdk.models.operations.UpdatePaymentServiceResponse;

public abstract class BaseTest {

    protected Gr4vy gr4vyClient;
    
    private String generateRandomMerchantId(int length) {
        // Each byte produces 2 hex characters, so we need length / 2 bytes
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Length must be an even number.");
        }
        int numBytes = length / 2;
        SecureRandom secureRandom = new SecureRandom();
        byte[] bytes = new byte[numBytes];
        secureRandom.nextBytes(bytes); // Fills the byte array with random bytes

        // Convert byte array to hex string
        StringBuilder sb = new StringBuilder(length);
        for (byte b : bytes) {
            sb.append(String.format("%02x", b)); // %02x formats byte as 2-digit hex, with leading zero if needed
        }
        return sb.toString();
    }

    protected String loadPrivateKey()  throws IOException {
        /*
         * Loads the private key from an environment variable or a file.
         */

        String privateKey = System.getenv("PRIVATE_KEY");

        // 2. If not found, read from file
        if (privateKey == null || privateKey.isEmpty()) {
            Path path = Paths.get("").toAbsolutePath().resolve("private_key.pem").normalize();
            privateKey = Files.readString(path);
        }

        return privateKey;
    }
    
    protected Gr4vy createGr4vyClient(String privateKey, String merchantAccountId) {
        /*
         * Creates a Gr4vy client instance.
         */
        return Gr4vy.builder()
            .server(AvailableServers.SANDBOX)
            .id("e2e")
            .merchantAccountId(merchantAccountId)
            .securitySource(new BearerSecuritySource.Builder(privateKey).build())
        .build();
    }

    protected Gr4vy createGr4vyClient(String privateKey) {
        /*
         * Creates a Gr4vy client instance.
         */

         return createGr4vyClient(privateKey, null);
    }

    @BeforeEach
    protected void setupEnvironment() throws Exception {
        /*
         * Sets up the test environment by creating a merchant account and payment service.
         */

        String privateKey = loadPrivateKey();
        Gr4vy gr4vyAdminClient = createGr4vyClient(privateKey);
        String merchantAccountId = generateRandomMerchantId(8);
        CreateMerchantAccountResponse res = gr4vyAdminClient.merchantAccounts().create()
                .merchantAccountCreate(MerchantAccountCreate.builder()
                    .id(merchantAccountId)
                    .displayName(merchantAccountId)
                    .build())
                .call();

        MerchantAccount merchantAccount = res.merchantAccount().orElse(null);

        this.gr4vyClient = createGr4vyClient(privateKey, merchantAccount.id());
        UpdatePaymentServiceResponse paymentServiceResponse = this.gr4vyClient.paymentServices().create()
                .paymentServiceCreate(PaymentServiceCreate.builder()
                    .acceptedCurrencies(List.of("USD"))
                    .acceptedCountries(List.of("US"))
                    .displayName("Payment service")
                    .paymentServiceDefinitionId("mock-card")
                    .fields(List.of(
                        Field.builder()
                            .key("merchant_id")
                            .value("merchant_id")
                            .build()))
                    .build())
                .call();

        PaymentService paymentService = paymentServiceResponse.paymentService().orElse(null);
    }

    protected void cleanupEnvironment() {
        /*
         * Cleans up the test environment. Currently a no-op.
         */
    }
}
