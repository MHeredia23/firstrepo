package Clase3TT;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Properties;

public class Test2 {

    public static void main(String[] args) throws FileNotFoundException {

        Properties properties = new Properties();
        try {
            properties.load(new FileReader("MiFactory.properties"));
        } catch (IOException e) {
            System.out.println("No se encuentra el archivo de configuración");
        }
        if(!properties.isEmpty()){
            Sorter sorter = (Sorter) MiFactory.getInstance(properties.getProperty("sorter"));
            Integer[] number = new Integer[100000];
            int valor = 100000;
            for(int i = 0; i<number.length; i++){
                number[i] = valor;
                valor--;
            }
            Comparator<Integer> c1 = Integer::compareTo;
            Time time = new Time();
            time.start();
            sorter.sort(number, c1);
            time.stop();
            for(Integer i: number){
                System.out.println(i);
            }
            System.out.println("el tiempo de ordenado fue de : "+time.elapsedTime());
        }
    }

}
