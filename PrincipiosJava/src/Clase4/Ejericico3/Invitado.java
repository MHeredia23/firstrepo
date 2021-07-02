package Clase4.Ejericico3;

public abstract class Invitado{

    private String nombre;
    private String apellido;

    public Invitado(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getApellido() {return apellido;}

    public void setApellido(String apellido) {this.apellido = apellido;}

    public abstract void comportamientoInvitado();
}
