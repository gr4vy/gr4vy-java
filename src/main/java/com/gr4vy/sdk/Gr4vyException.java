package com.gr4vy.sdk;

public class Gr4vyException extends RuntimeException {
	
	private static final long serialVersionUID = -5295936637128625156L;

	public Gr4vyException(String errorMessage) {
        super(errorMessage);
    }
}
