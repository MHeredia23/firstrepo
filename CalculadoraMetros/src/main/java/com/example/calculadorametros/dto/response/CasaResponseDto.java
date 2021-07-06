package com.example.calculadorametros.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CasaResponseDto {

    private Double metrosCuadradosTotales;
    private Double valor;
    private HabitacionResponseDto habitacionMasGrande;
    private Map<String, Double> metrosCuadradosPorHabitacion;


}
