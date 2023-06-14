package I_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClaseDate {
    public static void main(String[] args) {
        Date fecha = new Date();

        System.out.println("fecha = " + fecha);

        /*
        * dd -> dia
        * EEEE -> Nombre del dia
        * MM -> numero del mes
        * MMMM -> Nombre del mes
        * yyyy -> Anio
        * HH -> Hora
        * mm -> minutos
        * ss -> segundos
        * */
        SimpleDateFormat df = new SimpleDateFormat("'fecha: 'yyyy.MM.dd G 'hora' HH:mm:ss z");
        String fechaStr = df.format(fecha);

        Date fecha2 = new Date();
        long suma = 0;

        for (int i = 0; i < 10000000; i++) {
            suma += i;
        }

        long tiempoFinal = fecha2.getTime() - fecha.getTime();

        System.out.println("tiempo transcurrido en el for = " + tiempoFinal);
        System.out.println("suma = " + suma);

        System.out.println("fechaStr = " + fechaStr);
    }
}
