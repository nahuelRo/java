package M_arreglos;

import java.util.Arrays;

public class IterandoInverso {
    public static void main(String[] args) {
        String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta generación", "Bicicleta Oxford"};


        Arrays.sort(productos);

        System.out.println("--------- Usando For ---------");

        // Iterando arreglo
        int total = productos.length;
        for (int i = 0; i <= total - 1; i++) {
            System.out.println("para indice " + i + " : " + productos[i]);
        }

        System.out.println("--------- Usando For Inverso ---------");
        // Iterando al inverso
        for (int i = 0; i < total; i++) {
            System.out.println("para i = " + (total - 1 - i) + " valor: " + productos[total - 1 - i]);
        }

        System.out.println("--------- Usando For Inverso 2 ---------");
        for (int i = total - 1; i >= 0; i--) {
            System.out.println("para i = " + i + " valor: " + productos[i]);
        }
    }
}
