package com.example.calculadorametros.dto.response;

import com.example.calculadorametros.dto.request.HabitacionRequestDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HabitacionResponseDto {

    private String nombre;
    private Double ancho;
    private Double largo;

    public HabitacionResponseDto(HabitacionRequestDto habitacionRequestDto){
        this.nombre = habitacionRequestDto.getNombre();
        this.ancho = habitacionRequestDto.getAncho();
        this.largo = habitacionRequestDto.getLargo();
    }

}
