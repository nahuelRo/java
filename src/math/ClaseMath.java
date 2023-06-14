package K_Math;

public class ClaseMath {
    public static void main(String[] args) {
        // Devuelve el valor absoluto de un numero
        int absoluto = Math.abs(-3);
        System.out.println("absoluto = " + absoluto);

        absoluto = Math.abs(3);
        System.out.println("absoluto = " + absoluto);

        // Devuelve el valor maximo
        double max = Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        // Devuelve el valor minimo
        double min = Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        // Redondea hacia arriba
        double techo = Math.ceil(3.5);
        System.out.println("techo = " + techo);

        // Redondea hacia abajo
        double piso = Math.floor(3.5);
        System.out.println("piso = " + piso);

        // Redondea al entero mas cercano
        Long entero = Math.round(Math.PI);
        System.out.println("entero = " + entero);

        // Exponente
        double exp = Math.exp(1);
        System.out.println("exp = " + exp);

        // Log
        double log = Math.log(10);
        System.out.println("log = " + log);

        // Potencia
        double potencia = Math.pow(10, 3);
        System.out.println("potencia = " + potencia);
        
        // Raiz cuadrada
        double raiz = Math.sqrt(5);
        System.out.println("raiz = " + raiz);

        // Radianes a grado
        double grados = Math.toDegrees(1.57);
        grados = Math.round(grados);
        System.out.println("grados = " + grados);

        // grados a radianes
        double radianes = Math.toRadians(90.00);
        System.out.println("radianes = " + radianes);

        System.out.println("sin(90) " + Math.sin(radianes));
        System.out.println("cos(90) " + Math.cos(radianes));

        radianes = Math.toRadians(180);
        System.out.println("cos(180) " + Math.cos(radianes));

        radianes = Math.toRadians(0.0);
        System.out.println("cos(0) " + Math.cos(radianes));
    }
}
