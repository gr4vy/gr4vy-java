package com.gr4vy.sdk.processing;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.CheckoutSession;
import com.gr4vy.sdk.models.components.CheckoutSessionCreate;
import com.gr4vy.sdk.util.Fixtures;
import com.gr4vy.sdk.util.Harness;
import com.gr4vy.sdk.util.Reaches;

/**
 * E2E coverage for checkout sessions: create/get/update/delete, plus a
 * missing-resource get to exercise the not-found path.
 */
class CheckoutSessionsTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void createGetUpdateDelete() throws Exception {
        Gr4vy client = Harness.client();

        CheckoutSession cs = client.checkoutSessions().create()
                .call()
                .checkoutSession()
                .orElseThrow();
        String id = cs.id();
        assertNotNull(id);
        assertFalse(id.isEmpty());

        client.checkoutSessions().get().sessionId(id).call();

        client.checkoutSessions().update()
                .sessionId(id)
                .checkoutSessionCreate(CheckoutSessionCreate.builder()
                        .currency("USD")
                        .amount(1299L)
                        .build())
                .call();

        client.checkoutSessions().delete().sessionId(id).call();
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void getMissing() {
        Gr4vy client = Harness.client();

        Reaches.reaches("get checkout session (missing)", () ->
                client.checkoutSessions().get().sessionId(Fixtures.MISSING_ID).call());
    }
}
