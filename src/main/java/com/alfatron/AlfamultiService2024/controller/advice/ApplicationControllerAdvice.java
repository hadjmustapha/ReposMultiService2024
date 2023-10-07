package com.alfatron.AlfamultiService2024.controller.advice;

import com.alfatron.AlfamultiService2024.exception.Custom_EntityNotFoundException;
import com.alfatron.AlfamultiService2024.exception.Custom_InvalidEntityException;
import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import com.alfatron.AlfamultiService2024.exception.ErrorDto;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@ControllerAdvice
public class ApplicationControllerAdvice {

    @ResponseStatus(NOT_FOUND)
    @ExceptionHandler(Custom_EntityNotFoundException.class)
    public @ResponseBody ErrorDto handleException(Custom_EntityNotFoundException exception){
        return new ErrorDto(HttpStatus.NOT_FOUND,exception.getErrorCode(),exception.getMessage(),null);
    }
    //EntityNotFoundException
    @ResponseStatus(NOT_FOUND)
    @ExceptionHandler(EntityNotFoundException.class)
    public @ResponseBody ErrorDto handleException2(EntityNotFoundException exception){
        return new ErrorDto(HttpStatus.NOT_FOUND,null,exception.getMessage(),null);
    }

    @ResponseStatus(BAD_REQUEST)
    @ExceptionHandler(Custom_InvalidEntityException.class)
    public @ResponseBody ErrorDto handleException3(Custom_InvalidEntityException exception){
        return new ErrorDto(HttpStatus.BAD_REQUEST, ErrorCodes.ORDRE_DE_MISSION_NOT_VALID,exception.getMessage(),exception.getErrors());
    }

}
