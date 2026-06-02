package com.gr4vy.sdk.processing;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.PaymentLink;
import com.gr4vy.sdk.models.components.PaymentLinkCreate;
import com.gr4vy.sdk.util.Fixtures;
import com.gr4vy.sdk.util.Harness;
import com.gr4vy.sdk.util.Reaches;

/**
 * E2E coverage for payment links: create/list/get/expire.
 */
class PaymentLinksTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void createListGetExpire() throws Exception {
        Gr4vy client = Harness.client();

        PaymentLink link = client.paymentLinks().create()
                .paymentLinkCreate(PaymentLinkCreate.builder()
                        .amount(1299L)
                        .currency("USD")
                        .country("US")
                        .cartItems(List.of(Fixtures.sampleCartItem()))
                        .build())
                .call()
                .paymentLink()
                .orElseThrow();

        client.paymentLinks().list().call();

        client.paymentLinks().get().paymentLinkId(link.id()).call();

        Reaches.reaches("expire payment link", () ->
                client.paymentLinks().expire().paymentLinkId(link.id()).call());
    }
}
