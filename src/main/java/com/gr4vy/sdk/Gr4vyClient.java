
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

import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.jce.spec.ECPublicKeySpec;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;

import com.gr4vy.api.ApiClient;
import com.gr4vy.api.Configuration;
import com.gr4vy.api.auth.*;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSSigner;
import com.nimbusds.jose.crypto.ECDSASigner;
import com.nimbusds.jose.jwk.Curve;
import com.nimbusds.jose.jwk.ECKey;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;

public class Gr4vyClient {
	private String gr4vyId;
	private String privateKeyLocation;
	private String host;
	private String environment;
	private Boolean debug = false;
	private String merchantAccountId = "default";
	private UUID checkoutSessionId;

    /**
     * Constructor
     */
	public Gr4vyClient(String gr4vyId, String privateKeyLocation)
    {
        this.gr4vyId = gr4vyId;
        this.privateKeyLocation = privateKeyLocation;
        this.environment = "sandbox";
        String apiPrefix = environment == "sandbox" ? "sandbox." : "";
        this.host = "https://api." + apiPrefix + gr4vyId  + ".gr4vy.app";
        this.debug = false;
    }
	public Gr4vyClient(String gr4vyId, String privateKeyLocation, String environment)
    {
        this.gr4vyId = gr4vyId;
        this.privateKeyLocation = privateKeyLocation;
        this.environment = environment;
        String apiPrefix = environment == "sandbox" ? "sandbox." : "";
        this.host = "https://api." + apiPrefix + gr4vyId  + ".gr4vy.app";
        this.debug = false;
    }
    public Gr4vyClient(String gr4vyId, String privateKeyLocation, Boolean debug, String environment)
    {
        this.gr4vyId = gr4vyId;
        this.privateKeyLocation = privateKeyLocation;
        this.environment = environment;
        String apiPrefix = environment == "sandbox" ? "sandbox." : "";
        this.host = "https://api." + apiPrefix + gr4vyId  + ".gr4vy.app";
        this.debug = debug;
    }

    public void setMerchantAccountId(String merchantAccountId) {
    	this.merchantAccountId = merchantAccountId;
    }
	
    public void setHost(String host) {
    	this.host = host;
    }
	public ApiClient getClient() throws Gr4vyException {
		try {
			ApiClient defaultClient = Configuration.getDefaultApiClient();
			defaultClient.setBasePath(this.host);
			defaultClient.addDefaultHeader("X-GR4VY-MERCHANT-ACCOUNT-ID", this.merchantAccountId);

			String key = getKey();
			
			String[] scopes = {"*.read", "*.write"};
			
			String token = getToken(key, scopes, null);
			
			HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
			BearerAuth.setBearerToken(token);
			
			return defaultClient;
		} catch (Exception e) {
			throw new Gr4vyException("Error while generating token, please make sure your private key is valid.");
		}
	}
	
	public String getEmbedToken(Map<String, Object> embed) throws Gr4vyException {
		try {
			String key = getKey();
			String[] scopes = {"embed"};
			return getToken(key, scopes, embed);
		}
		catch (Exception e) {
			throw new Gr4vyException("Error while generating token, please make sure your private key is valid.");
		}
	}

	public String getEmbedToken(Map<String, Object> embed, UUID checkoutSessionId) throws Gr4vyException {
		try {
			String key = getKey();
			String[] scopes = {"embed"};
			return getToken(key, scopes, embed, checkoutSessionId);
		}
		catch (Exception e) {
			throw new Gr4vyException("Error while generating token, please make sure your private key is valid.");
		}
	}
	
	public String getToken(String key, String[] scopes, Map<String, Object> embed) throws IOException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException, JOSEException, ParseException {
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
	    Date expire = new Date(now.getTime() + 60 * 1000);
	    
	    JWTClaimsSet.Builder claimsSet = new JWTClaimsSet.Builder()
	    		.jwtID(UUID.randomUUID().toString())
	    		.notBeforeTime(now)
	    	    .issueTime(now)
	    	    .issuer("Gr4vy SDK 0.1.0 - Java")
	    	    .expirationTime(expire)
	    	    .claim("scopes", scopes);
	    
	    if (embed != null) {
	    	claimsSet.claim("embed", embed);
	    }

	    SignedJWT signedJWT = new SignedJWT(
	    	new JWSHeader.Builder(JWSAlgorithm.ES512).keyID(keyId).build(),
	    	claimsSet.build());
	    
	    
	    signedJWT.sign(signer);
	    
	    return signedJWT.serialize();
	}

	public String getToken(String key, String[] scopes, Map<String, Object> embed, UUID checkoutSessionId) throws IOException, NoSuchAlgorithmException, NoSuchProviderException, InvalidKeySpecException, JOSEException, ParseException {
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
	    Date expire = new Date(now.getTime() + 60 * 1000);
	    
	    JWTClaimsSet.Builder claimsSet = new JWTClaimsSet.Builder()
	    		.jwtID(UUID.randomUUID().toString())
	    		.notBeforeTime(now)
	    	    .issueTime(now)
	    	    .issuer("Gr4vy SDK 0.1.0 - Java")
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
    			throw new Gr4vyException("Unable to find private key");
    		}
        }
	}
}
