package E_operadores;

public class Logicos {
    public static void main(String[] args) {
        int numeroEntero = 3;
        byte numeroByte = 7;
        float numeroFloat = 127e-7f;
        double numeroDouble = 2.1413e3;
        boolean falso = false;

        // And (&&)
        boolean b1 = numeroEntero == numeroByte && numeroFloat > numeroDouble;
        System.out.println("b1 = " + b1);

        // OR (||)
        boolean b2 = numeroEntero == numeroByte || numeroFloat > numeroDouble;
        System.out.println("b2 = " + b2);

        // Precedencia
        boolean b3 = numeroEntero == numeroByte && numeroFloat > numeroDouble || falso == false ;
        System.out.println("b3 = " + b3);


    }
}
