package primitivos;

import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero: ");
        String numeroStr = scanner.nextLine();

        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);

        } catch (Exception e) {
            System.out.println("Error debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        // Numero decimal a binario
        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);

        // numero decimal a octal
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);

        // numero decimal a hexadecimal
        String resultadoHexadecimal = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;

        System.out.println(mensaje);
    }
}
