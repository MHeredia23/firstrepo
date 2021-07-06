package com.example.calculadorametros.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
public class EdadRequestDto {

    @NotNull
    @Pattern(regexp = "^([0-2][0-9]|3[0-1])$",
        message = "Dia Invalido")
    private String day;

    @NotNull
    @Pattern(regexp = "^(0[1-9]|1[0-2])$",
    message = "Debe ingresar un formato de mes valido")
    private String month;

    @NotNull
    @Pattern(regexp = "^(\\d{4})$",
            message = "Debe ingresar un formato de año valido")
    private String year;

}
