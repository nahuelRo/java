package arreglos;

import java.util.Arrays;

public class Iterando {
    public static void main(String[] args) {
        String[] productos = new String[7];

        productos[0] = "Kingston Pendrive 64GB";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco Duro SSD Samsung Externo";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generación";
        productos[6] = "Bicicleta Oxford";

        Arrays.sort(productos);

        System.out.println("--------- Usando For ---------");

        // Iterando arreglo
        int total = productos.length;
        for (int i = 0; i <= total - 1; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        System.out.println("--------- Usando Foreach ---------");

        // Iterando arreglo
        for (String prod: productos) {
            System.out.println("prod" + prod);
        }

        System.out.println("--------- Usando While ---------");

        int i = 0;
        while (i < total){
            System.out.println("Para indice " + i + " : " + productos[i]);
            i++;
        }

        System.out.println("--------- Usando Do While ---------");

        i = 0;
        do {
            System.out.println("Para indice " + i + " : " + productos[i]);
            i++;
        }while(i < total);



        int[] numeros = new int[10];

        int largo = numeros.length;
        for (int j = 0; j < largo; j++) {
            numeros[j] = j * 3;
        }

        for (int numero : numeros) {
            System.out.println("numeros = " + numero);
        }

    }
}
