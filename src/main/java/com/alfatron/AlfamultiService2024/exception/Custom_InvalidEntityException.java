package com.alfatron.AlfamultiService2024.exception;


import java.util.List;

public class Custom_InvalidEntityException extends RuntimeException{

    private ErrorCodes errorCode;

    private List<String> errors;

    public ErrorCodes getErrorCode() {
        return errorCode;
    }

    public List<String> getErrors() {
        return errors;
    }

    public Custom_InvalidEntityException(String message) {
        super(message);
    }

    public Custom_InvalidEntityException(String message, Throwable cause) {
        super(message, cause);
    }

    public Custom_InvalidEntityException(String message, Throwable cause, ErrorCodes errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public Custom_InvalidEntityException(String message, ErrorCodes errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public Custom_InvalidEntityException(String message, ErrorCodes errorCode, List<String> errors) {
        super(message);
        this.errorCode = errorCode;
        this.errors = errors;
    }


}
