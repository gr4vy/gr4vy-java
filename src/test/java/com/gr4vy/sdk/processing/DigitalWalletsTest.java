package com.gr4vy.sdk.processing;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.ApplePaySessionRequest;
import com.gr4vy.sdk.models.components.ClickToPaySessionRequest;
import com.gr4vy.sdk.models.components.DigitalWalletCreate;
import com.gr4vy.sdk.models.components.DigitalWalletDomain;
import com.gr4vy.sdk.models.components.DigitalWalletProvider;
import com.gr4vy.sdk.models.components.DigitalWalletUpdate;
import com.gr4vy.sdk.models.components.GooglePaySessionRequest;
import com.gr4vy.sdk.util.Fixtures;
import com.gr4vy.sdk.util.Harness;
import com.gr4vy.sdk.util.Reaches;

/**
 * E2E coverage for digital wallets. The mock environment has no real wallet
 * registration, so create/get/update/delete, the wallet sessions and the
 * domain register/unregister calls are all exercised via {@link Reaches}.
 * The list call is a plain successful request.
 */
class DigitalWalletsTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void createListGetUpdateDelete() throws Exception {
        Gr4vy client = Harness.client();

        Reaches.reaches("digital wallet create", () ->
                client.digitalWallets().create()
                        .digitalWalletCreate(DigitalWalletCreate.builder()
                                .provider(DigitalWalletProvider.APPLE)
                                .merchantName("E2E Merchant")
                                .acceptTermsAndConditions(true)
                                .build())
                        .call());

        client.digitalWallets().list().call();

        Reaches.reaches("digital wallet get (missing)", () ->
                client.digitalWallets().get().digitalWalletId(Fixtures.MISSING_ID).call());

        Reaches.reaches("digital wallet update (missing)", () ->
                client.digitalWallets().update()
                        .digitalWalletId(Fixtures.MISSING_ID)
                        .digitalWalletUpdate(DigitalWalletUpdate.builder()
                                .merchantDisplayName("E2E Updated")
                                .build())
                        .call());

        Reaches.reaches("digital wallet delete (missing)", () ->
                client.digitalWallets().delete().digitalWalletId(Fixtures.MISSING_ID).call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void sessions() {
        Gr4vy client = Harness.client();

        Reaches.reaches("google pay session", () ->
                client.digitalWallets().sessions().googlePay()
                        .googlePaySessionRequest(GooglePaySessionRequest.builder()
                                .originDomain("example.com")
                                .build())
                        .call());

        Reaches.reaches("apple pay session", () ->
                client.digitalWallets().sessions().applePay()
                        .applePaySessionRequest(ApplePaySessionRequest.builder()
                                .validationUrl("https://apple-pay-gateway.apple.com/paymentservices/startSession")
                                .domainName("example.com")
                                .build())
                        .call());

        Reaches.reaches("click to pay session", () ->
                client.digitalWallets().sessions().clickToPay()
                        .request(ClickToPaySessionRequest.builder()
                                .checkoutSessionId(Fixtures.MISSING_ID)
                                .build())
                        .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void domains() {
        Gr4vy client = Harness.client();

        Reaches.reaches("register digital wallet domain", () ->
                client.digitalWallets().domains().create()
                        .digitalWalletId(Fixtures.MISSING_ID)
                        .digitalWalletDomain(DigitalWalletDomain.builder()
                                .domainName("example.com")
                                .build())
                        .call());

        Reaches.reaches("unregister digital wallet domain", () ->
                client.digitalWallets().domains().delete()
                        .digitalWalletId(Fixtures.MISSING_ID)
                        .digitalWalletDomain(DigitalWalletDomain.builder()
                                .domainName("example.com")
                                .build())
                        .call());
    }
}
