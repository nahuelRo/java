package flujosDeControl;

public class ForEach {
    public static void main(String[] args) {

        int[] numeros = {1,3,5,7,9,11, 13, 15};

        // ForEach
        for (int numero: numeros) {
            System.out.println("numero = " + numero);
        }

        String[] nombres = {"Andres", "Pepe", "Maria", "Paco", "Lalo", "Pepa"};

        // ForEach
        for (String nombre: nombres) {
            System.out.println("nombre = " + nombre);
        }

    }
}
