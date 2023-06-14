package operadores;

import javax.swing.*;

public class Aritmeticos {
    public static void main(String[] args) {
        int numeroUno = 5;
        int numeroDos = 4;

        // Suma (+)
        int suma = numeroUno + numeroDos;
        System.out.println("suma = " + suma);

        // Precedencia de los operadores
        System.out.println("numeroUno + NumeroDos = " + (numeroUno + numeroDos));

        // Resta (-)
        int resta = numeroUno - numeroDos;
        System.out.println("resta = " + resta);

        // Multiplicacion (*)
        int multi = numeroUno * numeroDos;
        System.out.println("multi = " + multi);

        // Division (/)
        int div = numeroUno / numeroDos;
        System.out.println("div = " + div);
        
        // Resto (%)
        int resto = numeroUno % numeroDos;
        System.out.println("resto = " + resto);
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if (numero % 2 == 0) {
            System.out.println("numero par = " + numero);
        } else {
            System.out.println("numero impar = " + numero);
        }


    }
}
