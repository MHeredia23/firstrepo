package com.example.caloriecalculator.services;

import com.example.caloriecalculator.dtos.response.DishResponseDTO;
import com.example.caloriecalculator.dtos.resquest.DishRequestDTO;

import java.util.List;

public interface DishService {

    DishResponseDTO calculateCalorie(DishRequestDTO dto);
    List<DishResponseDTO> calculateCalorie(List<DishRequestDTO> dto);

}
