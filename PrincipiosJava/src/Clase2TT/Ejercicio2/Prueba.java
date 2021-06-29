package Clase2TT.Ejercicio2;

public class Prueba {

    public static void main(String[] args) {

        FiguraGeometrica[] arr = new FiguraGeometrica[3];
        FiguraGeometrica circulo = new Circulo(10);
        FiguraGeometrica triangulo =  new Triangulo(10,5);
        FiguraGeometrica rectangulo = new Rectangulo(10,5);
        arr[0]= circulo;
        arr[1]= triangulo;
        arr[2]= rectangulo;

        System.out.println("EL area promedio de las tres figuras geometricas es: "+FiguraGeometricaUtils.areaPromedio(arr));

    }

}
