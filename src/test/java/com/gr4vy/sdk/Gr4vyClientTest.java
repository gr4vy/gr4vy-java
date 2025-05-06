package com.gr4vy.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.gr4vy.api.model.*;
import com.gr4vy.api.model.TransactionPaymentMethodRequest.MethodEnum;
import com.gr4vy.api.model.TransactionRequest.IntentEnum;
import com.nimbusds.jose.JOSEException;

public class Gr4vyClientTest {
	
	protected static Gr4vyClient shared;
	
	@BeforeClass
    public static void setup() {
		shared = new Gr4vyClient.Builder()
				.gr4vyId("spider")
				.privateKeyLocation("private_key.pem")
				.environment("sandbox")
				.build();
    }
	
	@Test
    public void setTimeoutTest() throws Gr4vyException {
	  	Gr4vyClient client = new Gr4vyClient.Builder()
				.gr4vyId("[YOUR_GR4VY_ID]") // required
				.privateKeyLocation("private_key.pem") // conditional
				.privateKeyString("-----BEGIN PRIVATE KEY-----\n...") // conditional
				.environment("sandbox") // optional, defaults to sandbox
				.host(null) // optional - allows setting a custom host
				.client(null) // optional - allows setting the http client
				.merchantAccountId("default") // optional, defaults to default	
				.connectTimeout(Duration.ofSeconds(1)) // optional, defaults to 10
				.writeTimeout(Duration.ofSeconds(2)) // optional, defaults to 10
				.readTimeout(Duration.ofSeconds(3)) // optional, defaults to 30
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
		String[] scopes = {"*.read", "*.write"};
		String token = shared.getToken(scopes);
		
        assert token != null;
    }
	
	@Test
    public void getTokenTestWithTokenExpiry() throws Gr4vyException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException, IOException, JOSEException, ParseException {
		String key = shared.getKey();
		String[] scopes = {"*.read", "*.write"};
		String token = shared.getToken(key, scopes, null, null, 900000);
		
        assert token != null;
    }

	
	
	@Test
	public void addBuyersTest() throws Gr4vyException {
     	BuyerRequest buyer = new BuyerRequest();
     	buyer.setDisplayName("newJava Test");
     	Buyer response = shared.newBuyer(buyer);
        assert response.getId() != null;
	}
	
	@Test
	public void updateBuyersTest() throws Gr4vyException {
		BuyerRequest buyer = new BuyerRequest();
     	buyer.setDisplayName("newJava Test");
     	Buyer response = shared.newBuyer(buyer);
     	
     	BuyerUpdate update = new BuyerUpdate();
     	update.setDisplayName("NewJava Test2");
     	response = shared.updateBuyer(response.getId().toString(), update);
     	
        assert response.getId() != null;
        assert response.getDisplayName().equals("NewJava Test2");
        
        assert shared.deleteBuyer(response.getId().toString());
        
	}
	
	@Test
    public void listBuyersTest() throws Gr4vyException {
        Buyers response = shared.listBuyers();
        
        assert response != null;
    }
	
	@Test
    public void listBuyersWithParamsTest() throws Gr4vyException {
        Map<String, Object> params = new HashMap<String, Object>();
    	params.put("limit", 2);
    	try {
    		Buyers response = shared.listBuyers(params);
    		assert response != null;
    	}
    	catch (Gr4vyException e) {
    		System.out.println(e.getError());
    		assert false;
    	}
    }
	
	@Test
	public void addShippingDetailsToBuyerTest() throws Gr4vyException {
		BuyerRequest buyer = new BuyerRequest();
     	buyer.setDisplayName("newJava Test");
     	Buyer response = shared.newBuyer(buyer);
        assert response.getId() != null;
        
		ShippingDetailRequest shippingDetails = new ShippingDetailRequest();
		shippingDetails.emailAddress("shipping@test.com");
		
		ShippingDetail shippingResponse = shared.addShippingDetailsToBuyer(response.getId().toString(), shippingDetails);
        assert shippingResponse.getId() != null;
        
        ShippingDetails details = shared.listShippingDetailsForBuyer(response.getId().toString());
        
        assert details.getItems().size() == 1;
        
        assert shared.deleteBuyer(response.getId().toString());
	}
	
	
	@Test
	public void newCheckoutSessionTransactionTest() throws Gr4vyException {
		CheckoutSession checkoutSession = shared.newCheckoutSession(null);
		
		TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
				.method(MethodEnum.CHECKOUT_SESSION)
				.id(checkoutSession.getId().toString());
		
		TransactionRequest request = new TransactionRequest()
				.amount(100)
				.currency("GBP")
				.paymentMethod(pm);
		

		try {
	     	Transaction response = shared.newTransaction(request);
	     	assert response != null;
		}
		catch (Gr4vyException e) {
			ErrorGeneric error = e.getError();
			assertEquals(error.getDetails().get(0).getMessage(), "Invalid checkout session ID. Session does not exist, is incomplete or has expired.");
		}
        
	}
	
