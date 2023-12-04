
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
import java.util.concurrent.TimeUnit;

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
	private OkHttpClient okClient; 
	private String privateKeyLocation;
	private String privateKeyString = null;
	private String host;
	private String environment;
	private Boolean debug = false;
	private String merchantAccountId = "default";
	private final Gson gson = new Gson();
	private int connectTimeout = 10;
	private int writeTimeout = 10;
	private int readTimeout = 30;
	
	public static final MediaType JSON
    = MediaType.parse("application/json; charset=utf-8");
	
    /**
     * Constructor
     */
	public Gr4vyClient(String gr4vyId, String privateKeyLocation)
    {
        this.privateKeyLocation = privateKeyLocation;
        this.environment = "sandbox";
        String apiPrefix = environment == "sandbox" ? "sandbox." : "";
        this.host = "https://api." + apiPrefix + gr4vyId  + ".gr4vy.app";
        this.debug = false;
    }
	public Gr4vyClient(String gr4vyId, String privateKeyLocation, String environment)
    {
        this.privateKeyLocation = privateKeyLocation;
        this.environment = environment;
        String apiPrefix = environment == "sandbox" ? "sandbox." : "";
        this.host = "https://api." + apiPrefix + gr4vyId  + ".gr4vy.app";
        this.debug = false;
    }
    public Gr4vyClient(String gr4vyId, String privateKeyLocation, Boolean debug, String environment)
    {
        this.privateKeyLocation = privateKeyLocation;
        this.environment = environment;
        String apiPrefix = environment == "sandbox" ? "sandbox." : "";
        this.host = "https://api." + apiPrefix + gr4vyId  + ".gr4vy.app";
        this.debug = debug;
    }
    
    public void setPrivateKeyString(String privateKeyString) {
    	this.privateKeyString = privateKeyString;
    }

    public void setMerchantAccountId(String merchantAccountId) {
    	this.merchantAccountId = merchantAccountId;
    }
	
    public void setHost(String host) {
    	this.host = host;
    }
    
    public void setTimeouts(int connect, int write, int read) {
    	this.connectTimeout = connect;
    	this.writeTimeout = write;
    	this.readTimeout = read;
    }
    
    public void setClient(OkHttpClient client) {
    	this.okClient = client;
    }
    
    private OkHttpClient getClient() {
    	if (this.okClient == null) {
    		this.okClient = new OkHttpClient.Builder()
				.connectTimeout(this.connectTimeout, TimeUnit.SECONDS)
			    .writeTimeout(this.writeTimeout, TimeUnit.SECONDS)
			    .readTimeout(this.readTimeout, TimeUnit.SECONDS)
				.build();
    	}
    	return this.okClient;
    }
    
    public int getConnectTimeout() {
    	return this.connectTimeout;
    }
    
    public int getWriteTimeout() {
    	return this.writeTimeout;
    }
    
    public int getReadTimeout() {
    	return this.readTimeout;
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
	
	public String getToken(String key, String[] scopes, Map<String, Object> embed) throws IOException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException, JOSEException, ParseException {
		return getToken(key, scopes, embed, null, 60000);
	}
	
	public String getToken(String key, String[] scopes, Map<String, Object> embed, UUID checkoutSessionId) throws IOException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException, JOSEException, ParseException {
		return getToken(key, scopes, embed, checkoutSessionId, 60000);
	}

	public String getToken(String key, String[] scopes, Map<String, Object> embed, UUID checkoutSessionId, int tokenExpiryMillis) throws IOException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException, JOSEException, ParseException {
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
	    	    .issuer("Gr4vy SDK 0.19.0 - Java")
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
	    
	    return signedJWT.serialize();
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

	private String get(String endpoint) throws Gr4vyException {
		String[] scopes = {"*.read", "*.write"};
		String accessToken = null;
		try {
			accessToken = this.getToken(this.getKey(), scopes, null);
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
	
	private String post(String endpoint, String jsonBody) throws Gr4vyException {
		return this.post(endpoint, jsonBody, null);
	}

	private String post(String endpoint, String jsonBody, String idempotencyKey) throws Gr4vyException {
		String[] scopes = {"*.read", "*.write"};
		String accessToken = null;
		try {
			accessToken = this.getToken(this.getKey(), scopes, null);
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
	
	private String put(String endpoint, String jsonBody) throws Gr4vyException {
		String[] scopes = {"*.read", "*.write"};
		String accessToken = null;
		try {
			accessToken = this.getToken(this.getKey(), scopes, null);
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
	
	private boolean delete(String endpoint) throws Gr4vyException {
		String[] scopes = {"*.read", "*.write"};
		String accessToken = null;
		try {
			accessToken = this.getToken(this.getKey(), scopes, null);
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
}
