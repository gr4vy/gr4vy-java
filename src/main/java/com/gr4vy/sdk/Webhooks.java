package com.gr4vy.sdk;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class Webhooks {

    public static String generateSignature(String secret, String timestamp, String payload) throws Exception {
        String data = timestamp + "." + payload;

        SecretKeySpec keySpec = new SecretKeySpec(secret.getBytes(StandardCharsets.UTF_8), "HmacSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(keySpec);

        byte[] hmacBytes = mac.doFinal(data.getBytes(StandardCharsets.UTF_8));

        // Convert to hex string
        StringBuilder hex = new StringBuilder();
        for (byte b : hmacBytes) {
            hex.append(String.format("%02x", b));
        }

        return hex.toString();
    }

    /** 
     * 
     * @param payload: The payload that was sent in the webhook.
     * @param secret: The secret that was used to sign the webhook.
     * @param signatureHeader: The header that contains the signature.
     * @param timestampTolerance: The tolerance for the timestamp in seconds.
     * @param timestampHeader: The header that contains the timestamp.
     * @throws IllegalArgumentException: If the signature or timestamp is invalid.
    */
    public static void verifyWebhook(String payload,
        String secret,
        String signatureHeader,
        int timestampTolerance,
        String timestampHeader
        ) {
        if(signatureHeader == null || timestampHeader == null)
            throw new IllegalArgumentException("Missing header values");

        long timestamp;
        try {
            timestamp = Long.parseLong(timestampHeader) * 1000; // Convert seconds to milliseconds
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid header timestamp");
        }

        long currentTimeMillis = System.currentTimeMillis(); // Standard Java way to get current time in ms
        long toleranceMillis = (long) timestampTolerance * 1000;
        long lowerBound = currentTimeMillis - toleranceMillis;
        if (timestampTolerance > 0 && timestamp < lowerBound) {
            throw new IllegalArgumentException("Timestamp too old");
        }

        List<String> signatures = Arrays.asList(signatureHeader.split(","));
        String expectedSignature = "";

        try {
            expectedSignature = generateSignature(secret, timestampHeader, payload);
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalArgumentException("Invalid secret");
        }

        if(!signatures.contains(expectedSignature)) {
            throw new IllegalArgumentException("No matching signature found");
        }
    }
    
    /** 
     * 
     * @param payload: The payload that was sent in the webhook.
     * @param secret: The secret that was used to sign the webhook.
     * @param signatureHeader: The header that contains the signature.
     * @param timestampTolerance: The tolerance for the timestamp in seconds.
     * @throws IllegalArgumentException: If the signature or timestamp is invalid.
    */
    public static void verifyWebhook(String payload,
                              String secret,
                              String signatureHeader,
                              int timestampTolerance
                              ) {
        verifyWebhook(payload, secret, signatureHeader, timestampTolerance, null);
    }
    
    /** 
     * 
     * @param payload: The payload that was sent in the webhook.
     * @param secret: The secret that was used to sign the webhook.
     * @param timestampTolerance: The tolerance for the timestamp in seconds.
     * @param timestampHeader: The header that contains the timestamp.
     * @throws IllegalArgumentException: If the signature or timestamp is invalid.
    */
    public static void verifyWebhook(String payload,
                              String secret,
                              int timestampTolerance,
                              String timestampHeader
                              ) {
        verifyWebhook(payload, secret, null, timestampTolerance, timestampHeader);
    }
    
    /** 
     * 
     * @param payload: The payload that was sent in the webhook.
     * @param secret: The secret that was used to sign the webhook.
     * @param timestampTolerance: The tolerance for the timestamp in seconds.
     * @throws IllegalArgumentException: If the signature or timestamp is invalid.
    */
    public static void verifyWebhook(String payload,
                              String secret,
                              int timestampTolerance
                              ) {
        verifyWebhook(payload, secret, null, timestampTolerance, null);
    }
}
