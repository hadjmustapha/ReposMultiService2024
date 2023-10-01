package com.alfatron.AlfamultiService2024.exception;

import com.alfatron.AlfamultiService2024.exception.ErrorCodes;
import lombok.*;
import org.springframework.http.HttpStatus;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ErrorDto {

    private HttpStatus httpCode;

    private ErrorCodes code;

    private String message;

    private List<String> errors = new ArrayList<>();
}
