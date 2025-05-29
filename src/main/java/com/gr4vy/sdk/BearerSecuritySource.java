package com.gr4vy.sdk;

import java.util.List;

import com.gr4vy.sdk.models.components.Security;

public class BearerSecuritySource implements SecuritySource {
    private final String privateKey;
    private final List<JWTScope> scopes;
    private final long expiresInSeconds;
    private final String issuer;

    public BearerSecuritySource(Builder builder) {
        this.privateKey = builder.privateKey;
        this.scopes = builder.scopes;
        this.expiresInSeconds = builder.expiresInSeconds;
        this.issuer = builder.issuer;
    }

    public Security getSecurity() {
        String token = null;
        try {
            token = Auth.getToken(this.privateKey, this.scopes, this.expiresInSeconds, null, null, this.issuer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Security.builder()
            .bearerAuth(token)
            .build();
    }

    public static class Builder {
        private final String privateKey;
        private List<JWTScope> scopes = null;
        private long expiresInSeconds = 3600;
        private String issuer = null;

        public Builder (String privateKey) {
            this.privateKey = privateKey;
        }

        public Builder scopes(List<JWTScope> scopes) {
            this.scopes = scopes;
            return this;
        }

        public Builder expiresInSeconds(long expiresInSeconds) {
            this.expiresInSeconds = expiresInSeconds;
            return this;
        }

        public Builder issuer(String issuer) {
            this.issuer = issuer;
            return this;
        }

        public BearerSecuritySource build() {
            return new BearerSecuritySource(this);
        }
    }
}
