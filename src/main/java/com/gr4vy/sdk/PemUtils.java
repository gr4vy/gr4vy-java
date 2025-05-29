package com.gr4vy.sdk;

import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.openssl.PEMKeyPair;
import org.bouncycastle.openssl.PEMParser;
import org.bouncycastle.openssl.jcajce.JcaPEMKeyConverter;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.StringReader;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.interfaces.ECPrivateKey;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class PemUtils {

    static {
        if (Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) == null) {
            Security.addProvider(new BouncyCastleProvider());
        }
    }

    public static PrivateKey getPrivateKeyFromPem(String privateKeyPem) throws IOException, GeneralSecurityException {
        try (PEMParser pemParser = new PEMParser(new StringReader(privateKeyPem))) {
            Object object = pemParser.readObject();

            JcaPEMKeyConverter converter = new JcaPEMKeyConverter().setProvider(BouncyCastleProvider.PROVIDER_NAME);

            if (object instanceof PEMKeyPair) {
                return converter.getKeyPair((PEMKeyPair) object).getPrivate();
            } else if (object instanceof PrivateKeyInfo) {
                return converter.getPrivateKey((PrivateKeyInfo) object);
            } else if (object instanceof PrivateKey) {
                return (PrivateKey) object;
            } else {
                throw new IllegalArgumentException("Unsupported PEM object type: " + object.getClass().getName());
            }
        }
    }

    public static String calculateJwkThumbprint(PrivateKey privateKey) throws Exception {
        if (!(privateKey instanceof ECPrivateKey)) {
            throw new IllegalArgumentException("Expected EC private key.");
        }

        ECPrivateKey ecPrivateKey = (ECPrivateKey) privateKey;
        BigInteger d = ecPrivateKey.getS();

        ECNamedCurveParameterSpec curveSpec = ECNamedCurveTable.getParameterSpec("P-521");
        ECPoint pubPoint = curveSpec.getG().multiply(d).normalize();

        String x = base64UrlFixedLength(pubPoint.getAffineXCoord().toBigInteger(), 66);
        String y = base64UrlFixedLength(pubPoint.getAffineYCoord().toBigInteger(), 66);

        Map<String, String> jwk = new TreeMap<>();
        jwk.put("crv", "P-521");
        jwk.put("kty", "EC");
        jwk.put("x", x);
        jwk.put("y", y);

        ObjectMapper mapper = new ObjectMapper();
        String canonicalJson = mapper.writeValueAsString(jwk);  // TreeMap ensures sorted keys

        MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
        byte[] digest = sha256.digest(canonicalJson.getBytes(StandardCharsets.UTF_8));

        return java.util.Base64.getUrlEncoder().withoutPadding().encodeToString(digest);
    }    

    private static String base64UrlFixedLength(BigInteger value, int byteLength) {
        byte[] bytes = value.toByteArray();

        if (bytes.length > 1 && bytes[0] == 0x00) {
            bytes = Arrays.copyOfRange(bytes, 1, bytes.length);
        }

        if (bytes.length < byteLength) {
            byte[] padded = new byte[byteLength];
            System.arraycopy(bytes, 0, padded, byteLength - bytes.length, bytes.length);
            bytes = padded;
        }

        return java.util.Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
    }
}