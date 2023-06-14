package C_primitivos;

public class Booleano {
    public static void main(String[] args) {
        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        double numeroDouble = 98765.43e-3;
        System.out.println("numeroDouble = " + numeroDouble);
        
        float numeroFloat = 1.2345e2f;
        System.out.println("numeroFloat = " + numeroFloat);

        datoLogico = numeroDouble > numeroFloat;
        System.out.println("datoLogico = " + datoLogico);
        
        boolean esIgual = (3-2 == 1);
        System.out.println("esIgual = " + esIgual);
    }
}
