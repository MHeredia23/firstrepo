package com.example.calculadorametros.service;

import com.example.calculadorametros.dto.request.AlumnoRequestDto;
import com.example.calculadorametros.dto.response.AlumnoResponseDto;

public interface AlumnoService {

    AlumnoResponseDto getDiploma(AlumnoRequestDto alumnoRequestDto);

}
