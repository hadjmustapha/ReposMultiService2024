package com.alfatron.AlfamultiService2024.exception;

import lombok.Getter;

import java.util.List;

public class Custom_InvalidEntityException extends RuntimeException{

    @Getter
    private ErrorCodes errorCode;
    @Getter
    private List<String> errors;

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
