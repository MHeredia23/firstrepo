package Clase2TT.Ejercicio2;

public class FiguraGeometricaUtils {

    public static double areaPromedio(FiguraGeometrica arr[]){
        double suma = 0;
        for(FiguraGeometrica fg: arr){
            suma += fg.area();
        }
        return suma/arr.length;
    }

}
