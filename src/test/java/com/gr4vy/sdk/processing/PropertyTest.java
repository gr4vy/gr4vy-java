package com.gr4vy.sdk.processing;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.Transaction;
import com.gr4vy.sdk.models.components.TransactionCreate;
import com.gr4vy.sdk.models.components.TransactionCreatePaymentMethod;
import com.gr4vy.sdk.util.Fixtures;
import com.gr4vy.sdk.util.Gen;
import com.gr4vy.sdk.util.Harness;

/**
 * Light property-style coverage: create a handful of transactions with
 * generated amounts and currencies and an approving card, asserting each
 * succeeds with a non-empty id.
 */
class PropertyTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void createTransactionsWithGeneratedInputs() throws Exception {
        Gr4vy client = Harness.client();
        Gen gen = new Gen();

        for (int i = 0; i < Gen.RUNS; i++) {
            long amount = gen.amount();
            String currency = gen.currency();

            Transaction t = client.transactions().create()
                    .transactionCreate(TransactionCreate.builder()
                            .amount(amount)
                            .currency(currency)
                            .country("US")
                            .paymentMethod(TransactionCreatePaymentMethod.of(Fixtures.approvingTransactionCard()))
                            .metadata(gen.metadata())
                            .build())
                    .call()
                    .transaction()
                    .orElseThrow();

            assertNotNull(t.id());
            assertFalse(t.id().isEmpty());
        }
    }
}
