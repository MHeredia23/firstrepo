package com.example.caloriecalculator.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalorieDTO {

    private String name;
    private Integer calories;
}
