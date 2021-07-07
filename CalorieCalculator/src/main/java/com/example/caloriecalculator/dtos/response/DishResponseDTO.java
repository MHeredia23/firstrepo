package com.example.caloriecalculator.dtos.response;

import lombok.Data;

import java.util.List;

@Data
public class DishResponseDTO {

    private String name;
    private Integer totalCalorie;
    private List<IngredientsResponseDTO> ingredients;
    private IngredientsResponseDTO ingredientMoreCalorie;

}
