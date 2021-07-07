package com.example.caloriecalculator.repositories;

import com.example.caloriecalculator.dtos.CalorieDTO;

import java.io.IOException;

public interface DishRepository {

    CalorieDTO findCaloriesByIngredient(String ingredient) throws IOException;
}
