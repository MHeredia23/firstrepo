package com.example.caloriecalculator.dtos.resquest;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Validated
public class DishRequestDTO {

    @NotNull(message = "El nombre del plato no puede ser nulo")
    @NotBlank(message = "El nombre del plato no puede ser vacio")
    @Size(min = 2, message = "El plato debe tener más de 2 caracteres")
    private String name;

    @NotEmpty(message = "La lista de ingredientes no puede ser vacia")
    @NotNull(message = "La lista de ingredientes no puede ser vacia")
    @Valid
    private List<IngredientsRequestDTO> ingredients;


}
