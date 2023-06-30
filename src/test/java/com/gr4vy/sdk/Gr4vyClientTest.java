package com.gr4vy.sdk;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.gr4vy.api.ApiException;
import com.gr4vy.api.model.*;
import com.gr4vy.api.openapi.BuyersApi;
import com.gr4vy.api.openapi.CheckoutSessionsApi;
import com.nimbusds.jose.JOSEException;

public class Gr4vyClientTest {

	@Test
    public void getEmbedTokenTest() throws Gr4vyException, ApiException {
    	Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem");
		
		Map<String, Object> embed = new HashMap<String, Object>();
		embed.put("amount", 1299);
		embed.put("currency", "USD");

    	String token = client.getEmbedToken(embed);
        assert token != null;
    }

	@Test
    public void getEmbedTokenTestWithCheckoutSessionPassedIn() throws Gr4vyException, ApiException {
    	Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem");
		
		Map<String, Object> embed = new HashMap<String, Object>();
		embed.put("amount", 1299);
		embed.put("currency", "USD");
		
		CheckoutSessionsApi checkoutSessionsApi = new CheckoutSessionsApi(client.getClient());
		CheckoutSession checkoutSession = checkoutSessionsApi.newCheckoutSession();
		embed.put("checkout_session_id", checkoutSession.getId());

    	String token = client.getEmbedToken(embed);
        assert token != null;
    }
	
	@Test
    public void getTokenTest() throws Gr4vyException, ApiException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException, IOException, JOSEException, ParseException {
    	Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
		
		String key = client.getKey();
		String[] scopes = {"*.read", "*.write"};
		String token = client.getToken(key, scopes, null);
		
    	System.out.println(token);
        assert token != null;
    }
	
	@Test
    public void addBuyersTest() throws Gr4vyException, ApiException {
    	Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
    	BuyersApi api = new BuyersApi(client.getClient());
    	BuyerRequest buyer = new BuyerRequest();
    	buyer.setDisplayName("Java Test");
        Buyer response = api.newBuyer(buyer);

        assert response != null;
    }
	
	@Test
    public void listBuyersTest() throws Gr4vyException, ApiException {
    	Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
    	BuyersApi api = new BuyersApi(client.getClient());
    	
        String search = null;
        Integer limit = null;
        String cursor = null;
        Buyers response = api.listBuyers(search, limit, cursor);

        // System.out.println(response);
        assert response != null;
    }
}