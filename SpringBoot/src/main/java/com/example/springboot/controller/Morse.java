package com.example.springboot.controller;

import com.example.springboot.model.Dictionary;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/Morse")
public class Morse {

    @GetMapping("/toMorse")
    public String toMorse(@RequestParam String palabra){
        StringBuilder codificado = new StringBuilder();
        for (int i = 0; i < palabra.length(); i++) {
            String charComoCadenaYEnMayusculas = String.valueOf(palabra.charAt(i)).toUpperCase();
            String equivalencia = asciiAMorse(charComoCadenaYEnMayusculas);
            codificado
                    .append(equivalencia)
                    .append(" ");
        }
        return codificado.toString();
    }

    private String asciiAMorse(String ascii) {
        return Dictionary.letters.getOrDefault(ascii," ");
    }


    @GetMapping("/toASCII")
    public String toASCII(@RequestParam String morse){
        StringBuilder decodificado = new StringBuilder();
        // Necesitamos separarlo por espacios
        String[] morses = morse.split(" ");
        for (String morseActual : morses) {
            String equivalencia = morseAAscii(morseActual);
            decodificado.append(equivalencia);
        }
        return decodificado.toString();
    }

    private String morseAAscii(String morseActual) {
        Set<String> claves = Dictionary.letters.keySet();
        String valor = " ";
        if(claves.stream().anyMatch(palabra -> Dictionary.letters.get(palabra).equalsIgnoreCase(morseActual))){
            valor = claves.stream().filter(palabra -> Dictionary.letters.get(palabra).equalsIgnoreCase(morseActual)).findFirst().get();
        }
        return valor;
    }

}
