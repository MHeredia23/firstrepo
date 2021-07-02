package Clase4.Ejericico3;

import java.util.List;

public class Evento {

    private List<Invitado> invitados;

    public Evento(List<Invitado> invitados) {
        this.invitados = invitados;
    }

    public void apagarLasVelas(){
        invitados.forEach(Invitado::comportamientoInvitado);
    }

}
