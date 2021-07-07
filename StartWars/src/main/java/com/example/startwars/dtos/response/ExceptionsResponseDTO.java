package com.example.startwars.dtos.response;

import lombok.Builder;
import lombok.Getter;

import java.util.Map;

@Builder
@Getter
public class ExceptionsResponseDTO {

    private Integer status;
    private String message;
    private Map<String, String> details;

}
