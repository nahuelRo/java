package arreglos;

import java.util.Scanner;

public class BuscarNumeroString {
    public static void main(String[] args) {

        String[] a = new String[4];

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese un nombre: ");
            a[i] = s.nextLine();
        }

        System.out.println("\r\nIngrese un nombre a buscar: ");
        String nombre = s.next();
        int i = 0;

        while(i < a.length && !a[i].equalsIgnoreCase(nombre)) {
            i++;
        }

        if (i == a.length){
            System.out.println("Número no encontrado");
        } else if (a[i].equalsIgnoreCase(nombre)) {
            System.out.println("Encontrado en la posicion: " + i);
        }

    }
}
