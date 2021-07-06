package com.example.calculadorametros.handler;

import com.example.calculadorametros.dto.response.EdadResponseDto;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CalculadoraEdadHandler {

    public static EdadResponseDto calculateAge(String day, String month, String year){
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse(day+"/"+month+"/"+year, fmt);
        LocalDate ahora = LocalDate.now();
        Period periodo = Period.between(fechaNac, ahora);
        String age = "Tu edad es:"+periodo.getYears();
        return new EdadResponseDto(day,year,year,age);
    }

}
