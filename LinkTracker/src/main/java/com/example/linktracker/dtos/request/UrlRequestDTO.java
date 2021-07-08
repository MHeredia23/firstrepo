package com.example.linktracker.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Validated
public class UrlRequestDTO {

    @NotNull(message = "El nombre de la web no pude ser nula")
    @NotBlank(message = "El nombre de la web no puede ser vacia")
    @Size(min= 3,max = 15,message = "El nombre de la web debe contener entre 3 y 15 caracteres")
    private String web;

    @NotNull(message = "El nombre de la web no pude ser nula")
    @NotBlank(message = "El nombre de la web no puede ser vacia")
    @Size(min= 3,max = 150,message = "El nombre de la web debe contener entre 3 y 15 caracteres")
    @Pattern(regexp = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]",
            message = "No tiene formato de url")
    private String url;

    @Pattern(regexp = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$",
            message = "La password no es segura.. Debe tener una mayuscula y numeros")
    private String password;


}
