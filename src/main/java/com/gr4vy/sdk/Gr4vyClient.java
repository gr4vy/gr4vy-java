
package com.gr4vy.sdk;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Security;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;
import java.util.Date;
import java.util.Map;
import java.util.UUID;

import java.time.Duration;

import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECPublicKeySpec;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;

import com.google.gson.Gson;
import com.gr4vy.api.model.*;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.crypto.ECDSASigner;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.ECKey;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Gr4vyClient {
	private String host;
	private OkHttpClient okClient; 
	private String privateKeyLocation;
	private String privateKeyString;
	private String merchantAccountId;
	private Duration connectTimeout;
	private Duration writeTimeout;
	private Duration readTimeout;
	
	private final Gson gson = new Gson();
	public static final MediaType JSON
    = MediaType.parse("application/json; charset=utf-8");
	
	private CachedToken cachedToken = null;
	
    /**
     * Constructor
     */
	public Gr4vyClient(Builder builder) {
		this.host = builder.host;
		this.okClient = builder.okClient;
		this.privateKeyLocation = builder.privateKeyLocation;
		this.privateKeyString = builder.privateKeyString;
		this.merchantAccountId = builder.merchantAccountId;
		this.connectTimeout = builder.connectTimeout;
		this.writeTimeout = builder.writeTimeout;
		this.readTimeout = builder.readTimeout;
	}
	
	public static class Builder {
		private String gr4vyId = "spider";
		private String environment = "sandbox";
		private String host = null;
		private OkHttpClient okClient = null; 
		private String privateKeyLocation = null;
		private String privateKeyString = null;
		private String merchantAccountId = "default";
		private Duration connectTimeout = Duration.ofSeconds(10);
		private Duration writeTimeout = Duration.ofSeconds(10);
		private Duration readTimeout = Duration.ofSeconds(30);
		
		
		public Builder gr4vyId(String gr4vyId) {
			this.gr4vyId = gr4vyId;
			return this;
		}
		public Builder environment(String environment) {
			this.environment = environment;
			return this;
		}
		public Builder host(String host) {
			this.host = host;
			return this;
		}
		public Builder client(OkHttpClient okHttpClient) {
			this.okClient = okHttpClient;
			return this;
		}
		public Builder privateKeyString(String privateKeyString) {
			this.privateKeyString = privateKeyString;
			return this;
		}
		public Builder privateKeyLocation(String privateKeyLocation) {
			this.privateKeyLocation = privateKeyLocation;
			return this;
		}
		public Builder merchantAccountId(String merchantAccountId) {
			this.merchantAccountId = merchantAccountId;
			return this;
		}
		public Builder readTimeout(Duration read) {
			this.readTimeout = read;
			return this;
		}
		public Builder writeTimeout(Duration write) {
			this.writeTimeout = write;
			return this;
		}
		public Builder connectTimeout(Duration connect) {
			this.connectTimeout = connect;
			return this;
		}
		public Gr4vyClient build() {
			if (this.host == null) {
				String apiPrefix = this.environment.equals("sandbox") ? "sandbox." : "";
	            this.host = "https://api." + apiPrefix + this.gr4vyId  + ".gr4vy.app";
            }
            return new Gr4vyClient(this);
        }
	}
	
    public void resetCachedToken() {
    	this.cachedToken = null;
    }
    
    private OkHttpClient getClient() {
    	if (this.okClient == null) {
    		this.okClient = new OkHttpClient.Builder()
				.connectTimeout(this.connectTimeout)
			    .writeTimeout(this.writeTimeout)
			    .readTimeout(this.readTimeout)
				.build();
    	}
    	return this.okClient;
    }
    
    public long getConnectTimeout() {
    	return this.connectTimeout.getSeconds();
    }
    
    public long getWriteTimeout() {
    	return this.writeTimeout.getSeconds();
    }
    
    public long getReadTimeout() {
    	return this.readTimeout.getSeconds();
    }
	
	public String getEmbedToken(Map<String, Object> embed) throws Gr4vyException {
		return getEmbedToken(embed, null);
	}
	
	public String getEmbedToken(Map<String, Object> embed, UUID checkoutSessionId) throws Gr4vyException {
		try {
			String key = getKey();
			String[] scopes = {"embed"};
			return getToken(key, scopes, embed, checkoutSessionId);
		}
		catch (Exception e) {
			throw new Gr4vyException("Error while generating token, please make sure your private key is valid.", e);
		}
	}
	
	public String getToken(String[] scopes) throws IOException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException, JOSEException, ParseException {
		return getToken(this.getKey(), scopes, null, null, 60000);
	}
	
	public String getToken(String key, String[] scopes, Map<String, Object> embed) throws IOException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException, JOSEException, ParseException {
		return getToken(key, scopes, embed, null, 60000);
	}
	
	public String getToken(String key, String[] scopes, Map<String, Object> embed, UUID checkoutSessionId) throws IOException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException, JOSEException, ParseException {
		return getToken(key, scopes, embed, checkoutSessionId, 60000);
	}

	public String getToken(String key, String[] scopes, Map<String, Object> embed, UUID checkoutSessionId, int tokenExpiryMillis) throws IOException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException, JOSEException, ParseException {
		if (cachedToken != null && cachedToken.isValid()) {
			return cachedToken.getToken();
		}
		Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
		
		Reader reader = new StringReader(key);
	    PEMParser pemParser = new PEMParser(reader);
	    PrivateKeyInfo privateKeyInfo = (PrivateKeyInfo) pemParser.readObject();
	    pemParser.close();
	    
	    ECPrivateKey ecKey = (ECPrivateKey) new JcaPEMKeyConverter().getPrivateKey(privateKeyInfo);
	    ECKey e = new ECKey.Builder(Curve.P_521, publicFromPrivate(ecKey))
	    		.privateKey(ecKey)
	    		.build();

	    String keyId = e.computeThumbprint("SHA256").toString();
	    JWSSigner signer = new ECDSASigner(e);
	    
	    Date now = new Date();
	    Date expire = new Date(now.getTime() + tokenExpiryMillis);
	    
	    JWTClaimsSet.Builder claimsSet = new JWTClaimsSet.Builder()
	    		.jwtID(UUID.randomUUID().toString())
	    		.notBeforeTime(now)
	    	    .issueTime(now)
	    	    .issuer("Gr4vy SDK 0.22.0 - Java")
	    	    .expirationTime(expire)
	    	    .claim("scopes", scopes);
	    
	    if (embed != null) {
	    	claimsSet.claim("embed", embed);
	    }

		if(checkoutSessionId != null) {
			claimsSet.claim("checkout_session_id", checkoutSessionId);
		}

	    SignedJWT signedJWT = new SignedJWT(
	    	new JWSHeader.Builder(JWSAlgorithm.ES512).keyID(keyId).build(),
	    	claimsSet.build());
	    
	    
	    signedJWT.sign(signer);
	    
	    String token = signedJWT.serialize();
	    cachedToken = new CachedToken(token, expire.getTime());
	    return token;
	}
	
	private static ECPublicKey publicFromPrivate(ECPrivateKey key) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException {
		KeyFactory keyFactory = KeyFactory.getInstance("ECDSA", "BC");
		ECNamedCurveParameterSpec ecSpec = ECNamedCurveTable.getParameterSpec("secp521r1");
	    org.bouncycastle.math.ec.ECPoint Q = ecSpec.getG().multiply(((org.bouncycastle.jce.interfaces.ECPrivateKey) key).getD());
	    ECPublicKeySpec pubSpec = new ECPublicKeySpec(Q, ecSpec);
	    PublicKey publicKeyGenerated = keyFactory.generatePublic(pubSpec);
	    return (ECPublicKey) publicKeyGenerated;
	}
	
	public String getKey() {
		if (this.privateKeyString != null) {
			return this.privateKeyString;
		}
		String value = System.getenv("PRIVATE_KEY");
        if (value != null) {
            return value;
        }
        else {
        	if (this.privateKeyLocation == null || this.privateKeyLocation.length() < 2) {
    			throw new Gr4vyException("Unable to read private key");
    		}
        	try {
    			ClassLoader classLoader = getClass().getClassLoader();
    			File file = new File(classLoader.getResource(this.privateKeyLocation).getFile());
    			String key = new String(Files.readAllBytes(file.toPath()), Charset.defaultCharset());
    			return key;
    		} catch (IOException e) {
    			throw new Gr4vyException("Unable to find private key", e);
    		}
        }
	}

	public String get(String endpoint) throws Gr4vyException {
		String[] scopes = {"*.read", "*.write"};
		String accessToken = null;
		try {
			accessToken = this.getToken(scopes);
		} catch (Exception e2) {
			throw new Gr4vyException("Unable to generate token", e2);
		} 
		
		OkHttpClient client = this.getClient();
		
        Request request = new Request.Builder()
	      .url(this.host + endpoint)
	      .addHeader("Authorization", "Bearer " + accessToken)
	      .addHeader("X-GR4VY-MERCHANT-ACCOUNT-ID", this.merchantAccountId)
	      .addHeader("Content-Type", "application/json")
	      .build();

	    Call call = client.newCall(request);
	    Response response = null;
		try {
			response = call.execute();
		} catch (IOException e1) {
			throw new Gr4vyException("response was null", e1);
		}
		
    	String responseData = null;
		try {
			responseData = response.body().string();
		} catch (IOException e1) { }
    
		if (!response.isSuccessful()) throw new Gr4vyException("response was not successful", responseData, response.code());
		
		return responseData;
    }
	
	public String post(String endpoint, String jsonBody) throws Gr4vyException {
		return this.post(endpoint, jsonBody, null);
	}

	public String post(String endpoint, String jsonBody, String idempotencyKey) throws Gr4vyException {
		String[] scopes = {"*.read", "*.write"};
		String accessToken = null;
		try {
			accessToken = this.getToken(scopes);
		} catch (Exception e2) {
			throw new Gr4vyException("Unable to generate token", e2);
		} 
		
		OkHttpClient client = this.getClient();
		
		Request.Builder requestBuilder = new Request.Builder()
			      .url(this.host + endpoint)
			      .addHeader("Authorization", "Bearer " + accessToken)
			      .addHeader("X-GR4VY-MERCHANT-ACCOUNT-ID", this.merchantAccountId)
			      .addHeader("Content-Type", "application/json");
        
        if (idempotencyKey != null) {
        	requestBuilder.addHeader("Idempotency-Key", idempotencyKey);
        }
		if (jsonBody != null) {
			RequestBody body = RequestBody.create(jsonBody, JSON);
			requestBuilder.post(body);
		}
		else {
			RequestBody body = RequestBody.create(new byte[0], null);
			requestBuilder.post(body);
		}
		
		Request request = requestBuilder.build();
        

	    Call call = client.newCall(request);
	    Response response = null;
		try {
			response = call.execute();
		} catch (IOException e1) {
			throw new Gr4vyException("response was null", e1);
		}
    	String responseData = null;
		try {
			responseData = response.body().string();
		} catch (IOException e1) { }
		
		if (!response.isSuccessful()) throw new Gr4vyException("response was not successful", responseData, response.code());

		return responseData;
    }
	
	public String put(String endpoint, String jsonBody) throws Gr4vyException {
		String[] scopes = {"*.read", "*.write"};
		String accessToken = null;
		try {
			accessToken = this.getToken(scopes);
		} catch (Exception e2) {
			throw new Gr4vyException("Unable to generate token", e2);
		} 
		
		OkHttpClient client = this.getClient();
		
		Request.Builder requestBuilder = new Request.Builder()
			      .url(this.host + endpoint)
			      .addHeader("Authorization", "Bearer " + accessToken)
			      .addHeader("X-GR4VY-MERCHANT-ACCOUNT-ID", this.merchantAccountId)
			      .addHeader("Content-Type", "application/json");
        
		if (jsonBody != null) {
			RequestBody body = RequestBody.create(jsonBody, JSON);
			requestBuilder.put(body);
		}
		else {
			RequestBody body = RequestBody.create(new byte[0], null);
			requestBuilder.put(body);
		}
		
		Request request = requestBuilder.build();
        

	    Call call = client.newCall(request);
	    Response response = null;
		try {
			response = call.execute();
		} catch (IOException e1) {
			throw new Gr4vyException("response was null", e1);
		}
		
    	String responseData = null;
		try {
			responseData = response.body().string();
		} catch (IOException e1) { }
    
		if (!response.isSuccessful()) throw new Gr4vyException("response was not successful", responseData, response.code());

		return responseData;
    }
	
	public boolean delete(String endpoint) throws Gr4vyException {
		String[] scopes = {"*.read", "*.write"};
		String accessToken = null;
		try {
			accessToken = this.getToken(scopes);
		} catch (Exception e2) {
			throw new Gr4vyException("Unable to generate token", e2);
		} 
		
		OkHttpClient client = this.getClient();
		
		Request.Builder requestBuilder = new Request.Builder()
			      .url(this.host + endpoint)
			      .addHeader("Authorization", "Bearer " + accessToken)
			      .addHeader("X-GR4VY-MERCHANT-ACCOUNT-ID", this.merchantAccountId)
			      .addHeader("Content-Type", "application/json")
			      .delete();
        
		
		Request request = requestBuilder.build();

	    Call call = client.newCall(request);
	    Response response = null;
		try {
			response = call.execute();
		} catch (IOException e1) {
			throw new Gr4vyException("response was null", e1);
		}
		
	    if (!response.isSuccessful()) {
	    	String responseData = null;
			try {
				responseData = response.body().string();
			} catch (IOException e1) { }
			
			throw new Gr4vyException("response was not successful", responseData, response.code());
			
	    }
	    
	    return true;
    }

	public Buyer newBuyer(BuyerRequest request) {
		String response = this.post("/buyers", this.gson.toJson(request));
		return this.gson.fromJson(response,Buyer.class);
	}
	public Buyer getBuyer(String buyerId) {
		String response = this.get("/buyers/" + buyerId);
		return this.gson.fromJson(response,Buyer.class);
	}
	public Buyer updateBuyer(String buyerId, BuyerUpdate request) {
		String response = this.put("/buyers/" + buyerId, this.gson.toJson(request));
		return this.gson.fromJson(response,Buyer.class);
	}
	public Buyers listBuyers() {
		String response = this.get("/buyers");
		return this.gson.fromJson(response,Buyers.class);
	}
	public Buyers listBuyers(Map<String, Object> params) {
		String endpoint = "/buyers";
		if (params.size() > 0) {
			String encoded = Helper.urlEncodeUTF8(params);
			endpoint = endpoint + "?" + encoded;
		}
		String response = this.get(endpoint);
		return this.gson.fromJson(response,Buyers.class);
	}
	public boolean deleteBuyer(String buyerId) {
		return this.delete("/buyers/" + buyerId);
	}
	public ShippingDetail addShippingDetailsToBuyer(String buyerId, ShippingDetailRequest request) {
		String response = this.post("/buyers/" + buyerId + "/shipping-details", this.gson.toJson(request));
		return this.gson.fromJson(response, ShippingDetail.class);
	}
	public ShippingDetail updateShippingDetailsForBuyer(String buyerId, String shippingDetailId, ShippingDetailUpdateRequest request) {
		String response = this.put("/buyers/" + buyerId + "/shipping-details/" + shippingDetailId, this.gson.toJson(request));
		return this.gson.fromJson(response, ShippingDetail.class);
	}
	public boolean deleteShippingDetailsForBuyer(String buyerId, String shippingDetailId) {
		return this.delete("/buyers/" + buyerId + "/shipping-details/" + shippingDetailId);
	}
	public ShippingDetails listShippingDetailsForBuyer(String buyerId) {
		String response = this.get("/buyers/" + buyerId + "/shipping-details");
		return this.gson.fromJson(response, ShippingDetails.class);
	}

	public PaymentMethod storePaymentMethod(PaymentMethodRequest request) {
		String response = this.post("/payment-methods", this.gson.toJson(request));
		return this.gson.fromJson(response,PaymentMethod.class);
	}
	public PaymentMethod getPaymentMethod(String paymentMethodId) {
		String response = this.get("/payment-methods/" + paymentMethodId);
		return this.gson.fromJson(response,PaymentMethod.class);
	}
	public PaymentMethods listPaymentMethods() {
		String response = this.get("/payment-methods");
		return this.gson.fromJson(response,PaymentMethods.class);
	}
	public PaymentMethods listPaymentMethods(Map<String, Object> params) {
		String endpoint = "/payment-methods";
		if (params.size() > 0) {
			String encoded = Helper.urlEncodeUTF8(params);
			endpoint = endpoint + "?" + encoded;
		}
		String response = this.get(endpoint);
		return this.gson.fromJson(response,PaymentMethods.class);
	}
	public PaymentMethods listBuyerPaymentMethods(String buyerId) {
		String response = this.get("/buyers/payment-methods?buyer_id=" + buyerId);
		return this.gson.fromJson(response,PaymentMethods.class);
	}
	public boolean deletePaymentMethod(String paymentMethodId) {
		return this.delete("/payment-methods/" + paymentMethodId);
	}

	public Transaction newTransaction(TransactionRequest request) {
		String response = this.post("/transactions", this.gson.toJson(request));
        return this.gson.fromJson(response,Transaction.class);
	}
	public Transaction newTransaction(TransactionRequest request, String idempotencyKey) {
		String response = this.post("/transactions", this.gson.toJson(request), idempotencyKey);
        return this.gson.fromJson(response,Transaction.class);
	}
	public Transaction getTransaction(String transactionId) {
		String response = this.get("/transactions/" + transactionId);
		return this.gson.fromJson(response,Transaction.class);
	}
	public Transaction captureTransaction(String transactionId, TransactionCaptureRequest request) {
		String response = this.post("/transactions/" + transactionId + "/capture", this.gson.toJson(request));
		return this.gson.fromJson(response,Transaction.class);
	}
	public Transactions listTransactions() {
		String response = this.get("/transactions");
		return this.gson.fromJson(response,Transactions.class);
	}
	public Transactions listTransactions(Map<String, Object> params) {
		String endpoint = "/transactions";
		if (params.size() > 0) {
			String encoded = Helper.urlEncodeUTF8(params);
			endpoint = endpoint + "?" + encoded;
		}
		String response = this.get(endpoint);
		return this.gson.fromJson(response,Transactions.class);
	}
	public TransactionHistoryEvents listEventsForTransaction(String transactionId) {
		String response = this.get("/transactions/" + transactionId + "/events");
		return this.gson.fromJson(response,TransactionHistoryEvents.class);
	}
	public Transaction voidTransaction(String transactionId) {
		String response = this.post("/transactions/" + transactionId + "/void", null);
		return this.gson.fromJson(response,Transaction.class);
	}
	public Refund refundTransaction(String transactionId, TransactionRefundRequest request) {
		String response = this.post("/transactions/" + transactionId + "/refunds", this.gson.toJson(request));
		return this.gson.fromJson(response,Refund.class);
	}
	public Refunds listRefundsForTransaction(String transactionId) {
		String response = this.get("/transactions/" + transactionId + "/refunds");
		return this.gson.fromJson(response,Refunds.class);
	}
	public Refunds listRefundsForTransaction(String transactionId, Map<String, Object> params) {
		String endpoint = "/transactions/" + transactionId + "/refunds";
		if (params.size() > 0) {
			String encoded = Helper.urlEncodeUTF8(params);
			endpoint = endpoint + "?" + encoded;
		}
		String response = this.get(endpoint);
		return this.gson.fromJson(response,Refunds.class);
	}
	public Refund getRefund(String transactionId, String refundId) {
		String endpoint = "/transactions/" + transactionId + "/refunds/" + refundId;
		String response = this.get(endpoint);
		return this.gson.fromJson(response,Refund.class);
	}
	
	public CheckoutSession newCheckoutSession(CheckoutSessionCreateRequest request) {
		String response = this.post("/checkout/sessions", this.gson.toJson(request));
		return this.gson.fromJson(response,CheckoutSession.class);
	}
	public CheckoutSession getCheckoutSession(String checkoutSessionId) {
		String response = this.get("/checkout/sessions/" + checkoutSessionId);
		return this.gson.fromJson(response, CheckoutSession.class);
	}
	public CheckoutSession updateCheckoutSession(String checkoutSessionId, CheckoutSessionUpdateRequest request) {
		String response = this.put("/checkout/sessions/" + checkoutSessionId, this.gson.toJson(request));
		return this.gson.fromJson(response,CheckoutSession.class);
	}
	public boolean deleteCheckoutSession(String checkoutSessionId) {
		return this.delete("/checkout/sessions/" + checkoutSessionId);
	}
	
	public PaymentOptions listPaymentOptions(Map<String, Object> params) {
		String endpoint = "/payment-options";
		if (params.size() > 0) {
			String encoded = Helper.urlEncodeUTF8(params);
			endpoint = endpoint + "?" + encoded;
		}
		String response = this.get(endpoint);
		return this.gson.fromJson(response, PaymentOptions.class);
	}
	public PaymentOptions listPaymentOptions(PaymentOptionsRequest request) {
		String response = this.post("/payment-options", this.gson.toJson(request));
		return this.gson.fromJson(response, PaymentOptions.class);
	}

	public PaymentServiceToken newPaymentServiceToken(String paymentMethodId, PaymentServiceTokenRequest request) {
		String response = this.post("/payment-methods/" + paymentMethodId + "/payment-service-tokens", this.gson.toJson(request));
		return this.gson.fromJson(response, PaymentServiceToken.class);
	}

	public PaymentServiceToken getPaymentServiceTokens(String paymentMethodId) {
		String response = this.get("/payment-methods/" + paymentMethodId + "/payment-service-tokens");
		return this.gson.fromJson(response, PaymentServiceToken.class);
	}

	public boolean deletePaymentServiceToken(String paymentMethodId, String paymentServiceTokenId) {
		return this.delete("/payment-methods/" + paymentMethodId + "/payment-service-tokens/" + paymentServiceTokenId);
	}
}

