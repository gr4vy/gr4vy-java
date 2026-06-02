package com.gr4vy.sdk.util;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import java.net.http.HttpResponse;
import java.time.Duration;

/**
 * Helpers for the checkout-session field PUT, which the SDK does not model and
 * which is authenticated by the session id itself (no bearer token).
 */
public final class Checkout {

    private Checkout() {}

    public static final String API_BASE_URL = "https://api.sandbox.e2e.gr4vy.app";

    /** Secures the approving card into a checkout session. Asserts 204. */
    public static void putCard(String sessionId) throws Exception {
        String body = "{"
                + "\"payment_method\": {"
                + "\"method\": \"card\","
                + "\"number\": \"" + Fixtures.APPROVING_CARD_NUMBER + "\","
                + "\"expiration_date\": \"" + Fixtures.CARD_EXPIRATION_DATE + "\","
                + "\"security_code\": \"" + Fixtures.CARD_SECURITY_CODE + "\""
                + "}}";
        putFields(sessionId, body);
    }

    /** Secures a previously stored payment method into a checkout session. Asserts 204. */
    public static void putStoredMethod(String sessionId, String paymentMethodId) throws Exception {
        String body = "{"
                + "\"payment_method\": {"
                + "\"method\": \"id\","
                + "\"id\": \"" + paymentMethodId + "\","
                + "\"security_code\": \"" + Fixtures.CARD_SECURITY_CODE + "\""
                + "}}";
        putFields(sessionId, body);
    }

    private static void putFields(String sessionId, String jsonBody) throws Exception {
        String url = String.format("%s/checkout/sessions/%s/fields", API_BASE_URL, sessionId);
        HttpClient client = HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(20))
                .build();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .timeout(Duration.ofSeconds(30))
                .PUT(BodyPublishers.ofString(jsonBody))
                .header("Content-Type", "application/json")
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 204) {
            throw new IllegalStateException(
                    "checkout-session field PUT expected 204 but got " + response.statusCode()
                            + ": " + response.body());
        }
    }
}
