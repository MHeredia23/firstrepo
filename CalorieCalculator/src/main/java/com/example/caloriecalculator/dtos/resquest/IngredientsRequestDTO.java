package com.example.caloriecalculator.dtos.resquest;


import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Validated
public class IngredientsRequestDTO {

    @NotNull(message = "El nombre del ingrediente no puede ser nulo")
    @NotBlank(message = "El nombre del ingrediente no puede ser vacio")
    @Size(min = 2, message = "El ingrediente debe tener más de 2 caracteres")
    private String name;

    @NotNull(message = "El peso no puede ser nulo")
    @Min(value = 1, message = "No pude pesar menos de un gramo")
    private Integer weight;

}
