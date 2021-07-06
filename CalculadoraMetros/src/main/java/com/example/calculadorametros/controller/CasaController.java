package com.example.calculadorametros.controller;

import com.example.calculadorametros.dto.request.CasaRequestDto;
import com.example.calculadorametros.dto.response.CasaResponseDto;
import com.example.calculadorametros.service.CasaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/casa")
@AllArgsConstructor
public class CasaController {

    private CasaService casaService;

    @PostMapping("/detail")
    public CasaResponseDto getDetail(@Valid @RequestBody CasaRequestDto casaRequestDto){
        return casaService.calculateHouse(casaRequestDto);
    }

}
