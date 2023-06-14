package C_primitivos;

public class Flotante {

    static float varFlotanteClase;
    public static void main(String[] args) {

        // Float
        float realFloat = 2.12e3f; //2120F;
        System.out.println("realFloat = " + realFloat);
        System.out.println("float corresponde en byte a = " + Float.BYTES);
        System.out.println("float corresponde en bites a = " + Float.SIZE);
        System.out.println("maximo valor para float = " + Float.MAX_VALUE);
        System.out.println("minimo valor para float a = " + Float.MIN_VALUE);

        // Double
        double realDouble = 1.7976931348623157E308;
        System.out.println("realDouble = " + realDouble);
        System.out.println("double corresponde en byte a = " + Double.BYTES);
        System.out.println("double corresponde en bites a = " + Double.SIZE);
        System.out.println("maximo valor para double = " + Double.MAX_VALUE);
        System.out.println("minimo valor para double a = " + Double.MIN_VALUE);

        // var double - float
        var varFlotante = 3.1416;
        System.out.println("varFlotante = " + varFlotante);

        // Variable de la clase (Propiedad)
        System.out.println("varFlotanteClase = " + varFlotanteClase);
    }
}
