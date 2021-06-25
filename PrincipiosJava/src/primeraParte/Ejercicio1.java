package primeraParte;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero numero: ");
        int numero = sc.nextInt();
        for(int i=1; i<=numero; i++){
            System.out.println("El numero: "+i+" es par");
        }
    }

}
