package Clase4.Ejercicio2;

public class SocorrustaMoto implements ISocorrista<Moto>{
    @Override
    public void socorrer(Moto moto) {
        System.out.println("Socorriendo Moto "+moto.getPatente());
    }
}
