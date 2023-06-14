package F_flujosDeControl;

import java.util.Scanner;

public class SwitchCaseNumDiasMes {
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
        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numeroDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numeroDias = 30;
                break;
            case 2:
                if (anio % 400 == 0 || (anio % 2 == 0 && !(anio % 100 == 0))){
                    numeroDias = 29;
                } else {
                    numeroDias = 28;
                }
                break;
            default:
                numeroDias = 0;
        }
        // Salida de datos los numeros de dias que tiene el mes.
        System.out.println("numeroDias = " + numeroDias);

    }
}
