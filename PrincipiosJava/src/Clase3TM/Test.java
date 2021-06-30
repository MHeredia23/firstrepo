package Clase3TM;

public class Test {

    public static void main(String[] args) {

        Persona[] personas = {new Persona("Martin", 41953424),
                new Persona("Victoria", 43196394),
                new Persona("Marcos", 40978360)};

        System.out.println("SIn ordenar");
        for (Persona pe : personas) {
            System.out.println(pe.toString());
        }

        SortUtil.ordenar(personas);
        System.out.println("Ordenado");
        for (Persona pe : personas) {
            System.out.println(pe.toString());
        }


    }

}
