package com.gr4vy.sdk.processing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.GiftCardBalanceRequest;
import com.gr4vy.sdk.util.Harness;
import com.gr4vy.sdk.util.Reaches;

/**
 * Reach coverage for the gift-card balance lookup (POST /gift-cards/balances).
 * The mock has no gift-card data, so the lookup is exercised via {@link Reaches}.
 */
class GiftCardBalancesTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void balancesList() {
        Gr4vy client = Harness.client();
        Reaches.reaches("gift_cards.balances.list", () -> client.giftCards().balances().list()
                .giftCardBalanceRequest(GiftCardBalanceRequest.builder().build())
                .call());
    }
}
