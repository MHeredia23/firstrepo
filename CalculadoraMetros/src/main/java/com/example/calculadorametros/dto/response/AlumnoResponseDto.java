package com.example.calculadorametros.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AlumnoResponseDto {

    private String alumno;
    private Double promedio;
    private String mensaje;

}
