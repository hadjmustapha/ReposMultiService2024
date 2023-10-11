package com.alfatron.AlfamultiService2024.exception;


import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;


public class ErrorDto {

    private HttpStatus httpCode;

    private ErrorCodes code;

    private String message;

    private List<String> errors = new ArrayList<>();

    public ErrorDto() {
    }

    public ErrorDto(HttpStatus httpCode, ErrorCodes code, String message, List<String> errors) {
        this.httpCode = httpCode;
        this.code = code;
        this.message = message;
        this.errors = errors;
    }

    public HttpStatus getHttpCode() {
        return httpCode;
    }

    public void setHttpCode(HttpStatus httpCode) {
        this.httpCode = httpCode;
    }

    public ErrorCodes getCode() {
        return code;
    }

    public void setCode(ErrorCodes code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
        this.errors = errors;
    }
}
