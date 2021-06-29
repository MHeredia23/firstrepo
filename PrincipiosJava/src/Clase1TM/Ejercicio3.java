package Clase1TM;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el numero a validar si es primo o no: ");
        int numero = sc.nextInt();
        if (esPrimo(numero)){
            System.out.println("El numero "+numero+" es primo");
        }else{
            System.out.println("El numero "+numero+" NO es primo");
        }
    }

    public static boolean esPrimo(int numero){
        int contador = 0;
        for(int i=1; i<=numero/2; i++){
            if(numero%i==0){
                contador++;
            }
        }
        return contador<=2;
    }

}
