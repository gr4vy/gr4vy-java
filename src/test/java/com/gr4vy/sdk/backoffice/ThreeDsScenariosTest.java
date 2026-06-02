package com.gr4vy.sdk.backoffice;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.ThreeDSecureScenarioConditions;
import com.gr4vy.sdk.models.components.ThreeDSecureScenarioCreate;
import com.gr4vy.sdk.models.components.ThreeDSecureScenarioOutcome;
import com.gr4vy.sdk.models.components.ThreeDSecureScenarioOutcomeAuthentication;
import com.gr4vy.sdk.models.components.ThreeDSecureScenarioOutcomeAuthenticationTransactionStatus;
import com.gr4vy.sdk.models.components.ThreeDSecureScenarioUpdate;
import com.gr4vy.sdk.util.Fixtures;
import com.gr4vy.sdk.util.Harness;
import com.gr4vy.sdk.util.Reaches;

/**
 * E2E coverage for the 3DS scenario endpoints. Listing is fully supported by the
 * sandbox; create/update/delete depend on 3DS provisioning the mock cannot
 * satisfy, so they are asserted via {@link Reaches}.
 */
class ThreeDsScenariosTest {

    private static ThreeDSecureScenarioCreate sampleScenario() {
        return ThreeDSecureScenarioCreate.builder()
                .conditions(ThreeDSecureScenarioConditions.builder()
                        .amount(1000L)
                        .build())
                .outcome(ThreeDSecureScenarioOutcome.builder()
                        .authentication(ThreeDSecureScenarioOutcomeAuthentication.builder()
                                .transactionStatus(ThreeDSecureScenarioOutcomeAuthenticationTransactionStatus.Y)
                                .build())
                        .build())
                .build();
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void list() throws Exception {
        Gr4vy client = Harness.client();
        assertNotNull(client.threeDsScenarios().list().call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void create() {
        Gr4vy client = Harness.client();
        Reaches.reaches("three_ds_scenarios.create", () -> client.threeDsScenarios().create()
                .threeDSecureScenarioCreate(sampleScenario())
                .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void update() {
        Gr4vy client = Harness.client();
        Reaches.reaches("three_ds_scenarios.update", () -> client.threeDsScenarios().update()
                .threeDsScenarioId(Fixtures.MISSING_ID)
                .threeDSecureScenarioUpdate(ThreeDSecureScenarioUpdate.builder()
                        .conditions(ThreeDSecureScenarioConditions.builder()
                                .amount(2000L)
                                .build())
                        .build())
                .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void delete() {
        Gr4vy client = Harness.client();
        Reaches.reaches("three_ds_scenarios.delete", () -> client.threeDsScenarios().delete()
                .threeDsScenarioId(Fixtures.MISSING_ID)
                .call());
    }
}
