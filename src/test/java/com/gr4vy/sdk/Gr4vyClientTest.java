package com.gr4vy.sdk;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.gr4vy.api.ApiException;
import com.gr4vy.api.model.*;
import com.gr4vy.api.openapi.BuyersApi;

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
    public void addBuyersTest() throws Gr4vyException, ApiException {
    	Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem");
    	BuyersApi api = new BuyersApi(client.getClient());
    	BuyerRequest buyer = new BuyerRequest();
    	buyer.setDisplayName("Java Test");
        Buyer response = api.addBuyer(buyer);

        assert response != null;
    }
	
	@Test
    public void listBuyersTest() throws Gr4vyException, ApiException {
    	Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem");
    	BuyersApi api = new BuyersApi(client.getClient());
    	
        String search = null;
        Integer limit = null;
        String cursor = null;
        Buyers response = api.listBuyers(search, limit, cursor);

        // System.out.println(response);
        assert response != null;
    }
}