package com.example.caloriecalculator.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class IngredientsResponseDTO {

    private String name;
    private Integer weight;
    private Integer calorie;

}
