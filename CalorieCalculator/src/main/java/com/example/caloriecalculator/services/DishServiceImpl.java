package com.example.caloriecalculator.services;

import com.example.caloriecalculator.dtos.CalorieDTO;
import com.example.caloriecalculator.dtos.response.DishResponseDTO;
import com.example.caloriecalculator.dtos.response.IngredientsResponseDTO;
import com.example.caloriecalculator.dtos.resquest.DishRequestDTO;
import com.example.caloriecalculator.dtos.resquest.IngredientsRequestDTO;
import com.example.caloriecalculator.repositories.DishRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class DishServiceImpl implements DishService{

    private final DishRepository dishRepository;

    @Override
    public DishResponseDTO calculateCalorie(DishRequestDTO dto) {
        DishResponseDTO dishResponseDTO = new DishResponseDTO();
        dishResponseDTO.setName(dto.getName());
        dishResponseDTO.setIngredients(ingredientRequestToResponse(dto.getIngredients()));
        dishResponseDTO.setTotalCalorie(dishResponseDTO.getIngredients().stream()
                .mapToInt(IngredientsResponseDTO::getCalorie)
                .sum());
        dishResponseDTO.setIngredientMoreCalorie(dishResponseDTO.getIngredients().stream()
                .max(Comparator.comparing(IngredientsResponseDTO::getCalorie)).get());
        return dishResponseDTO;
    }

    @Override
    public List<DishResponseDTO> calculateCalorie(List<DishRequestDTO> dto) {
        List<DishResponseDTO> dishResponseDTOS = new ArrayList<>();
        dto.forEach(dish -> dishResponseDTOS.add(calculateCalorie(dish)));
        return dishResponseDTOS;
    }

    private List<IngredientsResponseDTO> ingredientRequestToResponse(List<IngredientsRequestDTO> ingredientsRequestDTOS) {
        List<IngredientsResponseDTO> ingredientsResponseDTOS = new ArrayList<>();
        ingredientsRequestDTOS.forEach(ingredientsRequestDTO -> {
            Integer calories = caloriePeerWeigth(ingredientsRequestDTO);
            ingredientsResponseDTOS.add(new IngredientsResponseDTO(ingredientsRequestDTO.getName(),ingredientsRequestDTO.getWeight(),calories));
        });
        return ingredientsResponseDTOS;
    }

    private Integer caloriePeerWeigth(IngredientsRequestDTO ingredientsRequestDTO) {
        CalorieDTO caloriePeerHundred = null;
        try {
            caloriePeerHundred = dishRepository.findCaloriesByIngredient(ingredientsRequestDTO.getName());
        } catch (IOException e) {
            System.out.println("Ocurrio un error");
        }
        if(Objects.isNull(caloriePeerHundred)) caloriePeerHundred = new CalorieDTO("Not information",0);
        return caloriePeerHundred.getCalories()*ingredientsRequestDTO.getWeight()/100;
    }
}
