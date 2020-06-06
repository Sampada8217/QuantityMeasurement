package com.QuantityMeasurement;

public class QuantityException extends RuntimeException {
    public enum ExceptionType {
        NULL_VALUE_EXCEPTION, WRONG_CONVERSION
    }

    public ExceptionType type;

    public QuantityException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}

