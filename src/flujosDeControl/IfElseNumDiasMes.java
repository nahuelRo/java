package F_flujosDeControl;

import java.util.Scanner;

public class IfElseNumDiasMes {
    public static void main(String[] args) {
        // Instanciamos la clase scanner
        Scanner s = new Scanner(System.in);
        // Pedimos los datos
        System.out.println("Ingrese un número del mes 1 - 12");
        // Guardamos los datos en una variable
        int mes = s.nextInt();
        // Definimos la variable para numero de dias
        int numeroDias = 0;
        // Pedimos el año en el que se encuentra
        System.out.println("Ingrese el año (YYYY)");
        // Guardamos los datos en una variable
        int anio = s.nextInt();

        // Validaciones para el mes del año
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            numeroDias = 31;
        } else if (mes == 4 || mes == 6 || mes == 9 ||  mes == 11){
            numeroDias = 30;
        } else if (mes == 2){
            if (anio % 400 == 0 || (anio % 2 == 0 && !(anio % 100 == 0))){
                numeroDias = 29;
            } else {
                numeroDias = 28;
            }
        }
        // Salida de datos los numeros de dias que tiene el mes.
        System.out.println("numeroDias = " + numeroDias);

    }
}
