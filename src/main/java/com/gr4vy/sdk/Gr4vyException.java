package com.gr4vy.sdk;

public class Gr4vyException extends RuntimeException {
	
	private static final long serialVersionUID = -5295936637128625156L;
	
	private String responseData;
	private int httpCode;

	public Gr4vyException(String errorMessage) {
        super(errorMessage);
    }
	public Gr4vyException(String errorMessage, String responseData, int httpCode) {
        super(errorMessage);
        this.responseData = responseData;
        this.httpCode = httpCode;
    }
	
	public String getResponseData() {
		return this.responseData;
	}
	public int getHttpCode() {
		return this.httpCode;
	}
}
