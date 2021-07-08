package com.example.linktracker.exceptions;

public class PasswordNecesary extends Exception{

    public final String ERROR = "Debe ingresar una password valida";

    public PasswordNecesary() {
        super();
    }
}
