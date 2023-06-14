package string;

public class Instanciar {
    public static void main(String[] args) {
        // Objeto String
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");

        // Comparando por referencia
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2 = " + esIgual);

        // Comparando por valor
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2) = " + esIgual);

        // Comparando por valor y ignorando mayusculas y minusculas
        esIgual = curso.equalsIgnoreCase(curso2);
        System.out.println("curso.equalsIgnoreCase(curso2) = " + esIgual);

        // Si otro objeto tiene el mismo valor guarda la referencia no crea otra instancia.
        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3 = " + esIgual);

    }
}
