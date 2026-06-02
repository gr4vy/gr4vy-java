package com.gr4vy.sdk.processing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.TransactionRefundAllCreate;
import com.gr4vy.sdk.util.Fixtures;
import com.gr4vy.sdk.util.Harness;
import com.gr4vy.sdk.util.Reaches;

/**
 * Reach coverage for the two transaction endpoints not exercised by the main
 * lifecycle: void (distinct from cancel) and refund-all. Both are asserted via
 * {@link Reaches} against a missing transaction id — a 404 still proves the
 * endpoint was routed.
 */
class TransactionVoidRefundAllTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void voidTransaction() {
        Gr4vy client = Harness.client();
        Reaches.reaches("transactions.void", () -> client.transactions().void_()
                .transactionId(Fixtures.MISSING_ID)
                .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void refundAll() {
        Gr4vy client = Harness.client();
        Reaches.reaches("transactions.refunds.all", () -> client.transactions().refunds().all().create()
                .transactionId(Fixtures.MISSING_ID)
                .transactionRefundAllCreate(TransactionRefundAllCreate.builder().build())
                .call());
    }
}
