package com.example.caloriecalculator.controllers;

import com.example.caloriecalculator.dtos.response.DishResponseDTO;
import com.example.caloriecalculator.dtos.resquest.DishRequestDTO;
import com.example.caloriecalculator.services.DishService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/dish")
public class DishController {

    private  DishService dishService;

    @PostMapping("/calorie")
    public ResponseEntity<DishResponseDTO> getCalorieOneDish(@Valid @RequestBody DishRequestDTO requestDTO){
        return new ResponseEntity<>(dishService.calculateCalorie(requestDTO), HttpStatus.OK);
    }

    @PostMapping("/calories")
    public ResponseEntity<List<DishResponseDTO>> getCalorieOneDish(@Valid @RequestBody List<DishRequestDTO> requestDTO){
        return new ResponseEntity<>(dishService.calculateCalorie(requestDTO), HttpStatus.OK);
    }

}
