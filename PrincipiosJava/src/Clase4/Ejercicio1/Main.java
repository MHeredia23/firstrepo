package Clase4.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Prenda> prendas = new ArrayList<Prenda>();
        prendas.add(new Prenda("Gucci","Pantalon"));
        prendas.add(new Prenda("Prada","Saco"));

        List<Prenda> prendas2 = new ArrayList<Prenda>();
        prendas2.add(new Prenda("Adidas","Pantalon"));
        prendas2.add(new Prenda("Nike","Saco"));

        GuardaRopa guardaRopa = new GuardaRopa();

        try {
            System.out.println("Guardando Gucci en guardarropa: " + guardaRopa.guardarPrendas(prendas));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("Guardando Adidas en guardarropa: " + guardaRopa.guardarPrendas(prendas2));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("-------------------------------------");

        System.out.println("Mostrando Ropa: ");
        guardaRopa.mostrarPrendas();

        System.out.println("----Eliminando-----");

        try {
            List<Prenda> sacadas = guardaRopa.devolverPrendas(2);
            sacadas.forEach((p) -> System.out.println("p.toString() = " + p.toString()));
        }catch (Exception e){
            System.out.println("No se puede devolver dicha prenda por: "+e.getMessage());
        }
        System.out.println("--luego de eliminar---");
        guardaRopa.mostrarPrendas();

        System.out.println("Agreggo una nueva");
        List<Prenda> prendas3 = new ArrayList<Prenda>();
        prendas3.add(new Prenda("Fila","Pantalon"));
        prendas3.add(new Prenda("topper","Saco"));

        try {
            System.out.println("ID: " + guardaRopa.guardarPrendas(prendas3));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Mostrando nuevos");
        guardaRopa.mostrarPrendas();


    }

}
