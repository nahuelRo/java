package M_arreglos;

import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {
        // Intanciando arreglo de strings
        // Null por defecto
        String[] productos = new String[7];

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        // Ordenar el arreglo de forma alfabetica
        Arrays.sort(productos);

        // Asignando a variable
        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];


        System.out.println("productos[0] = " + prod1);
        System.out.println("productos[1] = " + prod2);
        System.out.println("productos[2] = " + prod3);
        System.out.println("productos[3] = " + prod4);
        System.out.println("productos[4] = " + prod5);
        System.out.println("productos[5] = " + prod6);
        System.out.println("productos[6] = " + prod7);





        // Intanciando arreglo de enteros
        int[] numeros = new int[4];

        // Asignando valores
        numeros[0] = 10;
        numeros[1] = Integer.valueOf("2");
        numeros[2] = 35;
        numeros[3] = -1;
        // Exception bounds
        //numeros[4] = 5;

        // Ordenar numeros de menor a mayor
        Arrays.sort(numeros);

        // guardando a variable
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length - 1];
        // Exception bounds
        // int m = numeros[4];


        // Mostrando
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);
    }
}
