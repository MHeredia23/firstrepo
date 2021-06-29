package Clase2TT.Ejercicio1;

public class PasswordFuerte extends Password{

    public PasswordFuerte() {
        super("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
    }
}
