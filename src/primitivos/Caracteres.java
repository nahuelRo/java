package primitivos;

public class Caracteres {
    public static void main(String[] args) {
        // Unicode
        char caracter = '\u0040';
        System.out.println("caracter = " + caracter);
        // Decimal
        char decimal = 64;
        System.out.println("decimal = " + decimal);
        // Symbol
        char simbolo = '@';
        System.out.println("simbolo = " + simbolo);
        // var
        var character = '\u0040';
        System.out.println("character = " + character);

        // Info de Character
        System.out.println("char corresponde en byte = " + Character.BYTES );
        System.out.println("char corresponde en bites = " + Character.SIZE );
        System.out.println("maximo valor de char = " + Character.MAX_VALUE );
        System.out.println("minimo valor de char = " + Character.MIN_VALUE );

        // Caracteres especiales
        char espacio = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';

        System.out.println("Lorem ipsum");



    }
}
