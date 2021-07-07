package com.example.calculadorametros.controller;

import com.example.calculadorametros.dto.request.CasaRequestDto;
import com.example.calculadorametros.dto.response.CasaResponseDto;
import com.example.calculadorametros.service.CasaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/casa")
@AllArgsConstructor
public class CasaController {

    private CasaService casaService;

    @PostMapping("/detail")
    public ResponseEntity<CasaResponseDto> getDetail(@Valid @RequestBody CasaRequestDto casaRequestDto){
        return new ResponseEntity<>(casaService.calculateHouse(casaRequestDto), HttpStatus.OK);
    }

}
