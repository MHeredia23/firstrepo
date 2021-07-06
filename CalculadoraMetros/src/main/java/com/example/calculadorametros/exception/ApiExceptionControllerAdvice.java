package com.example.calculadorametros.exception;

import com.example.calculadorametros.dto.response.ExceptionResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice(annotations = RestController.class)
public class ApiExceptionControllerAdvice {

    @ExceptionHandler
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ExceptionResponseDto exceptionHandler(MethodArgumentNotValidException exception){
        List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
        Map<String, String> details = new HashMap<>();
        fieldErrors.forEach(fe-> details.put(fe.getField(),fe.getDefaultMessage()));
        return ExceptionResponseDto.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .message("Existen errores en el body enviado")
                .messageDetails(details)
                .build();
    }


}
