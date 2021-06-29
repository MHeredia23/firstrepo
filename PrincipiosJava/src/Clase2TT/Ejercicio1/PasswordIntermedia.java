package Clase2TT.Ejercicio1;

public class PasswordIntermedia extends Password{

    public PasswordIntermedia() {
        super("^(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{8,}$");
    }
}
