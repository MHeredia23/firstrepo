package com.example.caloriecalculator.repositories;


import com.example.caloriecalculator.dtos.CalorieDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Repository
@AllArgsConstructor
public class DishRepositoryImpl implements DishRepository{

    private final String URL_FILE = "classpath:static/food.json";

    @Override
    public CalorieDTO findCaloriesByIngredient(String ingredient) throws IOException {
        List<CalorieDTO> calorieDTOS = loadDataBase();
        CalorieDTO calorieDTO = null;
        if(Objects.nonNull(calorieDTOS)){
           Optional<CalorieDTO> valor = calorieDTOS.stream()
                   .filter(calorie-> calorie.getName().equalsIgnoreCase(ingredient))
                   .findFirst();
           if(valor.isPresent()) calorieDTO = valor.get();
        }
        return calorieDTO;
    }

    private List<CalorieDTO> loadDataBase() throws IOException {
        File file = ResourceUtils.getFile(URL_FILE);
        return mapCalorieDto(file);
    }

    private List<CalorieDTO> mapCalorieDto(File file) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(file, new TypeReference<>() {});
    }
}
