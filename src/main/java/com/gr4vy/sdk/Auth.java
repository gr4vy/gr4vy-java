package com.gr4vy.sdk;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.time.Instant;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;

public class Auth {

    public enum JWTScope {
        READ_ALL("*.read"),
        WRITE_ALL("*.write"),
        EMBED("embed"),
        ANTI_FRAUD_SERVICE_DEFINITIONS_READ("anti-fraud-service-definitions.read"),
        ANTI_FRAUD_SERVICE_DEFINITIONS_WRITE("anti-fraud-service-definitions.write"),
        ANTI_FRAUD_SERVICES_READ("anti-fraud-services.read"),
        ANTI_FRAUD_SERVICES_WRITE("anti-fraud-services.write"),
        AUDIT_LOGS_READ("audit-logs.read"),
        BUYERS_READ("buyers.read"),
        BUYERS_WRITE("buyers.write"),
        BUYERS_BILLING_DETAILS_READ("buyers.billing-details.read"),
        BUYERS_BILLING_DETAILS_WRITE("buyers.billing-details.write"),
        CARD_SCHEME_DEFINITIONS_READ("card-scheme-definitions.read"),
        CHECKOUT_SESSIONS_READ("checkout-sessions.read"),
        CHECKOUT_SESSIONS_WRITE("checkout-sessions.write"),
        CONNECTIONS_READ("connections.read"),
        CONNECTIONS_WRITE("connections.write"),
        DIGITAL_WALLETS_READ("digital-wallets.read"),
        DIGITAL_WALLETS_WRITE("digital-wallets.write"),
        FLOWS_READ("flows.read"),
        FLOWS_WRITE("flows.write"),
        GIFT_CARD_SERVICE_DEFINITIONS_READ("gift-card-service-definitions.read"),
        GIFT_CARD_SERVICES_READ("gift-card-services.read"),
        GIFT_CARD_SERVICES_WRITE("gift-card-services.write"),
        GIFT_CARDS_READ("gift-cards.read"),
        GIFT_CARDS_WRITE("gift-cards.write"),
        MERCHANT_ACCOUNT_READ("merchant-accounts.reads"),
        MERCHANT_ACCOUNT_WRITE("merchant-accounts.write"),
        PAYMENT_METHOD_DEFINITIONS_READ("payment-method-definitions.read"),
        PAYMENT_METHOD_READ("payment-methods.read"),
        PAYMENT_METHOD_WRITE("payment-methods.write"),
        PAYMENT_OPTIONS_READ("payment-options.read"),
        PAYMENT_SERVICE_DEFINITIONS_READ("payment-service-definitions.read"),
        PAYMENT_SERVICES_READ("payment-services.read"),
        PAYMENT_SERVICES_WRITE("payment-services.write"),
        REPORTS_READ("reports.read"),
        REPORTS_WRITE("reports.write"),
        TRANSACTIONS_READ("transactions.read"),
        TRANSACTIONS_WRITE("transactions.write"),
        VAULT_FORWARD_WRITE("vault-forward.write");

        private final String value;

        JWTScope(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        // Optional: Override toString() to return the string value directly
        @Override
        public String toString() {
            return value;
        }

        // Optional: Static method to get enum from string value
        public static JWTScope fromValue(String value) {
            for (JWTScope scope : JWTScope.values()) {
                if (scope.value.equals(value)) {
                    return scope;
                }
            }
            throw new IllegalArgumentException("Unknown scope: " + value);
        }
    }

    public static String generateToken(String privateKeyPem,
                                       List<String> scopes,
                                       long expiresInSeconds,
                                       Map<String, Object> embedParams,
                                       String checkoutSessionId,
                                       String issuer) throws Exception {

        if (scopes == null || scopes.isEmpty()) {
            scopes = Arrays.asList("*.read", "*.write");
        }

        ECPrivateKey privateKey = parseECPrivateKey(privateKeyPem);
        String kid = calculateThumbprint(privateKey);

        Instant now = Instant.now();

        Map<String, Object> claims = new LinkedHashMap<>();
        claims.put("scopes", scopes);
        claims.put("iss", issuer);
        claims.put("iat", now.getEpochSecond());
        claims.put("nbf", now.getEpochSecond());
        claims.put("exp", now.plusSeconds(expiresInSeconds).getEpochSecond());
        claims.put("jti", UUID.randomUUID().toString());

        if (checkoutSessionId != null) {
            claims.put("checkout_session_id", checkoutSessionId);
        }
        if (scopes.contains("embed") && embedParams != null) {
            claims.put("embed", embedParams);
        }

        Algorithm algorithm = Algorithm.ECDSA512(null, privateKey);
        return JWT.create()
                .withHeader(Map.of("kid", kid))
                .withPayload(claims)
                .sign(algorithm);
    }

    public static String updateToken(String token,
                                     String privateKeyPem,
                                     List<String> scopes,
                                     long expiresInSeconds,
                                     Map<String, Object> embedParams,
                                     String checkoutSessionId,
                                     String issuer) throws Exception {
        // This version doesn't decode token but reuses logic with new claims
        return generateToken(privateKeyPem, scopes, expiresInSeconds, embedParams, checkoutSessionId, issuer);
    }

    public static String getEmbedToken(String privateKeyPem,
                                       Map<String, Object> embedParams,
                                       String checkoutSessionId,
                                       String issuer) throws Exception {
        return generateToken(privateKeyPem, List.of("embed"), 3600, embedParams, checkoutSessionId, issuer);
    }

    private static ECPrivateKey parseECPrivateKey(String pem) throws Exception {
        String privKeyPEM = pem.replace("-----BEGIN PRIVATE KEY-----", "")
                .replace("-----END PRIVATE KEY-----", "")
                .replaceAll("\\s", "");

        byte[] decoded = Base64.getDecoder().decode(privKeyPEM);
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(decoded);

        KeyFactory kf = KeyFactory.getInstance("EC");
        return (ECPrivateKey) kf.generatePrivate(keySpec);
    }

    private static String base64UrlEncode(byte[] input) {
        return Base64.getUrlEncoder().withoutPadding().encodeToString(input);
    }

    private static String calculateThumbprint(ECPrivateKey key) throws Exception {
        Map<String, String> jwk = Map.of(
                "kty", "EC",
                "crv", "P-521",
                "x", base64UrlEncode(key.getParams().getGenerator().getAffineX().toByteArray()),
                "y", base64UrlEncode(key.getParams().getGenerator().getAffineY().toByteArray())
        );

        ObjectMapper mapper = new ObjectMapper();
        String jwkJson = mapper.writeValueAsString(new TreeMap<>(jwk));
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashed = digest.digest(jwkJson.getBytes(StandardCharsets.UTF_8));
        return base64UrlEncode(hashed);
    }
}
