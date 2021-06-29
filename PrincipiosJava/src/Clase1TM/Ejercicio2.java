package Clase1TM;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de multiplos que desea conocer: ");
        int cantidad = sc.nextInt();
        int contador = 1;
        int limite = 1;
        System.out.print("Ingrese el numero que desea conocer sus multiplos: ");
        int numero = sc.nextInt();
        while (limite<=cantidad){
            if(esMultiplo(contador,numero)){
                System.out.println("El numero: "+contador+" es multipo de "+numero);
                limite++;
            }
            contador++;
        }

    }

    public static boolean esMultiplo(int n1, int n2){
        return n1%n2==0;
    }

}
