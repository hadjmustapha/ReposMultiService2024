package com.alfatron.AlfamultiService2024.exception;

import lombok.Getter;

public class Custom_EntityNotFoundException extends RuntimeException{

    @Getter
    private ErrorCodes errorCode;

    public Custom_EntityNotFoundException(String message) {
        super(message);
    }

    public Custom_EntityNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public Custom_EntityNotFoundException(String message, Throwable cause, ErrorCodes errorCode) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public Custom_EntityNotFoundException(String message, ErrorCodes errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
