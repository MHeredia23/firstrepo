package com.example.calculadorametros.service;

import com.example.calculadorametros.dto.request.AlumnoRequestDto;
import com.example.calculadorametros.dto.response.AlumnoResponseDto;
import org.springframework.stereotype.Service;

@Service
public class AlumnoServiceImp implements AlumnoService {

    private final Double FELICITACIONES = 9.0;

    @Override
    public AlumnoResponseDto getDiploma(AlumnoRequestDto alumnoRequestDto) {
        Double promedio = alumnoRequestDto.getNotas().stream().mapToDouble(n-> n.nota).sum();
        promedio = promedio/alumnoRequestDto.getNotas().size();
        return new AlumnoResponseDto(alumnoRequestDto.getNombre(),
                promedio,
                promedio>=FELICITACIONES ? "Felicitaciones tienes un promedio de Honor!!!" : "");
    }
}
