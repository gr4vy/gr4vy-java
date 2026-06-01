package com.gr4vy.sdk.processing;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.TransactionCaptureCreate;
import com.gr4vy.sdk.models.components.TransactionCreate;
import com.gr4vy.sdk.models.components.TransactionCreatePaymentMethod;
import com.gr4vy.sdk.models.components.TransactionIntent;
import com.gr4vy.sdk.models.components.TransactionRefundCreate;
import com.gr4vy.sdk.models.components.TransactionUpdate;
import com.gr4vy.sdk.models.operations.CaptureTransactionRequest;
import com.gr4vy.sdk.models.operations.CreateTransactionResponse;
import com.gr4vy.sdk.models.components.Transaction;
import com.gr4vy.sdk.util.Fixtures;
import com.gr4vy.sdk.util.Harness;
import com.gr4vy.sdk.util.Reaches;

/**
 * E2E coverage for the transactions endpoint family: create/get/update/list,
 * capture/cancel/sync, plus the events, actions, settlements and refunds
 * sub-resources and the top-level refunds lookup.
 */
class TransactionsTest {

    private static Transaction createApprovedTransaction(Gr4vy client) throws Exception {
        CreateTransactionResponse res = client.transactions().create()
                .transactionCreate(TransactionCreate.builder()
                        .amount(1299L)
                        .currency("USD")
                        .paymentMethod(TransactionCreatePaymentMethod.of(Fixtures.approvingTransactionCard()))
                        .build())
                .call();
        return res.transaction().orElseThrow();
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void createGetUpdateList() throws Exception {
        Gr4vy client = Harness.client();

        Transaction t = createApprovedTransaction(client);
        String id = t.id();
        assertNotNull(id);
        assertFalse(id.isEmpty());

        client.transactions().get().transactionId(id).call();

        client.transactions().update()
                .transactionId(id)
                .transactionUpdate(TransactionUpdate.builder()
                        .metadata(Map.of("e2e", "1"))
                        .build())
                .call();

        client.transactions().list().call();
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void captureAuthorizeOnly() throws Exception {
        Gr4vy client = Harness.client();

        CreateTransactionResponse res = client.transactions().create()
                .transactionCreate(TransactionCreate.builder()
                        .amount(1299L)
                        .currency("USD")
                        .intent(TransactionIntent.AUTHORIZE)
                        .paymentMethod(TransactionCreatePaymentMethod.of(Fixtures.approvingTransactionCard()))
                        .build())
                .call();
        String id = res.transaction().orElseThrow().id();

        Reaches.reaches("capture transaction", () ->
                client.transactions().capture()
                        .request(CaptureTransactionRequest.builder()
                                .transactionId(id)
                                .transactionCaptureCreate(TransactionCaptureCreate.builder()
                                        .amount(1299L)
                                        .build())
                                .build())
                        .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void cancel() throws Exception {
        Gr4vy client = Harness.client();
        CreateTransactionResponse res = client.transactions().create()
                .transactionCreate(TransactionCreate.builder()
                        .amount(1299L)
                        .currency("USD")
                        .intent(TransactionIntent.AUTHORIZE)
                        .paymentMethod(TransactionCreatePaymentMethod.of(Fixtures.approvingTransactionCard()))
                        .build())
                .call();
        String id = res.transaction().orElseThrow().id();

        Reaches.reaches("cancel transaction", () ->
                client.transactions().cancel().transactionId(id).call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void sync() throws Exception {
        Gr4vy client = Harness.client();
        Transaction t = createApprovedTransaction(client);

        Reaches.reaches("sync transaction", () ->
                client.transactions().sync().transactionId(t.id()).call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void eventsAndActions() throws Exception {
        Gr4vy client = Harness.client();
        Transaction t = createApprovedTransaction(client);

        client.transactions().events().list().transactionId(t.id()).call();
        client.transactions().actions().list().transactionId(t.id()).call();
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void settlements() throws Exception {
        Gr4vy client = Harness.client();
        Transaction t = createApprovedTransaction(client);

        client.transactions().settlements().list().transactionId(t.id()).call();

        Reaches.reaches("get transaction settlement (missing)", () ->
                client.transactions().settlements().get()
                        .transactionId(t.id())
                        .settlementId(Fixtures.MISSING_ID)
                        .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void refunds() throws Exception {
        Gr4vy client = Harness.client();
        Transaction t = createApprovedTransaction(client);

        client.transactions().refunds().list().transactionId(t.id()).call();

        Reaches.reaches("create transaction refund", () ->
                client.transactions().refunds().create()
                        .transactionId(t.id())
                        .transactionRefundCreate(TransactionRefundCreate.builder()
                                .amount(100L)
                                .build())
                        .call());

        Reaches.reaches("get transaction refund (missing)", () ->
                client.transactions().refunds().get()
                        .transactionId(t.id())
                        .refundId(Fixtures.MISSING_ID)
                        .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void topLevelRefundGet() {
        Gr4vy client = Harness.client();

        Reaches.reaches("top-level refund get (missing)", () ->
                client.refunds().get().refundId(Fixtures.MISSING_ID).call());
    }
}