	@Test
	public void getCheckoutSessionTest() throws Gr4vyException {
		CheckoutSession checkoutSession = shared.newCheckoutSession(null);
		
		
		CheckoutSession retrieved = shared.getCheckoutSession(checkoutSession.getId().toString());
		assert retrieved != null;
	}
	
	 @Test
	 public void newFailTransactionTest() throws Gr4vyException {
	 	TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
	 			.method(MethodEnum.CARD)
	 			.number("4111111111111111")
	 			.securityCode("123")
	 			.expirationDate("12/26");
		
	 	TransactionRequest request = new TransactionRequest()
	 			.amount(100)
	 			.currency("ABC")
	 			.paymentMethod(pm);
		
	 	try {
	 		Transaction response = shared.newTransaction(request);
	        assert response != null;
	 	}
	 	catch (Gr4vyException ex) {
	 		ErrorGeneric error = ex.getError();
	 		assertEquals(error.getDetails().get(0).getMessage(), "Value error, Unknown ISO 4217 currency code: ABC"); 
	 	}
	 }

	 @Test
	 public void newTransactionTest() throws Gr4vyException {
	 	TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
	 			.method(MethodEnum.CARD)
	 			.number("4111111111111111")
	 			.securityCode("123")
	 			.expirationDate("12/26");
		
	 	TransactionRequest request = new TransactionRequest()
	 			.amount(100)
	 			.currency("USD")
	 			.paymentMethod(pm);
		
     	Transaction response = shared.newTransaction(request);
        assert response != null;
	 }

	 @Test
	 public void newTransactionWithIdempotencyTest() throws Gr4vyException {
	 	TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
	 			.method(MethodEnum.CARD)
	 			.number("4111111111111111")
	 			.securityCode("123")
	 			.expirationDate("12/26");
		
	 	TransactionRequest request = new TransactionRequest()
	 			.amount(100)
	 			.currency("USD")
	 			.paymentMethod(pm);
		
	 	UUID idempotencyKey = UUID.randomUUID();
     	Transaction response = shared.newTransaction(request, idempotencyKey.toString());
        assert response != null;
	 }

	 @Test
	 public void newTransactionWithIdempotencyAndIpAddressTest() throws Gr4vyException {
	 	TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
	 			.method(MethodEnum.CARD)
	 			.number("4111111111111111")
	 			.securityCode("123")
	 			.expirationDate("12/26");
		
	 	TransactionRequest request = new TransactionRequest()
	 			.amount(200)
	 			.currency("USD")
	 			.paymentMethod(pm);
		
	 	UUID idempotencyKey = UUID.randomUUID();
     	Transaction response = shared.newTransaction(request, idempotencyKey.toString(), "64.233.160.0");
        assert response != null;
	 }



	 @Test
	 public void newTransactionWithStoredPaymentMethodTest() throws Gr4vyException {

		PaymentMethodRequest pmPaymentMethodRequest = new PaymentMethodRequest()
		.method("card")
		.number("4111111111111111")
		.expirationDate("12/24");
 
		PaymentMethod pm_response = shared.storePaymentMethod(pmPaymentMethodRequest);
		String id = pm_response.getId().toString();

	 	TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
	 			.method(MethodEnum.ID)
	 			.id(id);

	 	TransactionRequest request = new TransactionRequest()
	 			.amount(100)
	 			.currency("USD")
	 			.paymentMethod(pm);
		
     	Transaction response = shared.newTransaction(request);
        assert response != null;
	 }

