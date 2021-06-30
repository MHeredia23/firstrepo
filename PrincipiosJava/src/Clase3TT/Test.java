package Clase3TT;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Properties;

public class Test {

    public static void main(String[] args) throws FileNotFoundException {

        Properties properties = new Properties();
        try {
            properties.load(new FileReader("MiFactory.properties"));
        } catch (IOException e) {
            System.out.println("No se encuentra el archivo de configuración");
        }
        if(!properties.isEmpty()){
            Sorter sorter = (Sorter) MiFactory.getInstance(properties.getProperty("sorter"));
            Integer[] number = {2,6,9,7,5,1,8};
            Comparator<Integer> c1 = Integer::compareTo;
            sorter.sort(number, c1);
            for(Integer i: number){
                System.out.println(i);
            }

            String[] palabras = {"cc","aa","bb","zz","ee"};
            Comparator<String> s1 = String::compareTo;
            sorter.sort(palabras,s1);
            for(String p: palabras){
                System.out.println(p);
            }
        }
    }

}
