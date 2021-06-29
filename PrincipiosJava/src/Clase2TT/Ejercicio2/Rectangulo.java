package Clase2TT.Ejercicio2;

public class Rectangulo extends FiguraGeometrica{

    private double base;
    private double altura;

    @Override
    public double area() {
        return base*altura;
    }

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {return base;}

    public void setBase(double base) {this.base = base;}

    public double getAltura() {return altura;}

    public void setAltura(double altura) {this.altura = altura;}
}
