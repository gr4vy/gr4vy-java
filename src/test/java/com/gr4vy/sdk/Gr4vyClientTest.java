package com.gr4vy.sdk;

import java.io.IOException;
import java.io.StringReader;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

import org.junit.Test;

import com.nimbusds.jose.JOSEException;

public class Gr4vyClientTest {

	@Test
    public void getEmbedTokenTest() throws Gr4vyException {
    	Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem");
		
		Map<String, Object> embed = new HashMap<String, Object>();
		embed.put("amount", 1299);
		embed.put("currency", "USD");

    	String token = client.getEmbedToken(embed);
        assert token != null;
    }

	@Test
	public void getEmbedTokenTestWithCheckoutSessionPassedIn() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem");
		
		JsonObject checkoutSession = client.newCheckoutSession(null);
		String checkoutSessionId = checkoutSession.getString("id");
		
		Map<String, Object> embed = new HashMap<String, Object>();
		embed.put("amount", 1299);
		embed.put("currency", "USD");

		String token = client.getEmbedToken(embed, UUID.fromString(checkoutSessionId));
		assert token != null;
	}
	
	@Test
    public void getTokenTest() throws Gr4vyException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException, IOException, JOSEException, ParseException {
    	Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
		
		String key = client.getKey();
		String[] scopes = {"*.read", "*.write"};
		String token = client.getToken(key, scopes, null);
		
//    	System.out.println(token);
        assert token != null;
    }
	
	@Test
	public void addBuyersTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
     	JsonObject jsonBody = Json.createObjectBuilder()
	     .add("display_name", "NewJava Test").build();
     	JsonObject response = client.newBuyer(jsonBody);
        assert response != null;
	}
	
	@Test
	public void updateBuyersTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
     	JsonObject jsonBody = Json.createObjectBuilder()
	     .add("display_name", "NewJava Test").build();
     	JsonObject response = client.newBuyer(jsonBody);
     	
     	String buyerId = response.getString("id");
     	JsonObject updateBody = Json.createObjectBuilder()
     		     .add("display_name", "NewJava Test2").build();
     	client.updateBuyer(buyerId, updateBody);
     	
        assert response != null;
        
        response = client.deleteBuyer(buyerId);
        System.out.println(response);
	}
	
	@Test
    public void listBuyersTest() throws Gr4vyException {
    	Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
    	
        String search = null;
        Integer limit = null;
        String cursor = null;
        JsonObject response = client.listBuyers();
        
        System.out.println(response);
        assert response != null;
    }
	
	@Test
	public void newTransactionTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
		
		JsonObject checkoutSession = client.newCheckoutSession(null);
		String checkoutSessionId = checkoutSession.getString("id");
		
		
		JsonReader jsonReader = Json.createReader(new StringReader("{\n"
				+ "  \"amount\": 1299,\n"
				+ "  \"currency\": \"GBP\",\n"
				+ "  \"payment_method\": {\n"
				+ "    \"method\": \"checkout-session\",\n"
				+ "    \"id\": \"" + checkoutSessionId + "\"\n"
				+ "  }\n"
				+ "}"));
		JsonObject jsonBody = jsonReader.readObject(); 
		
     	JsonObject response = client.newTransaction(jsonBody);
     	System.out.println(response);
        assert response != null;
	}
}