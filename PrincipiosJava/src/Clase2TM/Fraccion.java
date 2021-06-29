package Clase2TM;

public class Fraccion {

    public static double suma(double fraccion1, double fraccion2){
        return fraccion1 + fraccion2;
    }

    public static double suma(double fraccion1, int fraccion2){
        return suma(fraccion1, (double) fraccion2);
    }

    public static double resta(double fraccion1, double fraccion2){
        return fraccion1 - fraccion2;
    }

    public static double resta(double fraccion1, int fraccion2){
        return resta(fraccion1, (double) fraccion2);
    }

    public static double multiplicacion(double fraccion1, double fraccion2){
        return  fraccion1*fraccion2;
    }

    public static double multiplicacion(double fraccion1, int fraccion2){
        return  multiplicacion(fraccion1, (double) fraccion2);
    }

    public static double division(double fraccion1, double fraccion2){
        return  fraccion1/fraccion2;
    }

    public static double division(double fraccion1, int fraccion2){
        return  division(fraccion1, (double) fraccion2);
    }

}
