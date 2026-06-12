package com.gr4vy.sdk.processing;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

import com.gr4vy.sdk.Gr4vy;
import com.gr4vy.sdk.models.components.Intent;
import com.gr4vy.sdk.models.components.PazeClient;
import com.gr4vy.sdk.models.components.PazeMobileSessionCreateRequest;
import com.gr4vy.sdk.models.components.PazeMobileSessionCreateRequestBillingPreference;
import com.gr4vy.sdk.models.components.PazeMobileSessionCreateRequestTransactionType;
import com.gr4vy.sdk.models.components.PazeSessionCompleteRequest;
import com.gr4vy.sdk.models.components.PazeSessionCompleteRequestTransactiontype;
import com.gr4vy.sdk.models.components.PazeSessionRequest;
import com.gr4vy.sdk.models.components.PazeSessionReviewRequest;
import com.gr4vy.sdk.models.components.PazeTransactionValue;
import com.gr4vy.sdk.models.components.ShippingPreference;
import com.gr4vy.sdk.util.Harness;
import com.gr4vy.sdk.util.Reaches;

/**
 * Reach coverage for the Paze digital-wallet session endpoints. The mock
 * environment has no Paze provider, so these are exercised via {@link Reaches}:
 * the SDK builds a well-formed request and the API routes and rejects it.
 */
class PazeSessionsTest {

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void paze() {
        Gr4vy client = Harness.client();
        Reaches.reaches("digital_wallets.sessions.paze", () -> client.digitalWallets().sessions().paze()
                .pazeSessionRequest(PazeSessionRequest.builder()
                        .domainName("example.com")
                        .build())
                .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void pazeMobileSessionCreate() {
        Gr4vy client = Harness.client();
        Reaches.reaches("digital_wallets.sessions.paze_mobile.create", () ->
                client.digitalWallets().sessions().pazeMobileSessionCreate()
                        .pazeMobileSessionCreateRequest(PazeMobileSessionCreateRequest.builder()
                                .client(PazeClient.builder()
                                        .id("e2e")
                                        .name("e2e")
                                        .profileId("e2e")
                                        .build())
                                .sessionId("e2e")
                                .accessToken("e2e")
                                .callbackURLScheme("e2e")
                                .intent(Intent.REVIEW_AND_PAY)
                                .transactionValue(PazeTransactionValue.builder()
                                        .transactionCurrency("USD")
                                        .transactionAmount("1299")
                                        .build())
                                .transactionType(PazeMobileSessionCreateRequestTransactionType.PURCHASE)
                                .shippingPreference(ShippingPreference.ALL)
                                .billingPreference(PazeMobileSessionCreateRequestBillingPreference.ALL)
                                .emailAddress("jane.doe@example.com")
                                .phoneNumber("+15555550100")
                                .cobrand(List.of())
                                .acceptedShippingCountries(List.of())
                                .acceptedPaymentCardNetworks(List.of())
                                .alwaysEnableCheckout(false)
                                .build())
                        .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void pazeMobileSessionReview() {
        Gr4vy client = Harness.client();
        Reaches.reaches("digital_wallets.sessions.paze_mobile.review", () ->
                client.digitalWallets().sessions().pazeMobileSessionReview()
                        .pazeSessionReviewRequest(PazeSessionReviewRequest.builder()
                                .sessionId("e2e")
                                .code("e2e")
                                .accessToken("e2e")
                                .build())
                        .call());
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "E2E", matches = "true")
    void pazeMobileSessionComplete() {
        Gr4vy client = Harness.client();
        Reaches.reaches("digital_wallets.sessions.paze_mobile.complete", () ->
                client.digitalWallets().sessions().pazeMobileSessionComplete()
                        .pazeSessionCompleteRequest(PazeSessionCompleteRequest.builder()
                                .sessionId("e2e")
                                .code("e2e")
                                .accessToken("e2e")
                                .transactionType(PazeSessionCompleteRequestTransactiontype.PURCHASE)
                                .build())
                        .call());
    }
}
