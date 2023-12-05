package com.gr4vy.sdk;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.junit.Test;

import com.gr4vy.api.model.*;
import com.gr4vy.api.model.TransactionPaymentMethodRequest.MethodEnum;
import com.gr4vy.api.model.TransactionRequest.IntentEnum;
import com.nimbusds.jose.JOSEException;

public class Gr4vyClientTest {

	@Test
    public void setTimeoutTest() throws Gr4vyException {
	  	Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("[YOUR_GR4VY_ID]") // required
				.privateKeyLocation("private_key.pem") // conditional
				.privateKeyString("-----BEGIN PRIVATE KEY-----\n...") // conditional
				.environment("sandbox") // optional, defaults to sandbox
				.host(null) // optional - allows setting a custom host
				.client(null) // optional - allows setting the http client
				.debug(false) // optional
				.merchantAccountId("default") // optional, defaults to default
				.timeouts(1, 2, 3) // optional, defaults to 10, 10, 30	
				.build();

        assert client.getConnectTimeout() == 1;
        assert client.getWriteTimeout() == 2;
        assert client.getReadTimeout() == 3;
    }
	
	@Test
    public void getEmbedTokenTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("spider")
				.privateKeyLocation("private_key.pem")
				.merchantAccountId("default")
				.build();
		
		Map<String, Object> embed = new HashMap<String, Object>();
		embed.put("amount", 1299);
		embed.put("currency", "USD");

