package com.gr4vy.sdk.processing;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.PaymentOptionRequest;
import com.gr4vy.sdk.models.components.PaymentServiceDefinitions;
import com.gr4vy.sdk.util.Fixtures;
import com.gr4vy.sdk.util.Harness;
import com.gr4vy.sdk.util.Reaches;

/**
 * E2E coverage for the read-only catalog endpoints: card scheme definitions,
 * payment options and payment service definitions (list/get/session).
 */
class CatalogTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void cardSchemeDefinitions() throws Exception {
        Gr4vy client = Harness.client();
        client.cardSchemeDefinitions().list().call();
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void paymentOptions() throws Exception {
        Gr4vy client = Harness.client();
        client.paymentOptions().list()
                .paymentOptionRequest(PaymentOptionRequest.builder()
                        .country("US")
                        .currency("USD")
                        .amount(1299L)
                        .cartItems(List.of(Fixtures.sampleCartItem()))
                        .metadata(Map.of("e2e", "1"))
                        .build())
                .call();
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void paymentServiceDefinitions() throws Exception {
        Gr4vy client = Harness.client();

        PaymentServiceDefinitions defs = client.paymentServiceDefinitions().list()
                .call()
                .paymentServiceDefinitions()
                .orElseThrow();

        String definitionId = null;
        if (defs.items() != null && !defs.items().isEmpty()) {
            definitionId = defs.items().get(0).id();
        }

        if (definitionId != null) {
            client.paymentServiceDefinitions().get()
                    .paymentServiceDefinitionId(definitionId)
                    .call();
        } else {
            Reaches.reaches("payment service definition get (missing)", () ->
                    client.paymentServiceDefinitions().get()
                            .paymentServiceDefinitionId(Fixtures.MISSING_ID)
                            .call());
        }

        final String sessionDefinitionId =
                definitionId != null ? definitionId : Fixtures.MISSING_ID;
        Reaches.reaches("payment service definition session", () ->
                client.paymentServiceDefinitions().session()
                        .paymentServiceDefinitionId(sessionDefinitionId)
                        .requestBody(Map.of())
                        .call());
    }
}
