package Clase3TM;

public class Test2 {

    public static void main(String[] args) {

        Celular[] celulars = {new Celular("2326495635", "Martin Heredia"),
                new Celular("2326455162", "Marcos Heredia")};

        System.out.println("SIn ordenar");
        for(Celular ce: celulars){
            System.out.println("ce.toString() = " + ce.toString());
        }

        SortUtil.ordenar(celulars);
        System.out.println("Ordenado");
        for(Celular ce: celulars){
            System.out.println("ce.toString() = " + ce.toString());
        }

    }

}
