package com.example.calculadorametros.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Validated
@NoArgsConstructor
@AllArgsConstructor
public class CasaRequestDto {

    @NotNull(message = "El nombre de la casa no puede ser nula")
    @NotBlank(message = "Debe ingresar un nombre")
    @Size(min = 2, max = 100, message = "El nombre debe tener entre 2 y 100 caracteres")
    private String nombre;

    @NotNull(message = "La dirección de la casa no puede ser nula")
    @NotBlank(message = "Debe ingresar una dirrección")
    @Size(min = 10, max = 100, message = "La dirreción debe tener entre 10 y 100 caracteres")
    private String direccion;

    @NotEmpty(message = "Las habitaciones no pueden ser nulas")
    @Valid
    private List<HabitacionRequestDto> habitacionRequestDtos;

}
