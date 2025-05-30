package com.gr4vy.sdk;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.PrivateKey;
import java.security.interfaces.ECPrivateKey;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class Auth {

    private static final Logger logger = LoggerFactory.getLogger(Auth.class);

    /**
     * Generates a 60 second token with all permissions for an API request.
     *
     * @param privateKey The EC private key in string-PEM format.
     * @return A bearer auth token.
     */
    public static String getToken(String privateKey) {
        return getToken(privateKey, null, 60, null, null);
    }

    /**
     * Generates a token with custom scopes and expiration.
     *
     * @param privateKey The EC private key in string-PEM format.
     * @param scopes List of scopes. If not set, all access will be set as default.
     * @param expiresIn The expiration time in seconds. Defaults to 3600.
     * @return A bearer auth token.
     */
    public static String getToken(
            String privateKey,
            List<JWTScope> scopes,
            long expiresIn
    ) {
        return getToken(privateKey, scopes, expiresIn, null, null);
    }

    /**
     * Generates a token with additional params for Embed payments.
     *
     * @param privateKey The EC private key in string-PEM format.
     * @param scopes List of scopes. If not set, all access will be set as default.
     * @param expiresIn The expiration time in seconds. Defaults to 3600.
     * @param embedParams An optional map of Embed params to pin. Defaults to null.
     * @param checkoutSessionId An optional checkout session ID to link the transaction to. Defaults to null.
     * @return A bearer auth token.
     */
    public static String getToken(
            String privateKey,
            List<JWTScope> scopes,
            long expiresIn,
            Map<String, Object> embedParams,
            String checkoutSessionId
    ) {
        if (scopes == null || scopes.isEmpty()) {
            scopes = Arrays.asList(JWTScope.READ_ALL, JWTScope.WRITE_ALL);
        }

        try {
            PrivateKey key = PemUtils.getPrivateKeyFromPem(privateKey);
            // Ensure the key is an EC private key for ES512
            if (!(key instanceof ECPrivateKey)) {
                throw new IllegalArgumentException("The provided private key is not an EC private key. ES512 requires an EC key.");
            }

            // Algorithm for ES512 requires an ECPrivateKey
            Algorithm algorithm = Algorithm.ECDSA512((ECPrivateKey) key);

            Instant now = Instant.now();
            Instant expiration = now.plus(expiresIn, ChronoUnit.SECONDS);

            Map<String, Object> headers = new HashMap<>();
            // Calculate and add 'kid' to headers
            headers.put("kid", PemUtils.calculateJwkThumbprint(key));

            // Convert JWTScope enums to their string values
            List<String> scopeStrings = scopes.stream()
                    .map(JWTScope::getValue)
                    .collect(Collectors.toList());

            // Build claims
            Map<String, Object> claims = new HashMap<>();
            claims.put("scopes", scopeStrings);
            claims.put("iss", SDKConfiguration.USER_AGENT);
            claims.put("iat", Date.from(now));
            claims.put("nbf", Date.from(now));
            claims.put("exp", Date.from(expiration));
            claims.put("jti", UUID.randomUUID().toString());

            if (checkoutSessionId != null) {
                claims.put("checkout_session_id", checkoutSessionId);
            }

            if (scopes.contains(JWTScope.EMBED) && embedParams != null) {
                claims.put("embed", embedParams);
            }

            return JWT.create()
                    .withHeader(headers)
                    .withPayload(claims)
                    .sign(algorithm);

        } catch (Exception e) {
            logger.error("Error generating JWT: {}", e.getMessage(), e);
            throw new RuntimeException("Failed to generate JWT", e);
        }
    }

    /**
     * Updates an existing token with a new signature, and optionally new data.
     *
     * @param token The previously generated token.
     * @param privateKey The EC private key in string-PEM format.
     * @param scopes List of scopes. If not set, all access will be set as default.
     * @param expiresIn The expiration time in seconds. Defaults to 3600.
     * @param embedParams An optional map of Embed params to pin. Defaults to null.
     * @param checkoutSessionId An optional checkout session ID to link the transaction to. Defaults to null.
     * @return A bearer auth token.
     */
    public static String updateToken(
            String token,
            String privateKey,
            List<JWTScope> scopes,
            long expiresIn,
            Map<String, Object> embedParams,
            String checkoutSessionId
    ) {
        try {
            // Decode the token without verifying the signature to get existing claims
            DecodedJWT decodedJWT = JWT.decode(token);
            Map<String, Object> existingClaims = decodedJWT.getClaims().entrySet().stream()
                .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    entry -> {
                        var claim = entry.getValue();
                        if (claim == null) return null;
                        try {
                            Map<String, Object> asMap = claim.asMap();
                            if (asMap != null) return asMap;
                        } catch (Exception ignored) {}
                        try {
                            String asString = claim.asString();
                            if (asString != null) return asString;
                        } catch (Exception ignored) {}
                        return claim.toString(); // fallback
                    }
                ));

            // Extract previous scopes
            List<String> previousScopeStrings = decodedJWT.getClaim("scopes").asList(String.class);
            List<JWTScope> previousScopes = (previousScopeStrings != null) ?
                    JWTScope.fromStringList(previousScopeStrings) :
                    Collections.emptyList();

            // Use new scopes or previous scopes
            List<JWTScope> finalScopes = (scopes != null && !scopes.isEmpty()) ? scopes : previousScopes;

            // Use new embed params or previous embed params
            @SuppressWarnings("unchecked")
            Map<String, Object> finalEmbedParams = (embedParams != null) ? embedParams : (Map<String, Object>) existingClaims.get("embed");

            // Use new checkout session ID or previous
            String finalCheckoutSessionId = (checkoutSessionId != null) ? checkoutSessionId : (String) existingClaims.get("checkout_session_id");

            return getToken(privateKey, finalScopes, expiresIn, finalEmbedParams, finalCheckoutSessionId);

        } catch (JWTDecodeException e) {
            logger.error("Error decoding token for update: {}", e.getMessage(), e);
            throw new RuntimeException("Failed to decode existing token", e);
        }
    }

    /**
     * Generates a token for use with Embed.
     *
     * @param privateKey The EC private key in string-PEM format.
     * @param embedParams An optional map of Embed params to pin. Defaults to null.
     * @param checkoutSessionId An optional checkout session ID to link the transaction to. Defaults to null.
     * @return A bearer auth token.
     */
    public static String getEmbedToken(
            String privateKey,
            Map<String, Object> embedParams,
            String checkoutSessionId
    ) {
        return getToken(privateKey, Arrays.asList(JWTScope.EMBED), 3600, embedParams, checkoutSessionId);
    }
}