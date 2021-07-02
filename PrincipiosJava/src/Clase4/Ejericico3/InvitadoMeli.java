package Clase4.Ejericico3;

public class InvitadoMeli extends Invitado{

    public InvitadoMeli(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public void comportamientoInvitado() {
        System.out.println("Viva la Chiqui!!!!");
    }
}
