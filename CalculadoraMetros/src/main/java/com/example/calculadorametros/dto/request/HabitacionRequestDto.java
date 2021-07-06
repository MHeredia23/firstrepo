package com.example.calculadorametros.dto.request;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class HabitacionRequestDto {

    @NotNull(message = "El nombre de la casa no puede ser nula")
    @NotBlank(message = "Debe ingresar un nombre")
    @Size(min = 2, max = 100, message = "El nombre debe tener entre 2 y 100 caracteres")
    private String nombre;

    @NotNull(message = "La anchura no puede ser nula")
    @Min(value = 1, message = "La habitación debe ser mayor que 1 mts")
    private Double ancho;

    @NotNull(message = "EL largo no puede ser nulo")
    @Min(value = 1, message = "La habitación debe ser mayor que 1 mts")
    private Double largo;

}
