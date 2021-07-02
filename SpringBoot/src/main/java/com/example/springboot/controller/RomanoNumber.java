package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/RomanoNumber")
public class RomanoNumber {


    static final Map<String,Integer> NUMEROSROMANOS = new HashMap<>();
    static {
        NUMEROSROMANOS.put("I", 1);
        NUMEROSROMANOS.put("V", 5);
        NUMEROSROMANOS.put("X", 10);
        NUMEROSROMANOS.put("L", 50);
        NUMEROSROMANOS.put("C", 100);
        NUMEROSROMANOS.put("D", 500);
        NUMEROSROMANOS.put("M", 1000);
    }

    @GetMapping("/toRoman/{number}")
    public String toRomanNumber(@PathVariable Integer number) {
        String numeroRomano = "No se puede generar su valor en Romano";
        if (number > 1 && number < 3999) {

            numeroRomano = "El valor romano es: ";

            int miles = number / 1000;
            int centenas = number / 100 % 10;
            int decenas = number / 10 % 10;
            int unidades = number % 10;

            for (int i = 1; i <= miles; i++) {
                numeroRomano = numeroRomano + "M";
            }
            numeroRomano = numeroRomano + completar(centenas,"CM","D","C","CD");
            numeroRomano = numeroRomano + completar(decenas,"XC","L","XL","X");
            numeroRomano = numeroRomano + completar(unidades,"IX","V","IV","I");
        }
        return numeroRomano;
    }

    private String completar(int cantidad, String nueve, String medio, String cuatro, String menor) {
        String numeroRomano = "";
        if (cantidad == 9) {
            numeroRomano = numeroRomano + nueve;
        } else if (cantidad >= 5) {
            numeroRomano = numeroRomano + medio;
            for (int i = 6; i <= cantidad; i++) {
                numeroRomano = numeroRomano + cuatro;
            }
        } else if (cantidad == 4) {
            numeroRomano = numeroRomano + menor;
        } else {
            for (int i = 1; i <= cantidad; i++) {
                numeroRomano = numeroRomano + cuatro;
            }
        }
        return numeroRomano;
    }

    @GetMapping("/toDecimal/{romano}")
    public Integer toDecimal(@PathVariable String romano) {
        romano = romano.trim();

        int decimal = 0;
        int valor;
        char letra;
        boolean esta;
        int anterior = 0;

        for (int i = 0; i < romano.length(); i++){
            letra = romano.charAt(i);
            if (Character.isWhitespace(letra)){
                continue;
            }
            esta = NUMEROSROMANOS.containsKey(Character.toString(letra).toUpperCase());
            if (esta) {
                valor = NUMEROSROMANOS.get(Character.toString(letra).toUpperCase());
                decimal = decimal + valor;
                if (anterior < valor) {
                    decimal = decimal - anterior * 2;
                    anterior = valor;
                } else {
                    anterior = valor;
                }
            } else decimal = 0;
        }
        return decimal;
    }

}
