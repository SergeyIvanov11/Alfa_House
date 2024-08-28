package org.alfa.alfa_house.exception;

public class FlatNotFoundException extends RuntimeException {
    public FlatNotFoundException() {
    }

    public FlatNotFoundException(String message) {
        super(message);
    }

    public FlatNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public FlatNotFoundException(Throwable cause) {
        super(cause);
    }

    public FlatNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
