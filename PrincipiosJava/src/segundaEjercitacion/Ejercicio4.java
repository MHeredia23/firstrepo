package segundaEjercitacion;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int number = sc.nextInt();
        if(number%2==0){
            System.out.println("El numero "+number+" es divisible por dos");
        }else{
            System.out.println("El numero "+number+" NO es divisible por dos");
        }

    }

}
