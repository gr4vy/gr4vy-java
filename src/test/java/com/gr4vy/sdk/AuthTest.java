package com.gr4vy.sdk;

import com.auth0.jwt.JWT;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

public class AuthTest {
    private final String PRIVATE_KEY = "-----BEGIN PRIVATE KEY-----\n" + //
                "MIHuAgEAMBAGByqGSM49AgEGBSuBBAAjBIHWMIHTAgEBBEIBABM9jQu+HT87oIik\n" + //
                "O6DiJjYeghr3V+VMBVNU2hCM3X/OAS6TUTylMbnjDnwWdmu7anVSnjvEY1a4KxQ9\n" + //
                "WZ8E/PKhgYkDgYYABABRdv5VAtOsGb6THxeK/p7RAARPm6Zwb7FF4sZAYkkSB7h0\n" + //
                "2jpj3UHSpyl92BQkiF/xakz7hMMD1A0ZTn5SuXWp3AG9qPHO3eB9WrZhPGYixwyo\n" + //
                "XNjhnPEDhmkItKXteke9iBOTOOXB7AFQSh7EXRBmhBs4u3ZlTmrl+8VdBc3+jwAY\n" + //
                "rw==\n" + //
                "-----END PRIVATE KEY-----";
    
    private final String EMBED_PARAMS = "{" + //
                "    \"amount\": 9000," + //
                "    \"currency\": \"USD\"," + //
                "    \"buyer_external_identifier\": \"user-123\"," + //
                "    \"connection_options\": {" + //
                "        \"stripe-card\": {" + //
                "            \"stripe_connect\": {" + //
                "                \"key\": \"value\"," + //
                "            }," + //
                "        }," + //
                "    }," + //
                "    \"metadata\": {" + //
                "        \"camelCaseKey\": \"value1\"," + //
                "        \"snake_case_key\": \"value2\"," + //
                "    }," + //
                "    \"cart_items\": [" + //
                "       {" + //
                "            \"name\": \"Joust Duffle Bag\"," + //
                "            \"quantity\": 1," + //
                "            \"unit_amount\": 9000," + //
                "            \"tax_amount\": 0," + //
                "            \"categories\": [\"Gear\", \"Bags\", \"Test\"]," + //
                "       }," + //
                "    ]," + //
                "}" + //
                "";

    private final String CHECKOUT_SESSION_ID = "0ebde6a1-f66c-43ea-bb8b-73751864c604";

