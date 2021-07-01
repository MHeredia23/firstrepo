package Clase3TT;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Time {

    private Long start;
    private Long stop;

    public void start(){
        this.start = System.currentTimeMillis();
    }

    public void stop(){
        this.stop = System.currentTimeMillis();
    }

    public String elapsedTime(){
        long time = (stop - start)/1000;
        return time+" en segundos";
    }

}
