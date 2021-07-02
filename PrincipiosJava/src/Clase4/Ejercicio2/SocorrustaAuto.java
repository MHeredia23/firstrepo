package Clase4.Ejercicio2;

public class SocorrustaAuto implements ISocorrista<Auto>{
    @Override
    public void socorrer(Auto auto) {
        System.out.println("Socorriendo auto "+auto.getPatente());
    }
}
