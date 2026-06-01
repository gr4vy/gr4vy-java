package com.gr4vy.sdk.processing;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.CryptogramCreate;
import com.gr4vy.sdk.models.components.NetworkTokenCreate;
import com.gr4vy.sdk.models.components.PaymentMethod;
import com.gr4vy.sdk.models.components.PaymentMethodUpdate;
import com.gr4vy.sdk.models.components.PaymentServiceTokenCreate;
import com.gr4vy.sdk.models.operations.Body;
import com.gr4vy.sdk.models.operations.CreatePaymentMethodResponse;
import com.gr4vy.sdk.util.Fixtures;
import com.gr4vy.sdk.util.Harness;
import com.gr4vy.sdk.util.Reaches;

/**
 * E2E coverage for payment methods: create/get/update/list/delete and the
 * network-token, cryptogram and payment-service-token sub-resources (all of
 * which the deterministic mock cannot satisfy, so they are reach-only).
 */
class PaymentMethodsTest {

    private static String storeCard(Gr4vy client) throws Exception {
        CreatePaymentMethodResponse res = client.paymentMethods().create()
                .requestBody(Body.of(Fixtures.approvingCard()))
                .call();
        PaymentMethod pm = res.paymentMethod().orElseThrow();
        String id = pm.id();
        assertNotNull(id);
        assertFalse(id.isEmpty());
        return id;
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void createGetUpdateListDelete() throws Exception {
        Gr4vy client = Harness.client();

        String id = storeCard(client);

        client.paymentMethods().get().paymentMethodId(id).call();

        client.paymentMethods().update()
                .paymentMethodId(id)
                .paymentMethodUpdate(PaymentMethodUpdate.builder()
                        .expirationDate(Fixtures.CARD_EXPIRATION_DATE)
                        .build())
                .call();

        client.paymentMethods().list().call();

        client.paymentMethods().delete().paymentMethodId(id).call();
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void networkTokens() throws Exception {
        Gr4vy client = Harness.client();
        String id = storeCard(client);

        Reaches.reaches("network tokens list", () ->
                client.paymentMethods().networkTokens().list().paymentMethodId(id).call());

        Reaches.reaches("network token create", () ->
                client.paymentMethods().networkTokens().create()
                        .paymentMethodId(id)
                        .networkTokenCreate(NetworkTokenCreate.builder()
                                .merchantInitiated(false)
                                .isSubsequentPayment(false)
                                .build())
                        .call());

        Reaches.reaches("network token suspend", () ->
                client.paymentMethods().networkTokens().suspend()
                        .paymentMethodId(id)
                        .networkTokenId(Fixtures.MISSING_ID)
                        .call());

        Reaches.reaches("network token resume", () ->
                client.paymentMethods().networkTokens().resume()
                        .paymentMethodId(id)
                        .networkTokenId(Fixtures.MISSING_ID)
                        .call());

        Reaches.reaches("network token delete", () ->
                client.paymentMethods().networkTokens().delete()
                        .paymentMethodId(id)
                        .networkTokenId(Fixtures.MISSING_ID)
                        .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void networkTokenCryptogram() throws Exception {
        Gr4vy client = Harness.client();
        String id = storeCard(client);

        Reaches.reaches("network token cryptogram create", () ->
                client.paymentMethods().networkTokens().cryptogram().create()
                        .paymentMethodId(id)
                        .networkTokenId(Fixtures.MISSING_ID)
                        .cryptogramCreate(CryptogramCreate.builder()
                                .merchantInitiated(false)
                                .build())
                        .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void paymentServiceTokens() throws Exception {
        Gr4vy client = Harness.client();
        String id = storeCard(client);

        Reaches.reaches("payment service tokens list", () ->
                client.paymentMethods().paymentServiceTokens().list().paymentMethodId(id).call());

        Reaches.reaches("payment service token create", () ->
                client.paymentMethods().paymentServiceTokens().create()
                        .paymentMethodId(id)
                        .paymentServiceTokenCreate(PaymentServiceTokenCreate.builder()
                                .paymentServiceId(Fixtures.MISSING_ID)
                                .redirectUrl("https://example.com/return")
                                .build())
                        .call());

        Reaches.reaches("payment service token delete", () ->
                client.paymentMethods().paymentServiceTokens().delete()
                        .paymentMethodId(id)
                        .paymentServiceTokenId(Fixtures.MISSING_ID)
                        .call());
    }
}
