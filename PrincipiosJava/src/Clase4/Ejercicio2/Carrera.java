package Clase4.Ejercicio2;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Carrera {

    private double distancia;
    private double premioEnDolares;
    private String nombre;
    private int cantidadDeVehiculosPermitidos;
    private List<Vehiculo> vehiculos;
    private SocorrustaAuto socorrustaAuto;
    private SocorrustaMoto socorrustaMoto;

    public Carrera(double distancia, double premioEnDolares, String nombre, int cantidadDeVehiculosPermitidos, List<Vehiculo> vehiculos) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
        this.vehiculos = vehiculos;
        this.socorrustaAuto = new SocorrustaAuto();
        this.socorrustaMoto = new SocorrustaMoto();
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPremioEnDolares() {
        return premioEnDolares;
    }

    public void setPremioEnDolares(double premioEnDolares) {
        this.premioEnDolares = premioEnDolares;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadDeVehiculosPermitidos() {
        return cantidadDeVehiculosPermitidos;
    }

    public void setCantidadDeVehiculosPermitidos(int cantidadDeVehiculosPermitidos) {
        this.cantidadDeVehiculosPermitidos = cantidadDeVehiculosPermitidos;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public SocorrustaAuto getSocorrustaAuto() {
        return socorrustaAuto;
    }

    public void setSocorrustaAuto(SocorrustaAuto socorrustaAuto) {
        this.socorrustaAuto = socorrustaAuto;
    }

    public SocorrustaMoto getSocorrustaMoto() {
        return socorrustaMoto;
    }

    public void setSocorrustaMoto(SocorrustaMoto socorrustaMoto) {
        this.socorrustaMoto = socorrustaMoto;
    }

    public void darDeAltaAuto(double velocidad, double aceleracion, double anguloDeGiro, String patente) throws Exception {
        if(cantidadDeVehiculosPermitidos>vehiculos.size()){
            vehiculos.add(new Auto(velocidad,aceleracion,anguloDeGiro,patente));
            return;
        }
        throw new Exception("No hay cupos para vehiculos");
    }

    public void darDeAltaMoto(double velocidad, double aceleracion, double anguloDeGiro, String patente) throws Exception {
        if (cantidadDeVehiculosPermitidos > vehiculos.size()) {
            vehiculos.add(new Moto(velocidad, aceleracion, anguloDeGiro, patente));
            return;
        }
        throw new Exception("No hay cupos para vehiculos");
    }

    public void eliminarVehiculo(Vehiculo vehiculo) throws Exception {
        if(vehiculos.contains(vehiculo)){
            vehiculos.remove(vehiculo);
            return;
        }
        throw new Exception("No existe dicho vehiculo inscripto en esta carrera");
    }

    public void eliminarVehiculoConPatente(String unaPatente) throws Exception {
        Optional<Vehiculo> vEliminar = vehiculos.stream().filter(v->v.getPatente().equalsIgnoreCase(unaPatente))
                                                .findAny();
        if(vEliminar.isPresent()){
            vehiculos.remove(vEliminar.get());
            return;
        }
        throw new Exception("No existe dicho vehiculo inscripto en esta carrera");
    }

    public Vehiculo ganador(){
        Vehiculo ganador = vehiculos.get(0);
        for(Vehiculo v: vehiculos){
            if(ganador.ganador()<v.ganador()){
                ganador = v;
            }
        }
        return ganador;
    }
    
    public void socorrerAuto(String patente){
        Optional<Vehiculo> vehiculo = vehiculos.stream().filter(v->v.getPatente().equalsIgnoreCase(patente))
                .findAny();
        try {
            socorrustaAuto.socorrer((Auto) vehiculo.get());
        }catch (Exception e){
            System.out.println("No existe auto a socorrer con esa patente: "+patente);
        }
    }

    public void socorrerMoto(String patente){
        Optional<Vehiculo> vehiculo = vehiculos.stream().filter(v->v.getPatente().equalsIgnoreCase(patente))
                .findAny();
        try {
            socorrustaMoto.socorrer((Moto) vehiculo.get());
        }catch (Exception e){
            System.out.println("No existe Moto a socorrer con esa patente: "+patente);
        }
    }

}
