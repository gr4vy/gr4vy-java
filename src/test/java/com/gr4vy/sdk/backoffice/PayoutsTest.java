package com.gr4vy.sdk.backoffice;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.PaymentMethodStoredCard;
import com.gr4vy.sdk.models.components.PayoutCreate;
import com.gr4vy.sdk.models.components.PayoutCreatePaymentMethod;
import com.gr4vy.sdk.util.Fixtures;
import com.gr4vy.sdk.util.Harness;
import com.gr4vy.sdk.util.Reaches;

/**
 * E2E coverage for the payouts endpoints. Listing is supported by the sandbox.
 * Create and get require real payout rails the deterministic mock does not
 * provide, so they are asserted via {@link Reaches}.
 */
class PayoutsTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void list() throws Exception {
        Gr4vy client = Harness.client();
        assertNotNull(client.payouts().list().call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void create() {
        Gr4vy client = Harness.client();
        Reaches.reaches("payouts.create", () -> client.payouts().create()
                .payoutCreate(PayoutCreate.builder()
                        .amount(1000L)
                        .currency("USD")
                        .paymentServiceId(Fixtures.MISSING_ID)
                        .paymentMethod(PayoutCreatePaymentMethod.of(
                                PaymentMethodStoredCard.builder()
                                        .id(Fixtures.MISSING_ID)
                                        .build()))
                        .build())
                .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void get() {
        Gr4vy client = Harness.client();
        Reaches.reaches("payouts.get", () -> client.payouts().get()
                .payoutId(Fixtures.MISSING_ID)
                .call());
    }
}
