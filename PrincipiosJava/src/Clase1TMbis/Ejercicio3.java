package Clase1TMbis;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el radio del circulo: ");
        String radio = sc.next();
        Double rad = Double.parseDouble(radio);
        Double area = Math.PI * Math.pow(rad,2);
        System.out.println("EL area es: "+area);

    }

}
