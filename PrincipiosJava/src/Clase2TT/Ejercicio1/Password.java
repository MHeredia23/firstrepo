package Clase2TT.Ejercicio1;

import java.util.regex.Pattern;

/*
^                 # start-of-string
(?=.*[0-9])       # a digit must occur at least once
(?=.*[a-z])       # a lower case letter must occur at least once
(?=.*[A-Z])       # an upper case letter must occur at least once
(?=.*[@#$%^&+=])  # a special character must occur at least once
(?=\S+$)          # no whitespace allowed in the entire string
.{8,}             # anything, at least eight places though
$                 # end-of-string
 */

public class Password {

    private String value;
    private String regex;

    public Password(String regex){
        this.regex = regex;
    }

    public void setValue(String pwd){
        if(Pattern.matches(regex,pwd)){
            this.value = pwd;
        }else {
            throw new RuntimeException("Contraseña no cumple con las condiciones");
        }

    }

}
