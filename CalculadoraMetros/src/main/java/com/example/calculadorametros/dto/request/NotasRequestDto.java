package com.example.calculadorametros.dto.request;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Validated
public class NotasRequestDto {

    @NotNull(message = "El nombre de la materia no puede ser nula")
    @NotBlank(message = "El nombre no puede ser vacio")
    @Size(min = 6, max = 100, message = "El nombre de la materia tiene que poseer entre 10 y 100 caracteres")
    public String nombre;

    @NotNull(message = "La nota no puede ser nula")
    public Double nota;


}
