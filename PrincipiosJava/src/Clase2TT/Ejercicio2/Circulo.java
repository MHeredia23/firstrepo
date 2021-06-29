package Clase2TT.Ejercicio2;

public class Circulo extends FiguraGeometrica{

    private double radio;

    @Override
    public double area() {
        return Math.PI*Math.pow(radio,2);
    }

    public Circulo(){}

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {return radio;}

    public void setRadio(double radio) {this.radio = radio;}
}
