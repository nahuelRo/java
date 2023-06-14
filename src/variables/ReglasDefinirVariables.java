package variables;

public class ReglasDefinirVariables {
    public static void main(String[] args) {
        // Se puede definir una variable sin valor
        String nombre = "Nahuel";

        // Aunque puede tener errores
        if (false) {
            nombre = "Juan";
        }

        System.out.println("nombre = " + nombre);

        // 1. Los nombres de variables no pueden ser una palabra clave del lenguaje.
        // int class = 5;

        // 2. Los nombres de variables no pueden comenzar con numeros
        // int 1edad = 5;

        // 3. Utilizar camelCase para nombrar las variables
        int edad_persona = 10; // X
        int edadPersona = 10;

        // Comentarios simples

        /*
         * Comentarios
         * Multi
         * lineas
         */
    }
}
