package variables;

// Clase - PascalCase
public class Variables {
    // Metodo especial de ejecucion
    public static void main(String[] args){
        // Tipo de dato - nombre = valor
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);

        // Invocamos un metodo de la clase String
        System.out.println(saludar.toUpperCase());

        // Primitivo - (por valor)
        int numero = 10;
        // Referencia - (por referencia)
        Integer numeroClase = 10;

        // Contexto de una variable
        boolean valor = true;

        if (valor) {
            // Variable del contexto if
            System.out.println(numero);
            numero = 20;
        }

        System.out.println(numero);

        // Variables dinamicas
        var numeroDinamico = 15;
        var stringDinamico = "";
    }
}