package com.example.caloriecalculator.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice(annotations = RestController.class)
public class ExceptionControllerAdvice {

    @ExceptionHandler
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public com.example.linktracker.dtos.response.ExceptionResponseDTO handlerException(MethodArgumentNotValidException e){
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        Map<String, String> details = new HashMap<>();
        fieldErrors.forEach(error-> details.put(error.getField(),error.getDefaultMessage()));
        return com.example.linktracker.dtos.response.ExceptionResponseDTO.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .msg("Error en los datos de entrada")
                .details(details)
                .build();

    }

}
