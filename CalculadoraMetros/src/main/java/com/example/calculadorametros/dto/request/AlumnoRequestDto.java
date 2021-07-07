package com.example.calculadorametros.dto.request;

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
public class AlumnoRequestDto {

    @NotNull(message = "El nombre del alumno no puede ser nula")
    @NotBlank(message = "El nombre del alumno no puede ser vacio")
    @Size(min = 6, max = 100, message = "El nombre del alumno tiene que poseer entre 10 y 100 caracteres")
    private String nombre;

    @NotNull(message = "Las notas no pueden ser nulas")
    @NotEmpty(message = "Las notas no pueden ser vacias")
    @Valid
    private List<NotasRequestDto> notas;

}