    	String token = client.getEmbedToken(embed);
        assert token != null;
    }

	@Test
	public void getEmbedTokenTestWithCheckoutSessionPassedIn() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("spider")
				.privateKeyLocation("private_key.pem")
				.build();
		
		CheckoutSession checkoutSession = client.newCheckoutSession(null);
		
		Map<String, Object> embed = new HashMap<String, Object>();
		embed.put("amount", 1299);
		embed.put("currency", "USD");

		String token = client.getEmbedToken(embed, checkoutSession.getId());
		assert token != null;
	}
	
	@Test
    public void getTokenTest() throws Gr4vyException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException, IOException, JOSEException, ParseException {
    	Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("spider")
				.privateKeyLocation("private_key.pem")
				.environment("sandbox")
				.build();
		
		String[] scopes = {"*.read", "*.write"};
		String token = client.getToken(scopes);
		
        assert token != null;
    }
	
	@Test
    public void getTokenTestWithTokenExpiry() throws Gr4vyException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException, IOException, JOSEException, ParseException {
		Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("spider")
				.privateKeyLocation("private_key.pem")
				.environment("sandbox")
				.build();
		
		String key = client.getKey();
		String[] scopes = {"*.read", "*.write"};
		String token = client.getToken(key, scopes, null, null, 900000);
		
        assert token != null;
    }
	
	@Test
	public void addBuyersTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("spider")
				.privateKeyLocation("private_key.pem")
				.environment("sandbox")
				.build();
     	BuyerRequest buyer = new BuyerRequest();
     	buyer.setDisplayName("newJava Test");
     	Buyer response = client.newBuyer(buyer);
        assert response.getId() != null;
	}
	
	@Test
	public void updateBuyersTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("spider")
				.privateKeyLocation("private_key.pem")
				.environment("sandbox")
				.build();
		BuyerRequest buyer = new BuyerRequest();
     	buyer.setDisplayName("newJava Test");
     	Buyer response = client.newBuyer(buyer);
     	
     	BuyerUpdate update = new BuyerUpdate();
     	update.setDisplayName("NewJava Test2");
     	response = client.updateBuyer(response.getId().toString(), update);
     	
        assert response.getId() != null;
        assert response.getDisplayName().equals("NewJava Test2");
        
        assert client.deleteBuyer(response.getId().toString());
        
	}
	
	@Test
    public void listBuyersTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("spider")
				.privateKeyLocation("private_key.pem")
				.environment("sandbox")
				.build();
    	
        Buyers response = client.listBuyers();
        
        assert response != null;
    }
	
	@Test
    public void listBuyersWithParamsTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("spider")
				.privateKeyLocation("private_key.pem")
				.environment("sandbox")
				.build();
    	
        Map<String, Object> params = new HashMap<String, Object>();
    	params.put("limit", 2);
    	try {
    		Buyers response = client.listBuyers(params);
    		assert response != null;
    	}
    	catch (Gr4vyException e) {
    		System.out.println(e.getError());
    		assert false;
    	}
    }
	
	@Test
	public void newCheckoutSessionTransactionTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("spider")
				.privateKeyLocation("private_key.pem")
				.environment("sandbox")
				.build();
		
		CheckoutSession checkoutSession = client.newCheckoutSession(null);
		
		TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
				.method(MethodEnum.CHECKOUT_SESSION)
				.id(checkoutSession.getId().toString());
		
		TransactionRequest request = new TransactionRequest()
				.amount(100)
				.currency("GBP")
				.paymentMethod(pm);
		

		try {
	     	Transaction response = client.newTransaction(request);
	     	assert response != null;
		}
		catch (Gr4vyException e) {
			ErrorGeneric error = e.getError();
			assertEquals(error.getDetails().get(0).getMessage(), "Invalid checkout session ID. Session does not exist, is incomplete or has expired.");
		}
        
	}
	
	@Test
	public void getCheckoutSessionTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("spider")
				.privateKeyLocation("private_key.pem")
				.environment("sandbox")
				.build();
		
		CheckoutSession checkoutSession = client.newCheckoutSession(null);
		
		
		CheckoutSession retrieved = client.getCheckoutSession(checkoutSession.getId().toString());
		assert retrieved != null;
	}
	
	 @Test
	 public void newFailTransactionTest() throws Gr4vyException {
		 Gr4vyClient client = new Gr4vyClient.Builder()
					.gr4vyId("spider")
					.privateKeyLocation("private_key.pem")
					.environment("sandbox")
					.build();
		
	 	TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
	 			.method(MethodEnum.CARD)
	 			.number("4111111111111111")
	 			.securityCode("123")
	 			.expirationDate("12/23");
		
	 	TransactionRequest request = new TransactionRequest()
	 			.amount(100)
	 			.currency("ABC")
	 			.paymentMethod(pm);
		
	 	try {
	 		Transaction response = client.newTransaction(request);
	        assert response != null;
	 	}
	 	catch (Gr4vyException ex) {
	 		ErrorGeneric error = ex.getError();
	 		assertEquals(error.getDetails().get(0).getMessage(), "Unknown ISO 4217 currency code: ABC"); 
	 	}
	 }

	 @Test
	 public void newTransactionTest() throws Gr4vyException {
		 Gr4vyClient client = new Gr4vyClient.Builder()
					.gr4vyId("spider")
					.privateKeyLocation("private_key.pem")
					.environment("sandbox")
					.build();
		
	 	TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
	 			.method(MethodEnum.CARD)
	 			.number("4111111111111111")
	 			.securityCode("123")
	 			.expirationDate("12/23");
		
	 	TransactionRequest request = new TransactionRequest()
	 			.amount(100)
	 			.currency("USD")
	 			.paymentMethod(pm);
		
     	Transaction response = client.newTransaction(request);
        assert response != null;
	 }

	 @Test
	 public void newTransactionWithIdempotencyTest() throws Gr4vyException {
		 Gr4vyClient client = new Gr4vyClient.Builder()
					.gr4vyId("spider")
					.privateKeyLocation("private_key.pem")
					.environment("sandbox")
					.build();
		
	 	TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
	 			.method(MethodEnum.CARD)
	 			.number("4111111111111111")
	 			.securityCode("123")
	 			.expirationDate("12/23");
		
	 	TransactionRequest request = new TransactionRequest()
	 			.amount(100)
	 			.currency("USD")
	 			.paymentMethod(pm);
		
	 	UUID idempotencyKey = UUID.randomUUID();
     	Transaction response = client.newTransaction(request, idempotencyKey.toString());
        assert response != null;
	 }
	
	@Test
	public void captureTransactionTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("spider")
				.privateKeyLocation("private_key.pem")
				.environment("sandbox")
				.build();
		
		TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
				.method(MethodEnum.CARD)
				.number("4111111111111111")
				.securityCode("123")
				.expirationDate("12/23")
				.redirectUrl("https://gr4vy.com");
		
		TransactionRequest request = new TransactionRequest()
				.amount(100)
				.currency("USD")
				.paymentMethod(pm)
				.intent(IntentEnum.AUTHORIZE);
		
     	Transaction response = client.newTransaction(request);
        assert response != null;
        
        TransactionCaptureRequest capture = new TransactionCaptureRequest()
        		.amount(100);
        Transaction captureResponse = client.captureTransaction(response.getId().toString(), capture);
        assert captureResponse != null;
	}
	
	@Test
	public void voidTransactionTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("spider")
				.privateKeyLocation("private_key.pem")
				.environment("sandbox")
				.build();
		
		TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
				.method(MethodEnum.CARD)
				.number("4111111111111111")
				.securityCode("123")
				.expirationDate("12/23")
				.redirectUrl("https://gr4vy.com");
		
		TransactionRequest request = new TransactionRequest()
				.amount(100)
				.currency("USD")
				.paymentMethod(pm)
				.intent(IntentEnum.AUTHORIZE);
		
     	Transaction response = client.newTransaction(request);
        assert response != null;
        
        Transaction voidResponse = client.voidTransaction(response.getId().toString());
        assert voidResponse != null;
	}
	
	@Test
	public void refundTransactionTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("spider")
				.privateKeyLocation("private_key.pem")
				.environment("sandbox")
				.build();
		
		TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
				.method(MethodEnum.CARD)
				.number("4111111111111111")
				.securityCode("123")
				.expirationDate("12/23")
				.redirectUrl("https://gr4vy.com");
		
		TransactionRequest request = new TransactionRequest()
				.amount(100)
				.currency("USD")
				.paymentMethod(pm)
				.intent(IntentEnum.CAPTURE);
		
     	Transaction response = client.newTransaction(request);
        assert response != null;
        
        TransactionRefundRequest refund = new TransactionRefundRequest()
        		.amount(100);
        Refund refundResponse = client.refundTransaction(response.getId().toString(), refund);
        assert refundResponse != null;
	}
	
	 @Test
	 public void newRedirectTransactionTest() throws Gr4vyException {
		 Gr4vyClient client = new Gr4vyClient.Builder()
					.gr4vyId("spider")
					.privateKeyLocation("private_key.pem")
					.environment("sandbox")
					.build();
		
	 	TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
	 			.method(MethodEnum.PAYPAL)
	 			.redirectUrl("https://gr4vy.com")
	 			.currency("GBP")
	 			.country("GB");
		
	 	TransactionRequest request = new TransactionRequest()
	 			.amount(100)
	 			.currency("GBP")
	 			.paymentMethod(pm);
		
      	Transaction response = client.newTransaction(request);
        assert response != null;
	 }
	
	@Test
	public void newStoredTransactionTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("spider")
				.privateKeyLocation("private_key.pem")
				.environment("sandbox")
				.build();
		
		TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
				.id("my_stored_uuid");
		
		TransactionRequest request = new TransactionRequest()
				.amount(100)
				.currency("GBP")
				.paymentMethod(pm);
		
        try {
        	Transaction response = client.newTransaction(request);
            assert response != null;
		}
		catch (Gr4vyException ex) {
			if (!ex.hasError()) {
				assert false;
			}
			ErrorGeneric error = ex.getError();
			assertEquals(error.getDetails().get(0).getMessage(), "Invalid Payment Method");
		}
	}
	
	@Test
    public void listTransactionsTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("spider")
				.privateKeyLocation("private_key.pem")
				.environment("sandbox")
				.build();

        Transactions response = client.listTransactions();
        
        assert response != null;
    }
	
	@Test
    public void listTransactionsWithParamsTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("spider")
				.privateKeyLocation("private_key.pem")
				.environment("sandbox")
				.build();
    	
    	Map<String, Object> params = new HashMap<String, Object>();
    	params.put("limit", 2);
    	params.put("amount_gte", "100");
    	try {
    		Transactions response = client.listTransactions(params);
    		assert response != null;
    	}
    	catch (Gr4vyException e) {
    		System.out.println(e.getError());
    		assert false;
    	}
    }
	
	@Test
    public void listTransactionHistoryEventsTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("spider")
				.privateKeyLocation("private_key.pem")
				.environment("sandbox")
				.build();

        TransactionHistoryEvents response = client.listEventsForTransaction("0cb94b92-aeb9-4f67-96c5-084cbaf5b66c");
        
        assert response != null;
    }
	
	@Test
	public void storePaymentMethodTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("spider")
				.privateKeyLocation("private_key.pem")
				.environment("sandbox")
				.build();
		
		PaymentMethodRequest pm = new PaymentMethodRequest()
				.method("card")
				.number("4111111111111111")
				.expirationDate("12/24");
     	
     	PaymentMethod response = client.storePaymentMethod(pm);
        assert response.getId() != null;
	}
	
	@Test
	public void getPaymentMethodTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("spider")
				.privateKeyLocation("private_key.pem")
				.environment("sandbox")
				.build();
		
        try {
        	PaymentMethod response = client.getPaymentMethod("eeefe91c-9449-4730-81a4-85cd59e8d72a");
        	assert response != null;
		}
		catch (Gr4vyException ex) {
			if (!ex.hasError()) {
				assert false;
			}
			ErrorGeneric error = ex.getError();
			assertEquals(error.getMessage(), "The resource could not be found");
		}
	}
	
	@Test
	public void listPaymentMethodsTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("spider")
				.privateKeyLocation("private_key.pem")
				.environment("sandbox")
				.build();
		
     	PaymentMethods response = client.listPaymentMethods();
        assert response != null;
	}
	
	@Test
	public void listBuyerPaymentMethodsTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("spider")
				.privateKeyLocation("private_key.pem")
				.environment("sandbox")
				.build();
		
		try {
	     	PaymentMethods response = client.listBuyerPaymentMethods("");
	        assert response != null;
		}
		catch (Gr4vyException ex) {
			ErrorGeneric error = ex.getError();
			assertEquals(error.getDetails().get(0).getMessage(), "value is not a valid uuid"); 
		}
	}


}