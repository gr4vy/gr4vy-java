package com.gr4vy.sdk;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class WebhooksTest {
    private final String secret = "Ik4L-8FH0ihWczctcIPXZRR_8F0fPNgmhEfVBbZ3zNwqQVa1Or4tBz4Pgw2eNaVDod7H56Y268h_wohEUaWbUg";
    private final String signatureHeader = "78aca0c78005107a654a957b8566fa6e0e5e06aea92d7da72a6da9e5a690d013,other";
    private final String timestampHeader = "1744018920";
    private final String payload = "payload";
    private final int timestampTolerance = 0;

    @Test
    void testVerifyWebhookSignature() {
        // Should not raise any exceptions
        assertDoesNotThrow(() -> Webhooks.verifyWebhook(payload, secret, signatureHeader, timestampTolerance, timestampHeader), "verifyWebhook should not throw any exception");
    }

    @Test
    void testVerifyWebhookOldTimestamp() {
        int newTimestampTolerance = 60;

        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class,
            () -> Webhooks.verifyWebhook(payload, secret, signatureHeader, newTimestampTolerance, timestampHeader)
        );

        assertEquals(thrown.getMessage(), "Timestamp too old");
    }

    @Test
    void testVerifyWebhookWrongSignature() {
        String wrongSignatureHeader = "Wrong header";

        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class,
            () -> Webhooks.verifyWebhook(payload, secret, wrongSignatureHeader, timestampTolerance, timestampHeader)
        );

        assertEquals(thrown.getMessage(), "No matching signature found");
    }

    @Test
    void testVerifyWebhookInvalidTimestamp() {
        String wrongTimestampHeader = "Wrong";

        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class,
            () -> Webhooks.verifyWebhook(payload, secret, signatureHeader, timestampTolerance, wrongTimestampHeader)
        );

        assertEquals(thrown.getMessage(), "Invalid header timestamp");
    }

    @Test
    void testVerifyWebhookMissingSignatureHeader() {
        String wrongSignatureHeader = null;

        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class,
            () -> Webhooks.verifyWebhook(payload, secret, wrongSignatureHeader, timestampTolerance, timestampHeader)
        );

        assertEquals(thrown.getMessage(), "Missing header values");
    }

    @Test
    void testVerifyWebhookMissingTimestampHeader() {
        String wrongTimestampHeader = null;

        IllegalArgumentException thrown = assertThrows(
            IllegalArgumentException.class,
            () -> Webhooks.verifyWebhook(payload, secret, signatureHeader, timestampTolerance, wrongTimestampHeader)
        );

        assertEquals(thrown.getMessage(), "Missing header values");
    }
}
