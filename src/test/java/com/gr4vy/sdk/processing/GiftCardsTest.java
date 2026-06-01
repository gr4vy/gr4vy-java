package com.gr4vy.sdk.processing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.GiftCardCreate;
import com.gr4vy.sdk.util.Fixtures;
import com.gr4vy.sdk.util.Harness;
import com.gr4vy.sdk.util.Reaches;

/**
 * E2E coverage for gift cards. The mock environment has no real gift-card
 * provider, so create/get/delete are exercised via {@link Reaches}; list is a
 * plain successful call.
 */
class GiftCardsTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void createListGetDelete() throws Exception {
        Gr4vy client = Harness.client();

        Reaches.reaches("gift card create", () ->
                client.giftCards().create()
                        .giftCardCreate(GiftCardCreate.builder()
                                .number("4111111111111111")
                                .pin("1234")
                                .build())
                        .call());

        client.giftCards().list().call();

        Reaches.reaches("gift card get (missing)", () ->
                client.giftCards().get().giftCardId(Fixtures.MISSING_ID).call());

        Reaches.reaches("gift card delete (missing)", () ->
                client.giftCards().delete().giftCardId(Fixtures.MISSING_ID).call());
    }
}
