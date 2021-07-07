package com.example.calculadorametros.controller;

import com.example.calculadorametros.dto.request.EdadRequestDto;
import com.example.calculadorametros.dto.response.EdadResponseDto;
import com.example.calculadorametros.handler.CalculadoraEdadHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/persona")
public class EdadController {

    @GetMapping("/calculate/{day}/{month}/{year}")
    public ResponseEntity<EdadResponseDto> calculateAge(@PathVariable String day, @PathVariable String month, @PathVariable String year){
        return new ResponseEntity<>(CalculadoraEdadHandler.calculateAge(day, month, year), HttpStatus.OK);
    }

    @PostMapping("/calculate")
    public ResponseEntity<EdadResponseDto> calculateAge(@Valid @RequestBody EdadRequestDto request){
        return new ResponseEntity<>(
                CalculadoraEdadHandler.calculateAge(request.getDay(), request.getMonth(), request.getYear()),
                HttpStatus.OK);
    }


}
