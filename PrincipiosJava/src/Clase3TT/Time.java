package Clase3TT;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Time {

    private LocalDateTime start;
    private LocalDateTime stop;

    public void start(){
        this.start = LocalDateTime.now();
    }

    public void stop(){
        this.stop = LocalDateTime.now();
    }

    public String elapsedTime(){
        long milisegundosInicio = Timestamp.valueOf(start).getTime();
        System.out.println(milisegundosInicio);
        long milisegundosfin = Timestamp.valueOf(stop).getTime();
        System.out.println("milisegundosfin = " + milisegundosfin);
        long tiempo = milisegundosInicio - milisegundosfin;
        return tiempo+" en milisegundos";
    }

}
