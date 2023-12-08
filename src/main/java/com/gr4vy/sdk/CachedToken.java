package com.gr4vy.sdk;

import java.time.Instant;

public class CachedToken {
	private final long LEEWAY = 200;
	private String token;
	private long expiresAt;
	
	public CachedToken(String token, long expiresAt) {
		this.token = token;
		this.expiresAt = expiresAt;
	}
	
	public Boolean isValid() {
		long now = Instant.now().toEpochMilli();
		// Add leeway in millis to give time for the HTTP request
		return now < (expiresAt - LEEWAY);
	}
	
	public Boolean hasExpired() {
		return !this.isValid();
	}
	
	public String getToken() {
		return this.token;
	}
}
