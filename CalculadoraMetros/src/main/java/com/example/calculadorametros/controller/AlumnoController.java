package com.example.calculadorametros.controller;

import com.example.calculadorametros.dto.request.AlumnoRequestDto;
import com.example.calculadorametros.dto.response.AlumnoResponseDto;
import com.example.calculadorametros.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @PostMapping("/diploma")
    public AlumnoResponseDto getDiploma(@Valid @RequestBody AlumnoRequestDto dto){
        return alumnoService.getDiploma(dto);
    }


}
