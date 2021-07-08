package com.example.linktracker.exceptions;

import com.example.linktracker.dtos.response.ExceptionResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice(annotations = RestController.class)
public class ApiControllerAdvice {

    @ExceptionHandler
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ExceptionResponseDTO exceptionHandler(MethodArgumentNotValidException ex){
        List<FieldError> errorList = ex.getBindingResult().getFieldErrors();
        Map<String, String> detail = new HashMap<>();
        errorList.forEach(e-> detail.put(e.getField(),e.getDefaultMessage()));
        return ExceptionResponseDTO.builder()
                .status(HttpStatus.BAD_REQUEST.value())
                .msg("Bad Request:")
                .details(detail)
                .build();
    }

    @ExceptionHandler
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ExceptionResponseDTO notFoundUrl(NotFoundUrl ex){
        return ExceptionResponseDTO.builder()
                .status(HttpStatus.NOT_FOUND.value())
                .msg(ex.ERROR)
                .details(null)
                .build();
    }

    @ExceptionHandler
    @ResponseBody
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ExceptionResponseDTO forbidenAcces(PasswordNecesary ex){
        return ExceptionResponseDTO.builder()
                .status(HttpStatus.FORBIDDEN.value())
                .msg(ex.ERROR)
                .details(null)
                .build();
    }

}
