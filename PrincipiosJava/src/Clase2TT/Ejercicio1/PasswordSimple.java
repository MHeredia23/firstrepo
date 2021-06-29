package Clase2TT.Ejercicio1;

public class PasswordSimple extends Password{

    public PasswordSimple() {
        super("^(?=.*[a-z])(?=\\S+$).{2,}$");
    }
}
