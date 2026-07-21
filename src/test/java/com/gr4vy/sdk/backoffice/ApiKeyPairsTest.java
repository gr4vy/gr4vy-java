package com.gr4vy.sdk.backoffice;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.APIKeyPairCreate;
import com.gr4vy.sdk.models.components.APIKeyPairUpdate;
import com.gr4vy.sdk.util.Fixtures;
import com.gr4vy.sdk.util.Harness;
import com.gr4vy.sdk.util.Reaches;

/**
 * E2E coverage for the API key pairs endpoints. Listing is supported by the
 * sandbox and asserted as a real 2xx. Create, get, update and delete each need
 * a real key pair (and, for create, a real role) that the deterministic mock
 * environment does not provide, so they are asserted via {@link Reaches}: a 4xx
 * means the SDK built a correct request and the API routed and rejected it,
 * which is exactly the "endpoint reached" signal the coverage check needs.
 *
 * <p>API key pairs are an account-level resource, like merchant accounts. Those
 * endpoints ignore the per-request merchant scope, so — mirroring
 * {@link MerchantAccountsTest} — the shared merchant-bound {@link Harness#client()}
 * is used directly rather than a separate admin client.
 */
class ApiKeyPairsTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void list() throws Exception {
        Gr4vy client = Harness.client();
        assertNotNull(client.apiKeyPairs().list().call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void create() {
        Gr4vy client = Harness.client();
        // A nonexistent role id makes the API reject the request with a 4xx while
        // still routing to the create endpoint.
        Reaches.reaches("apiKeyPairs.create", () -> client.apiKeyPairs().create()
                .request(APIKeyPairCreate.builder()
                        .displayName("E2E api key pair")
                        .roleIds(List.of(Fixtures.MISSING_ID))
                        .build())
                .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void get() {
        Gr4vy client = Harness.client();
        // A nonexistent id yields a 4xx: the get endpoint was reached.
        Reaches.reaches("apiKeyPairs.get", () -> client.apiKeyPairs().get()
                .apiKeyPairId(Fixtures.MISSING_ID)
                .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void update() {
        Gr4vy client = Harness.client();
        // A nonexistent id yields a 4xx: the update endpoint was reached.
        Reaches.reaches("apiKeyPairs.update", () -> client.apiKeyPairs().update()
                .apiKeyPairId(Fixtures.MISSING_ID)
                .apiKeyPairUpdate(APIKeyPairUpdate.builder()
                        .displayName("E2E api key pair")
                        .build())
                .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void delete() {
        Gr4vy client = Harness.client();
        // A nonexistent id yields a 4xx: the delete endpoint was reached.
        Reaches.reaches("apiKeyPairs.delete", () -> client.apiKeyPairs().delete()
                .apiKeyPairId(Fixtures.MISSING_ID)
                .call());
    }
}
