package com.gr4vy.sdk;

import com.google.gson.Gson;
import com.gr4vy.api.model.ErrorGeneric;

public class Gr4vyException extends RuntimeException {
	
	private static final long serialVersionUID = -5295936637128625156L;
	private final Gson gson = new Gson();
	
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
	public Gr4vyException(String errorMessage, Exception e) {
		super(errorMessage, e);
	}
	
	public String getResponseData() {
		return this.responseData;
	}
	public int getHttpCode() {
		return this.httpCode;
	}
	
	public ErrorGeneric getError() {
		if (responseData != null) {
			return this.gson.fromJson(responseData, ErrorGeneric.class);
		}
		return null;
	}
	public boolean hasError() {
		return responseData != null;
	}
}
