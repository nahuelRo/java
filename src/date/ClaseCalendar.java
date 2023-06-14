package date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ClaseCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();

        // calendario.set(2001, Calendar.SEPTEMBER, 30, 24, 20, 10);
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.JULY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);
        calendario.set(Calendar.HOUR, 20);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);

        Date fecha = calendario.getTime();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaConFormato = formato.format(fecha);

        System.out.println("fecha sin formato = " + fecha);

        System.out.println("fecha con formato = " + fechaConFormato);


        


    }
}
