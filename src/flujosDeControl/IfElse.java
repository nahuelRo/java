package flujosDeControl;

public class IfElse {
    public static void main(String[] args) {

        // Input
        float promedio = 6.5f;

        // Si se cumple
        if (promedio >= 6.5){
            System.out.println("Felicitaciones, excelente promedio!");
        // Sino se cumple
        } else if (promedio >= 6.0) {
            System.out.println("Muy buen promedio!");
            // Sino se cumple
        } else if (promedio >= 5.5){
            System.out.println("Buen promedio!");
            // Sino se cumple
        } else if (promedio >= 5.0){
            System.out.println("Regular, necesitas esforzarte un poco más!");
            // Sino se cumple
        } else if (promedio >= 4.0){
            System.out.println("Insuficiente, necesitas estudiar más!");
            // Sino se cumple
        } else {
            System.out.println("Reprobado!");
        }
        // Output
        System.out.println("Tu promedio es: " + promedio);

    }
}
