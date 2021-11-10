package com.gr4vy.sdk;

import org.junit.Test;

import com.gr4vy.api.ApiException;
import com.gr4vy.api.model.*;
import com.gr4vy.api.openapi.BuyersApi;

public class Gr4vyClientTest {

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