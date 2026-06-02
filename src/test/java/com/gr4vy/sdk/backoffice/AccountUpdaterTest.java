package com.gr4vy.sdk.backoffice;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.AccountUpdaterJobCreate;
import com.gr4vy.sdk.models.operations.Body;
import com.gr4vy.sdk.util.Fixtures;
import com.gr4vy.sdk.util.Harness;
import com.gr4vy.sdk.util.Reaches;

/**
 * E2E coverage for the account-updater job-create endpoint. The deterministic
 * mock has no account-updater backend, so the job-create is asserted via
 * {@link Reaches}. We first store a real card to obtain a valid payment-method
 * id to reference.
 */
class AccountUpdaterTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void createJob() throws Exception {
        Gr4vy client = Harness.client();

        String id = client.paymentMethods().create()
                .requestBody(Body.of(Fixtures.approvingCard()))
                .call()
                .paymentMethod()
                .orElseThrow(() -> new IllegalStateException("stored card create returned no body"))
                .id();
        if (id == null || id.isEmpty()) {
            fail("stored card create returned an empty payment-method id");
        }

        Reaches.reaches("account_updater.jobs.create", () -> client.accountUpdater().jobs().create(
                AccountUpdaterJobCreate.builder()
                        .paymentMethodIds(List.of(id))
                        .build()));
    }
}
