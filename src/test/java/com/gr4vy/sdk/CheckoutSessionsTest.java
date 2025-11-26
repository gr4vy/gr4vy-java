package com.gr4vy.sdk;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.models.components.CardPaymentMethodCreate;
import com.gr4vy.sdk.models.components.CheckoutSession;
import com.gr4vy.sdk.models.components.CheckoutSessionCreate;
import com.gr4vy.sdk.models.components.CheckoutSessionWithUrlPaymentMethodCreate;
import com.gr4vy.sdk.models.components.PaymentMethod;
import com.gr4vy.sdk.models.components.Transaction;
import com.gr4vy.sdk.models.components.TransactionCreate;
import com.gr4vy.sdk.models.components.TransactionCreatePaymentMethod;
import com.gr4vy.sdk.models.components.TransactionStatus;
import com.gr4vy.sdk.models.operations.Body;
import com.gr4vy.sdk.models.operations.CreateCheckoutSessionResponse;
import com.gr4vy.sdk.models.operations.CreatePaymentMethodResponse;
import com.gr4vy.sdk.models.operations.CreateTransactionResponse;
import com.gr4vy.sdk.util.BaseTest;

import static org.junit.jupiter.api.Assertions.*;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import org.junit.jupiter.api.BeforeEach;

public class CheckoutSessionsTest extends BaseTest {

    @BeforeEach
    void prepareGr4vyClient() throws Exception {
        setupEnvironment();
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void testProcessPaymentWithCheckoutSession() throws Exception {
        // Create a checkout session
        CreateCheckoutSessionResponse checkoutSessionResponse = gr4vyClient.checkoutSessions().create()
                .checkoutSessionCreate(CheckoutSessionCreate.builder()
                    .build())
                .call();

        CheckoutSession checkoutSession = checkoutSessionResponse.checkoutSession().orElse(null);
        assertNotNull(checkoutSession, "Checkout session cannot be null");
        assertNotNull(checkoutSession.id(), "Checkout session Id cannot be null");
        assertNotEquals(checkoutSession.id(), "");

        //Direct API call to update checkout session fields
        String url = String.format("https://api.sandbox.e2e.gr4vy.app/checkout/sessions/%s/fields", checkoutSession.id());
        String jsonBody = "{" +
                        "     \"payment_method\": {" +
                        "        \"method\": \"card\"," +
                        "        \"number\": \"4111111111111111\"," +
                        "        \"expiration_date\": \"11/25\"," +
                        "        \"security_code\": \"123\"" + 
                        "     }" +
                        "  }";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .PUT(BodyPublishers.ofString(jsonBody))
            .header("Content-Type", "application/json")
            .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        assertEquals(response.statusCode(), 204);

        // Create a transaction using the checkout session
        CreateTransactionResponse transactionResponse = gr4vyClient.transactions().create()
                .transactionCreate(TransactionCreate.builder()
                    .amount(1299L)
                    .currency("USD")
                    .paymentMethod(TransactionCreatePaymentMethod.of(CheckoutSessionWithUrlPaymentMethodCreate.builder()
                        .id(checkoutSession.id())
                        .build()))
                    .build())
                .call();

        Transaction transaction = transactionResponse.transaction().orElse(null);
        assertNotNull(transaction, "Transaction cannot be null");
        assertNotNull(transaction.id(), "Transaction Id cannot be null");
        assertNotEquals(transaction.id(), "");
        assertEquals(transaction.status(), TransactionStatus.AUTHORIZATION_SUCCEEDED);
        assertEquals(transaction.amount(), 1299);
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void testHandleErrorOnMissingCardData() throws Exception {
        // Create a checkout session
        CreateCheckoutSessionResponse checkoutSessionResponse = gr4vyClient.checkoutSessions().create()
                .checkoutSessionCreate(CheckoutSessionCreate.builder()
                    .build())
                .call();

        CheckoutSession checkoutSession = checkoutSessionResponse.checkoutSession().orElse(null);
        assertNotNull(checkoutSession, "Checkout session cannot be null");
        assertNotNull(checkoutSession.id(), "Checkout session Id cannot be null");
        assertNotEquals(checkoutSession.id(), "");

        // Attempt to create a transaction with missing card data
        Exception thrown = assertThrows(Exception.class, () -> {
            gr4vyClient.transactions().create()
                    .transactionCreate(TransactionCreate.builder()
                        .amount(1299L)
                        .currency("USD")
                        .paymentMethod(TransactionCreatePaymentMethod.of(CheckoutSessionWithUrlPaymentMethodCreate.builder()
                            .id(checkoutSession.id())
                            .build()))
                        .build())
                    .call();
        }, "Exception was expected but not thrown");
        assertTrue(thrown.getMessage().contains("API error occurred"));
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void testHandleStoredPaymentMethod() throws Exception {
        // Create a card payment method
        CreatePaymentMethodResponse createPaymentMethodResponse = gr4vyClient.paymentMethods().create()
                .requestBody(Body.of(CardPaymentMethodCreate.builder()
                    .number("4111111111111111")
                    .expirationDate("12/34")
                    .securityCode("123")
                    .build()))
                .call();

        PaymentMethod paymentMethod = createPaymentMethodResponse.paymentMethod().orElse(null);
        assertNotNull(paymentMethod, "Payment method cannot be null");
        assertNotNull(paymentMethod.id(), "Payment method Id cannot be null");
        assertNotEquals(paymentMethod.id(), "");

        // Create a checkout session
        CreateCheckoutSessionResponse checkoutSessionResponse = gr4vyClient.checkoutSessions().create()
                .checkoutSessionCreate(CheckoutSessionCreate.builder()
                    .build())
                .call();

        CheckoutSession checkoutSession = checkoutSessionResponse.checkoutSession().orElse(null);
        assertNotNull(checkoutSession, "Checkout session cannot be null");
        assertNotNull(checkoutSession.id(), "Checkout session Id cannot be null");
        assertNotEquals(checkoutSession.id(), "");

        //Direct API call to update checkout session fields
        String url = String.format("https://api.sandbox.e2e.gr4vy.app/checkout/sessions/%s/fields", checkoutSession.id());
        String jsonBody = "{" + //
                        "     \"payment_method\": {" + 
                        "         \"method\": \"id\"," +
                        "         \"id\": \"" + paymentMethod.id() + "\"," +
                        "         \"security_code\": \"123\"" +
                        "       }" + 
                        "  }";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(url))
            .PUT(BodyPublishers.ofString(jsonBody))
            .header("Content-Type", "application/json")
            .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        assertEquals(response.statusCode(), 204);

        // Create a transaction using the checkout session
        CreateTransactionResponse transactionResponse = gr4vyClient.transactions().create()
                .transactionCreate(TransactionCreate.builder()
                    .amount(1299L)
                    .currency("USD")
                    .paymentMethod(TransactionCreatePaymentMethod.of(CheckoutSessionWithUrlPaymentMethodCreate.builder()
                        .id(checkoutSession.id())
                        .build()))
                    .build())
                .call();

        Transaction transaction = transactionResponse.transaction().orElse(null);
        assertNotNull(transaction, "Transaction cannot be null");
        assertNotNull(transaction.id(), "Transaction Id cannot be null");
        assertNotEquals(transaction.id(), "");
        assertEquals(transaction.status(), TransactionStatus.AUTHORIZATION_SUCCEEDED);
        assertEquals(transaction.amount(), 1299);
    }
}
