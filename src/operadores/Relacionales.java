package operadores;

public class Relacionales {
    public static void main(String[] args) {
        int numeroEntero = 3;
        byte numeroByte = 7;
        float numeroFloat = 127e-7f;
        double numeroDouble = 2.1413e3;
        boolean falso = false;

        // Igualdad
        boolean b1 = numeroEntero == numeroByte;
        System.out.println("b1 = " + b1);

        // Negacion
        boolean b2 = !b1;
        System.out.println("b2 = " + b2);

        // Desigual
        boolean b3 = numeroEntero != numeroByte;
        System.out.println("b3 = " + b3);

        // igualdad
        boolean b4 = falso == true;
        System.out.println("b4 = " + b4);

        // Desigual
        boolean b5 = false != true;
        System.out.println("b5 = " + b5);

        // Mayor
        boolean b6 = numeroFloat > numeroDouble;
        System.out.println("b6 = " + b6);

        // Menor
        boolean b7 = numeroFloat < numeroDouble;
        System.out.println("b7 = " + b7);

        // Mayor igual
        boolean b8 = numeroFloat >= numeroDouble;
        System.out.println("b8 = " + b8);

        // Menor igual
        boolean b9 = numeroFloat <= numeroDouble;
        System.out.println("b9 = " + b9);

    }
}