	@Test
	public void captureTransactionTest() throws Gr4vyException {
		TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
				.method(MethodEnum.CARD)
				.number("4111111111111111")
				.securityCode("123")
				.expirationDate("12/26")
				.redirectUrl("https://gr4vy.com");
		
		TransactionRequest request = new TransactionRequest()
				.amount(100)
				.currency("USD")
				.paymentMethod(pm)
				.intent(IntentEnum.AUTHORIZE);
		
     	Transaction response = shared.newTransaction(request);
        assert response != null;
        
        TransactionCaptureRequest capture = new TransactionCaptureRequest()
        		.amount(100);
        Transaction captureResponse = shared.captureTransaction(response.getId().toString(), capture);
        assert captureResponse != null;
	}
	
	@Test
	public void voidTransactionTest() throws Gr4vyException {
		TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
				.method(MethodEnum.CARD)
				.number("4111111111111111")
				.securityCode("123")
				.expirationDate("12/26")
				.redirectUrl("https://gr4vy.com");
		
		TransactionRequest request = new TransactionRequest()
				.amount(100)
				.currency("USD")
				.paymentMethod(pm)
				.intent(IntentEnum.AUTHORIZE);
		
     	Transaction response = shared.newTransaction(request);
        assert response != null;
        
        Transaction voidResponse = shared.voidTransaction(response.getId().toString());
        assert voidResponse != null;
	}
	
	@Test
	public void refundTransactionTest() throws Gr4vyException {
		TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
				.method(MethodEnum.CARD)
				.number("4111111111111111")
				.securityCode("123")
				.expirationDate("12/26")
				.redirectUrl("https://gr4vy.com");
		
		TransactionRequest request = new TransactionRequest()
				.amount(100)
				.currency("USD")
				.paymentMethod(pm)
				.intent(IntentEnum.CAPTURE);
		
     	Transaction response = shared.newTransaction(request);
        assert response != null;
        
        String transactionId = response.getId().toString();
        
        TransactionRefundRequest refund = new TransactionRefundRequest()
        		.amount(100);
        Refund refundResponse = shared.refundTransaction(transactionId, refund);
        assert refundResponse != null;
        
        Refund checkRefund = shared.getRefund(transactionId, refundResponse.getId().toString());
        assert checkRefund.getStatus().equals(refundResponse.getStatus());
        assert checkRefund.getId().equals(refundResponse.getId());
	}
	
	 @Test
	 public void newRedirectTransactionTest() throws Gr4vyException {
	 	TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
	 			.method(MethodEnum.PAYPAL)
	 			.redirectUrl("https://gr4vy.com")
	 			.currency("GBP")
	 			.country("GB");
		
	 	TransactionRequest request = new TransactionRequest()
	 			.amount(100)
	 			.currency("GBP")
	 			.paymentMethod(pm);
		
      	Transaction response = shared.newTransaction(request);
        assert response != null;
	 }
	
