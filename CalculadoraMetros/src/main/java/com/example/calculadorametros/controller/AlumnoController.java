package com.example.calculadorametros.controller;

import com.example.calculadorametros.dto.request.AlumnoRequestDto;
import com.example.calculadorametros.dto.response.AlumnoResponseDto;
import com.example.calculadorametros.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity <AlumnoResponseDto> getDiploma(@Valid @RequestBody AlumnoRequestDto dto){
        return new ResponseEntity<>(alumnoService.getDiploma(dto), HttpStatus.OK);
    }


}
