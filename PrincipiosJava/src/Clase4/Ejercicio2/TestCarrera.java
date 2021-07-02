package Clase4.Ejercicio2;

import java.util.ArrayList;

public class TestCarrera {

    public static void main(String[] args) {

        Carrera carrera = new Carrera(500,800,"Heredia Cup",4, new ArrayList<>());

        System.out.println("Bienvenidos a la carrera: "+carrera.getNombre());

        try {
            carrera.darDeAltaAuto(100, 5, 30, "NPJ308");
            carrera.darDeAltaAuto(130, 6, 30, "NSS508");
            carrera.darDeAltaAuto(150, 10, 80, "AB560VJ");
            carrera.darDeAltaMoto(100, 5, 100, "AABB");
            carrera.darDeAltaMoto(150, 5, 5, "AABp");
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Ultimo corredor: "+carrera.getVehiculos().get(carrera.getCantidadDeVehiculosPermitidos()-1).getPatente());
        }


        carrera.socorrerMoto("NPJ308");

        Vehiculo v = carrera.ganador();
        System.out.println("El ganador es : "+ v.toString());

    }

}
