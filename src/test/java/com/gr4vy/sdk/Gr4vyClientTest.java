package com.gr4vy.sdk;

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
		
		CheckoutSession checkoutSession = client.newCheckoutSession(null);
		
		Map<String, Object> embed = new HashMap<String, Object>();
		embed.put("amount", 1299);
		embed.put("currency", "USD");

		String token = client.getEmbedToken(embed, checkoutSession.getId());
		assert token != null;
	}
	
	@Test
    public void getTokenTest() throws Gr4vyException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException, IOException, JOSEException, ParseException {
    	Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
		
		String key = client.getKey();
		String[] scopes = {"*.read", "*.write"};
		String token = client.getToken(key, scopes, null);
		
        assert token != null;
    }
	
	@Test
	public void addBuyersTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
     	BuyerRequest buyer = new BuyerRequest();
     	buyer.setDisplayName("newJava Test");
     	Buyer response = client.newBuyer(buyer);
        assert response.getId() != null;
	}
	
	@Test
	public void updateBuyersTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
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
    	Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
    	
        Buyers response = client.listBuyers();
        
        assert response != null;
    }
	
	@Test
	public void newCheckoutSessionTransactionTest() throws Gr4vyException {
		/*Test cannot be run because checkout session is empty*/
		Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
		
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
	     	System.out.println(response);
	     	assert response != null;
		}
		catch (Gr4vyException e) {
			System.out.print(e.getHttpCode());
			System.out.print(e.getResponseData());
			assert false;
		}
        
	}
	
	 @Test
	 public void newTransactionTest() throws Gr4vyException {
	 	Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
		
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
     	System.out.println(response);
        assert response != null;
	 }

	 @Test
	 public void newTransactionWithIdempotencyTest() throws Gr4vyException {
	 	Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
		
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
     	System.out.println(response);
        assert response != null;
	 }
	
	@Test
	public void captureTransactionTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
		
		TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
				.method(MethodEnum.CARD)
				.number("4111111111111111")
				.securityCode("123")
				.expirationDate("12/23");
		
		TransactionRequest request = new TransactionRequest()
				.amount(100)
				.currency("USD")
				.paymentMethod(pm)
				.intent(IntentEnum.AUTHORIZE);
		
     	Transaction response = client.newTransaction(request);
     	System.out.println(response);
        assert response != null;
        
        TransactionCaptureRequest capture = new TransactionCaptureRequest()
        		.amount(100);
        Transaction captureResponse = client.captureTransaction(response.getId().toString(), capture);
     	System.out.println(captureResponse);
        assert captureResponse != null;
	}
	
	@Test
	public void voidTransactionTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
		
		TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
				.method(MethodEnum.CARD)
				.number("4111111111111111")
				.securityCode("123")
				.expirationDate("12/23");
		
		TransactionRequest request = new TransactionRequest()
				.amount(100)
				.currency("USD")
				.paymentMethod(pm)
				.intent(IntentEnum.AUTHORIZE);
		
     	Transaction response = client.newTransaction(request);
     	System.out.println(response);
        assert response != null;
        
        Transaction voidResponse = client.voidTransaction(response.getId().toString());
     	System.out.println(voidResponse);
        assert voidResponse != null;
	}
	
	@Test
	public void refundTransactionTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
		
		TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
				.method(MethodEnum.CARD)
				.number("4111111111111111")
				.securityCode("123")
				.expirationDate("12/23");
		
		TransactionRequest request = new TransactionRequest()
				.amount(100)
				.currency("USD")
				.paymentMethod(pm)
				.intent(IntentEnum.CAPTURE);
		
     	Transaction response = client.newTransaction(request);
     	System.out.println(response);
        assert response != null;
        
        TransactionRefundRequest refund = new TransactionRefundRequest()
        		.amount(100);
        Refund refundResponse = client.refundTransaction(response.getId().toString(), refund);
     	System.out.println(refundResponse);
        assert refundResponse != null;
	}
	
	 @Test
	 public void newRedirectTransactionTest() throws Gr4vyException {
	 	Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
		
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
      	System.out.println(response);
         assert response != null;
	 }
	
	@Test
	public void newStoredTransactionTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
		
		TransactionPaymentMethodRequest pm = new TransactionPaymentMethodRequest()
				.id("my_stored_uuid");
		
		TransactionRequest request = new TransactionRequest()
				.amount(100)
				.currency("GBP")
				.paymentMethod(pm);
		
     	Transaction response = client.newTransaction(request);
     	System.out.println(response);
        assert response != null;
	}
	
	@Test
    public void listTransactionsTest() throws Gr4vyException {
    	Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");

        Transactions response = client.listTransactions();
        
        assert response != null;
    }
	
	@Test
	public void storePaymentMethodTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
		PaymentMethodRequest pm = new PaymentMethodRequest()
				.method("card")
				.number("4111111111111111")
				.expirationDate("12/24");
     	
     	PaymentMethod response = client.storePaymentMethod(pm);
        assert response.getId() != null;
	}
	
	@Test
	public void getPaymentMethodTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
		
     	PaymentMethod response = client.getPaymentMethod("eeefe91c-9449-4730-81a4-85cd59e8d72a");
        assert response.getId() != null;
	}
	
	@Test
	public void listPaymentMethodsTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
		
     	PaymentMethods response = client.listPaymentMethods();
        assert response != null;
	}
	
	@Test
	public void listBuyerPaymentMethodsTest() throws Gr4vyException {
		Gr4vyClient client = new Gr4vyClient("spider", "private_key.pem", "sandbox");
		
     	PaymentMethods response = client.listBuyerPaymentMethods("");
     	System.out.println(response);
        assert response != null;
	}


}