package C_primitivos;

public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";

        // Convertir a entero
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "98765.432";

        // Convertir a double
        double numeroDouble = Double.parseDouble(realStr);
        System.out.println("numeroDouble = " + numeroDouble);

        String logicoStr = "true";

        // Convertir a boolean
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        // convertir a string
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        // convertir a string
        otroNumeroStr = String.valueOf(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 123456;
        // convertir a string
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        // convertir a string
        otroRealStr = String.valueOf(1.23456f);
        System.out.println("otroRealStr = " + otroRealStr);

        // Convertir entre tipos (cast)
        int i = 10000;
        // Perdida de información
        short s = (short)i;
        long l = i;
    }
}
