package Clase1TM;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros primos a imprimir: ");
        int cantidad = sc.nextInt();
        for(int i=1; i<=cantidad; i++){
            if(Ejercicio3.esPrimo(i)){
                System.out.println("Es primo: "+i);
            }
        }
    }
}
