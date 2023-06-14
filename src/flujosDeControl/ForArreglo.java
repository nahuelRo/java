package F_flujosDeControl;

import javax.swing.*;

public class ForArreglo {
    public static void main(String[] args) {

        // Arreglo de Strings
        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Pepa"};

        // Asignamos el largo del arreglo
        int contador = nombres.length;
        // Recorremos el arreglo
        for (int i = 0; i < contador; i++) {
            // Condicion
            if (nombres[i].contains("Andres") ||
                    nombres[i].contains("Pepa")){
                // Se lo salta
                continue;
            }

            // Accedo y muestro cada elemento
            System.out.println(i + ".- " + nombres[i]);
        }

        // Input
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Maria\": ");

        // Flag
        boolean encontrado = false;

        // Iteracion
        for (int i = 0; i < contador; i++) {
            // Se encontro?
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                // Si lo encontro dejamos de buscar
                break;
            }
            System.out.println(i + ".- " + nombres[i]);
        }

        // Validacion para el output
        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado!");
        } else {
            JOptionPane.showMessageDialog(null, "No existe en el sistema!");
        }



    }
}
