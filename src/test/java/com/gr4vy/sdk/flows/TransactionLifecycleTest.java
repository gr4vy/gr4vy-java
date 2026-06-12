package com.gr4vy.sdk.flows;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.Capture;
import com.gr4vy.sdk.models.components.CaptureCollection;
import com.gr4vy.sdk.models.components.CheckoutSession;
import com.gr4vy.sdk.models.components.CheckoutSessionCreate;
import com.gr4vy.sdk.models.components.CheckoutSessionWithUrlPaymentMethodCreate;
import com.gr4vy.sdk.models.components.PaymentMethod;
import com.gr4vy.sdk.models.components.Transaction;
import com.gr4vy.sdk.models.components.TransactionCaptureCreate;
import com.gr4vy.sdk.models.components.TransactionCreate;
import com.gr4vy.sdk.models.components.TransactionCreatePaymentMethod;
import com.gr4vy.sdk.models.components.TransactionEvents;
import com.gr4vy.sdk.models.components.TransactionStatus;
import com.gr4vy.sdk.models.operations.Body;
import com.gr4vy.sdk.models.operations.CaptureTransactionRequest;
import com.gr4vy.sdk.models.operations.CaptureTransactionResponse;
import com.gr4vy.sdk.models.operations.CreateCheckoutSessionResponse;
import com.gr4vy.sdk.models.operations.CreatePaymentMethodResponse;
import com.gr4vy.sdk.models.operations.CreateTransactionResponse;
import com.gr4vy.sdk.models.operations.GetTransactionCaptureResponse;
import com.gr4vy.sdk.models.operations.GetTransactionResponse;
import com.gr4vy.sdk.models.operations.ListTransactionCapturesResponse;
import com.gr4vy.sdk.models.operations.ListTransactionEventsResponse;
import com.gr4vy.sdk.util.Checkout;
import com.gr4vy.sdk.util.Fixtures;
import com.gr4vy.sdk.util.Harness;

/**
 * Full happy-path lifecycle for a card transaction processed via a checkout
 * session: store a card as a payment method, secure it into a checkout session,
 * authorise a transaction against that session, capture it, then read the
 * transaction back and list its events.
 */
class TransactionLifecycleTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void transactionLifecycle() throws Exception {
        Gr4vy client = Harness.client();

        // 1. Store a card as a reusable payment method.
        CreatePaymentMethodResponse pmRes = client.paymentMethods().create()
                .requestBody(Body.of(Fixtures.approvingCard()))
                .call();
        PaymentMethod method = pmRes.paymentMethod().orElseThrow();
        String methodId = method.id();
        assertNotNull(methodId, "stored payment method should have an id");

        // 2. Create a checkout session and secure the stored method into it.
        CreateCheckoutSessionResponse csRes = client.checkoutSessions().create()
                .checkoutSessionCreate(CheckoutSessionCreate.builder().build())
                .call();
        CheckoutSession session = csRes.checkoutSession().orElseThrow();
        String sid = session.id();
        assertNotNull(sid, "checkout session should have an id");

        Checkout.putStoredMethod(sid, methodId);

        // 3. Authorise a transaction that references the checkout session.
        long amount = 1299L;
        CreateTransactionResponse txRes = client.transactions().create()
                .transactionCreate(TransactionCreate.builder()
                        .amount(amount)
                        .currency("USD")
                        .paymentMethod(TransactionCreatePaymentMethod.of(
                                CheckoutSessionWithUrlPaymentMethodCreate.builder()
                                        .id(sid)
                                        .build()))
                        .build())
                .call();
        Transaction tx = txRes.transaction().orElseThrow();
        String txId = tx.id();
        assertNotNull(txId, "transaction should have an id");
        assertEquals(TransactionStatus.AUTHORIZATION_SUCCEEDED, tx.status());
        assertEquals(amount, tx.amount());
        assertEquals("USD", tx.currency());

        // 4. Capture the authorised transaction for the full amount.
        CaptureTransactionResponse capRes = client.transactions().capture()
                .request(CaptureTransactionRequest.builder()
                        .transactionId(txId)
                        .transactionCaptureCreate(TransactionCaptureCreate.builder()
                                .amount(amount)
                                .build())
                        .build())
                .call();
        assertTrue(capRes.response200CaptureTransaction().isPresent(),
                "capture should return a 200 body");

        // 5. Read the transaction back.
        GetTransactionResponse getRes = client.transactions().get()
                .transactionId(txId)
                .call();
        Transaction fetched = getRes.transaction().orElseThrow();
        assertEquals(txId, fetched.id());
        assertEquals(amount, fetched.amount());

        // 6. List the transaction's events; capture should have produced some.
        ListTransactionEventsResponse evRes = client.transactions().events().list()
                .transactionId(txId)
                .call();
        TransactionEvents events = evRes.transactionEvents().orElseThrow();
        assertNotNull(events.items());
        assertFalse(events.items().isEmpty(), "an authorised+captured transaction should have events");
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void captureListAndGet() throws Exception {
        Gr4vy client = Harness.client();

        // Authorize via a checkout session.
        CreateCheckoutSessionResponse csRes = client.checkoutSessions().create()
                .checkoutSessionCreate(CheckoutSessionCreate.builder().build())
                .call();
        CheckoutSession session = csRes.checkoutSession().orElseThrow();
        Checkout.putCard(session.id());

        long amount = 4500L;
        CreateTransactionResponse txRes = client.transactions().create()
                .transactionCreate(TransactionCreate.builder()
                        .amount(amount)
                        .currency("USD")
                        .paymentMethod(TransactionCreatePaymentMethod.of(
                                CheckoutSessionWithUrlPaymentMethodCreate.builder()
                                        .id(session.id())
                                        .build()))
                        .build())
                .call();
        Transaction tx = txRes.transaction().orElseThrow();
        assertEquals(TransactionStatus.AUTHORIZATION_SUCCEEDED, tx.status());

        // Capture the transaction.
        client.transactions().capture()
                .request(CaptureTransactionRequest.builder()
                        .transactionId(tx.id())
                        .transactionCaptureCreate(TransactionCaptureCreate.builder()
                                .amount(amount)
                                .build())
                        .build())
                .call();

        // Poll until the capture appears (eventually consistent).
        long deadline = System.currentTimeMillis() + 30_000;
        CaptureCollection collection = null;
        while (System.currentTimeMillis() < deadline) {
            ListTransactionCapturesResponse listRes = client.transactions().captures().list()
                    .transactionId(tx.id())
                    .call();
            List<Capture> items = listRes.captureCollection()
                    .map(CaptureCollection::items)
                    .orElse(List.of());
            if (!items.isEmpty()) {
                collection = listRes.captureCollection().orElseThrow();
                break;
            }
            Thread.sleep(2_000);
        }
        assertNotNull(collection, "capture should appear in list within 30s");
        assertFalse(collection.items().isEmpty(), "capture list should have at least one item");

        String captureId = collection.items().get(0).id();
        assertNotNull(captureId, "capture should have an id");

        // Fetch the individual capture.
        GetTransactionCaptureResponse getRes = client.transactions().captures().get()
                .transactionId(tx.id())
                .captureId(captureId)
                .call();
        Capture fetched = getRes.capture().orElseThrow();
        assertEquals(captureId, fetched.id());
    }
}
