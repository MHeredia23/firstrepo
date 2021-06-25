package primeraParte;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros que desea visualizar: ");
        int cantidadVisualizar = sc.nextInt();
        System.out.print("Ingrese la cantidad de veces que quiere ver repetido un digito: ");
        int cantidadDeRepeticiones = sc.nextInt();
        System.out.print("Ingrese el digito que quiere ver repetido: ");
        int digito = sc.nextInt();
        int contador = 0;
        int limite = 1;
        while (limite<=cantidadVisualizar){
           if(validarRepeticiones(contador, cantidadDeRepeticiones, digito)){
               System.out.println(contador);
               limite++;
           }
           contador++;
        }


    }

    private static boolean validarRepeticiones(int numero, int cantidadDeRepeticiones, int digito) {
        char[] digitos = String.valueOf(numero).toCharArray();
        int contadorRep = 0;
        for(int i=0; i<digitos.length; i++){
            int number = Character.getNumericValue(digitos[i]);
            if(number==digito){
                contadorRep++;
            }
        }
        return contadorRep==cantidadDeRepeticiones;
    }

}
