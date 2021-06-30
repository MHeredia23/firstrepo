package Clase3TT;

import java.io.FileReader;
import java.util.Properties;

public class MiFactory {

    public static Object getInstance(String objName){
        try {
            return  Class.forName(objName).getDeclaredConstructor().newInstance();
        }catch (Exception exception){
            System.out.println("No existe dicha clase");
            return null;
        }
    }

}
