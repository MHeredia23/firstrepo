package com.example.calculadorametros.controller;

import com.example.calculadorametros.dto.request.EdadRequestDto;
import com.example.calculadorametros.dto.response.EdadResponseDto;
import com.example.calculadorametros.handler.CalculadoraEdadHandler;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/persona")
public class EdadController {

    @GetMapping("/calculate/{day}/{month}/{year}")
    public EdadResponseDto calculateAge(@PathVariable String day, @PathVariable String month, @PathVariable String year){
        return CalculadoraEdadHandler.calculateAge(day,month,year);
    }

    @PostMapping("/calculate")
    public EdadResponseDto calculateAge(@Valid @RequestBody EdadRequestDto request){
        return CalculadoraEdadHandler.calculateAge(request.getDay(), request.getMonth(), request.getYear());
    }


}