    private static Map<String, Object> toMap(JSONObject jsonObject) {
        Map<String, Object> map = new HashMap<>();
        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            Object value = jsonObject.get(key);

            if (value instanceof JSONObject) {
                map.put(key, toMap((JSONObject) value));
            } else if (value instanceof JSONArray) {
                map.put(key, toList((JSONArray) value));
            } else {
                map.put(key, value);
            }
        }
        return map;
    }

    private static List<Object> toList(JSONArray jsonArray) {
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            Object value = jsonArray.get(i);
            if (value instanceof JSONObject) {
                list.add(toMap((JSONObject) value));
            } else if (value instanceof JSONArray) {
                list.add(toList((JSONArray) value));
            } else {
                list.add(value);
            }
        }
        return list;
    }

    @Test
    void tesGetTokenCreatesValidSignedJWT() throws Exception {
        String token = Auth.getToken(PRIVATE_KEY, Arrays.asList(JWTScope.READ_ALL, JWTScope.WRITE_ALL), 3600, null, null, null);
        DecodedJWT decodedJWT = JWT.decode(token);

        Map<String, Claim> claims = decodedJWT.getClaims();
        assertEquals(claims.get("scopes").toString(), "[\"*.read\",\"*.write\"]");
        assertTrue(claims.containsKey("iat"));
        assertTrue(claims.containsKey("nbf"));
        assertTrue(claims.containsKey("exp"));
        assertTrue(claims.containsKey("iss"));
        assertEquals(claims.get("iss").toString(), "\"java-sdk\"");
    }

    @Test
    void testGetTokenAcceptsOptionalEmbedData() throws Exception {
        JSONObject jsonObject = new JSONObject(EMBED_PARAMS);
         Map<String, Object> embedParams = toMap(jsonObject);
        String token = Auth.getToken(PRIVATE_KEY, Arrays.asList(JWTScope.EMBED), 3600, embedParams, null, null);
        DecodedJWT decodedJWT = JWT.decode(token);

        Map<String, Claim> claims = decodedJWT.getClaims();
        assertEquals(claims.get("scopes").toString(), "[\"" + JWTScope.EMBED.toString() + "\"]");
        assertTrue(claims.containsKey("iat"));
        assertTrue(claims.containsKey("nbf"));
        assertTrue(claims.containsKey("exp"));
        assertTrue(claims.containsKey("iss"));
        assertEquals(claims.get("iss").toString(), "\"java-sdk\"");
        String embedParamsString = claims.get("embed").toString();
        JSONObject embedParamsJson = new JSONObject(embedParamsString);
        assertEquals(toMap(embedParamsJson), embedParams);
    }

    @Test
    void testGetTokenIgnoresEmbedDataWithoutEmbedScope() throws Exception {
        JSONObject jsonObject = new JSONObject(EMBED_PARAMS);
         Map<String, Object> embedParams = toMap(jsonObject);
        String token = Auth.getToken(PRIVATE_KEY, Arrays.asList(JWTScope.READ_ALL), 3600, embedParams, null, null);
        DecodedJWT decodedJWT = JWT.decode(token);

        Map<String, Claim> claims = decodedJWT.getClaims();
        assertEquals(claims.get("scopes").toString(), "[\"" + JWTScope.READ_ALL.toString() + "\"]");
        assertFalse(claims.containsKey("embed"));
    }

    @Test
    void testGetEmbedTokenCreatesJwtForEmbed() throws Exception {
        JSONObject jsonObject = new JSONObject(EMBED_PARAMS);
         Map<String, Object> embedParams = toMap(jsonObject);
        String token = Auth.getEmbedToken(PRIVATE_KEY, embedParams, null, null);
        DecodedJWT decodedJWT = JWT.decode(token);

        Map<String, Claim> claims = decodedJWT.getClaims();
        assertEquals(claims.get("scopes").toString(), "[\"" + JWTScope.EMBED.toString() + "\"]");
        String embedParamsString = claims.get("embed").toString();
        JSONObject embedParamsJson = new JSONObject(embedParamsString);
        assertEquals(toMap(embedParamsJson), embedParams);
    }

    @Test
    void testGetEmbedTokenTakesOptionalCheckoutSession_id() throws Exception {
        JSONObject jsonObject = new JSONObject(EMBED_PARAMS);
         Map<String, Object> embedParams = toMap(jsonObject);
        String token = Auth.getEmbedToken(PRIVATE_KEY, embedParams, CHECKOUT_SESSION_ID, null);
        DecodedJWT decodedJWT = JWT.decode(token);

        Map<String, Claim> claims = decodedJWT.getClaims();
        assertEquals(claims.get("scopes").toString(), "[\"" + JWTScope.EMBED.toString() + "\"]");
        String embedParamsString = claims.get("embed").toString();
        JSONObject embedParamsJson = new JSONObject(embedParamsString);
        assertEquals(toMap(embedParamsJson), embedParams);
        assertEquals(claims.get("checkout_session_id").toString(), "\"" + CHECKOUT_SESSION_ID + "\"");
    }

    @Test
    void testUpdateTokenResignsWithNewSignatureAndExpiration() throws Exception {
        String originalToken = Auth.getToken(PRIVATE_KEY, null, 60, null, null, null);
        DecodedJWT decodedOriginalJWT = JWT.decode(originalToken);

        Thread.sleep(1000);
        String newToken = Auth.updateToken(originalToken, PRIVATE_KEY, null, 60, null, null, null);
        DecodedJWT decodedNewJWT = JWT.decode(newToken);

        Map<String, Claim> originalClaims = decodedOriginalJWT.getClaims();
        Map<String, Claim> newClaims = decodedNewJWT.getClaims();

        assertEquals(originalClaims.get("scopes").toString(), newClaims.get("scopes").toString());
        long originalIat = originalClaims.get("iat").asLong();
        long newIat = newClaims.get("iat").asLong();
        assertTrue(newIat > originalIat);

        long originalExp = originalClaims.get("exp").asLong();
        long newExp = newClaims.get("exp").asLong();
        assertTrue(newExp > originalExp);

        long originalNbf = originalClaims.get("nbf").asLong();
        long newNbf = newClaims.get("nbf").asLong();
        assertTrue(newNbf > originalNbf);
    }

    @Test
    void test_update_token_allows_embed_token_update_with_new_params() throws Exception {
        JSONObject jsonObject = new JSONObject(EMBED_PARAMS);
         Map<String, Object> embedParams = toMap(jsonObject);
        String originalToken = Auth.getEmbedToken(PRIVATE_KEY, embedParams, CHECKOUT_SESSION_ID, null);

        String newEmbedParams = "{\"amount\": 1299,\"currency\": \"USD\"}";

        Thread.sleep(1000);
        JSONObject newEmbedParamsJson = new JSONObject(newEmbedParams);
         Map<String, Object> newEmbedParamsMap = toMap(newEmbedParamsJson);
        String newToken = Auth.updateToken(originalToken, PRIVATE_KEY, null, 60, newEmbedParamsMap, null, null);
        DecodedJWT decodedNewJWT = JWT.decode(newToken);

        Map<String, Claim> newClaims = decodedNewJWT.getClaims();
        String embedParamsString = newClaims.get("embed").toString();
        JSONObject embedParamsJson = new JSONObject(embedParamsString);
        assertEquals(toMap(embedParamsJson), newEmbedParamsMap);
        assertEquals(newClaims.get("checkout_session_id").toString(), "\"" + CHECKOUT_SESSION_ID + "\"");
    }
}
