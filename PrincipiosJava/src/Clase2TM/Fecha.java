package Clase2TM;
/*
Crea una clase Fecha.
La clase contendrá además de los constructores que consideres adecuados, métodos de acceso y el método toString,
tal como lo explicamos en el ejercicio anterior, un método para comprobar si la fecha es correcta
y otro para sumarle un día al valor actual de la fecha.
Se debe investigar y utilizar la clase GregorianCalendar para implementar los métodos y constructores de Fecha.
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Fecha extends GregorianCalendar {

    public void addDia() {
        this.add(Calendar.DAY_OF_MONTH, 1);
    }

    public boolean validateDate(String dia, String mes, String anio) {
        boolean correcto = false;
        try {
            //Formato de fecha (día/mes/año)
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);
            //Comprobación de la fecha
            formatoFecha.parse(dia + "/" + mes + "/" + anio);
            correcto = true;
        } catch (ParseException e) {
            //Si la fecha no es correcta, pasará por aquí
            correcto = false;
        }
        return correcto;
    }

}