	@Test
	public void newStoredTransactionTest() throws Gr4vyException {
		TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
				.id("my_stored_uuid");
		
		TransactionRequest request = new TransactionRequest()
				.amount(100)
				.currency("GBP")
				.paymentMethod(pm);
		
        try {
        	Transaction response = shared.newTransaction(request);
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
        Transactions response = shared.listTransactions();
        
        assert response != null;
    }
	
	@Test
    public void listTransactionsWithParamsTest() throws Gr4vyException {
    	Map<String, Object> params = new HashMap<String, Object>();
    	params.put("limit", 2);
    	params.put("amount_gte", "100");
    	try {
    		Transactions response = shared.listTransactions(params);
    		assert response != null;
    	}
    	catch (Gr4vyException e) {
    		System.out.println(e.getError());
    		assert false;
    	}
    }
	
	@Test
    public void listTransactionHistoryEventsTest() throws Gr4vyException {
        TransactionHistoryEvents response = shared.listEventsForTransaction("0cb94b92-aeb9-4f67-96c5-084cbaf5b66c");
        
        assert response != null;
    }
	
	@Test
	public void storePaymentMethodTest() throws Gr4vyException {
		PaymentMethodRequest pm = new PaymentMethodRequest()
				.method("card")
				.number("4111111111111111")
				.expirationDate("12/24");
     	
     	PaymentMethod response = shared.storePaymentMethod(pm);
        assert response.getId() != null;
	}
	
	@Test
	public void getPaymentMethodTest() throws Gr4vyException {		
        try {
        	PaymentMethod response = shared.getPaymentMethod("eeefe91c-9449-4730-81a4-85cd59e8d72a");
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
     	PaymentMethods response = shared.listPaymentMethods();
        assert response != null;
	}
	
	@Test
	public void listBuyerPaymentMethodsTest() throws Gr4vyException {
		try {
	     	PaymentMethods response = shared.listBuyerPaymentMethods("baa7b3b3-a4f1-49e3-afb0-0f41b48f5aa2");
	        assert response != null;
		}
		catch (Gr4vyException ex) {
			ErrorGeneric error = ex.getError();
			assertEquals(error.getDetails().get(0).getMessage(), "value is not a valid uuid"); 
		}
	}
	
	@Test
	public void listPaymentOptionsTest() throws Gr4vyException {		
		Map<String, Object> params = new HashMap<String, Object>();
     	PaymentOptions response = shared.listPaymentOptions(params);
        assert response != null;
	}

	@Test
	public void getPaymentServiceTokensTest() throws Gr4vyException {
     	PaymentMethods paymentMethods = shared.listPaymentMethods();
		PaymentMethod paymentMethod = paymentMethods.getItems().get(0);
		PaymentServiceTokens response = shared.getPaymentServiceTokens(paymentMethod.getId().toString());
        assert response != null;
	}

	@Test
    public void testVerifyWebhookHappyCase() {
        String secret = "Ik4L-8FH0ihWczctcIPXZRR_8F0fPNgmhEfVBbZ3zNwqQVa1Or4tBz4Pgw2eNaVDod7H56Y268h_wohEUaWbUg";
        String signatureHeader = "78aca0c78005107a654a957b8566fa6e0e5e06aea92d7da72a6da9e5a690d013,other";
        String timestampHeader = "1744018920";
        String payload = "payload";

        Gr4vyClient.verifyWebhook(secret, payload, signatureHeader, timestampHeader, 0);
    }

    @Test
    public void testVerifyWebhookOldTimestamp() {
        String secret = "Ik4L-8FH0ihWczctcIPXZRR_8F0fPNgmhEfVBbZ3zNwqQVa1Or4tBz4Pgw2eNaVDod7H56Y268h_wohEUaWbUg";
        String signatureHeader = "78aca0c78005107a654a957b8566fa6e0e5e06aea92d7da72a6da9e5a690d013,other";
        String timestampHeader = "1744018920";
        String payload = "payload";

        try {
            Gr4vyClient.verifyWebhook(secret, payload, signatureHeader, timestampHeader, 60);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("Timestamp too old", e.getMessage());
        }
    }

    @Test
    public void testVerifyWebhookWrongSignature() {
        String secret = "Ik4L-8FH0ihWczctcIPXZRR_8F0fPNgmhEfVBbZ3zNwqQVa1Or4tBz4Pgw2eNaVDod7H56Y268h_wohEUaWbUg";
        String signatureHeader = "other";
        String timestampHeader = "1744018920";
        String payload = "payload";

        try {
            Gr4vyClient.verifyWebhook(secret, payload, signatureHeader, timestampHeader, 0);
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("No matching signature found", e.getMessage());
        }
    }

    @Test
    public void testVerifyWebhookInvalidTimestamp() {
        String secret = "Ik4L-8FH0ihWczctcIPXZRR_8F0fPNgmhEfVBbZ3zNwqQVa1Or4tBz4Pgw2eNaVDod7H56Y268h_wohEUaWbUg";
        String signatureHeader = "78aca0c78005107a654a957b8566fa6e0e5e06aea92d7da72a6da9e5a690d013,other";
        String timestampHeader = "wrong";
        String payload = "payload";

        try {
            Gr4vyClient.verifyWebhook(secret, payload, signatureHeader, timestampHeader, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Invalid header timestamp", e.getMessage());
        }
    }

    @Test
    public void testVerifyWebhookMissingHeader() {
        String secret = "Ik4L-8FH0ihWczctcIPXZRR_8F0fPNgmhEfVBbZ3zNwqQVa1Or4tBz4Pgw2eNaVDod7H56Y268h_wohEUaWbUg";
        String timestampHeader = "1744018920";
        String payload = "payload";

        try {
            Gr4vyClient.verifyWebhook(secret, payload, null, timestampHeader, 0);
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertEquals("Missing header values", e.getMessage());
        }
    }
}