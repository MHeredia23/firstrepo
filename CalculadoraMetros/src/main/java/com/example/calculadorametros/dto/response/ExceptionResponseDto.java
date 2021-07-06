package com.example.calculadorametros.dto.response;

import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Builder
@Getter
public class ExceptionResponseDto {

    private Integer status;
    private String message;
    private Map<String, String> messageDetails;

}
