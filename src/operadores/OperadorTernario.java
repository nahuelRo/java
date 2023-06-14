package operadores;

public class OperadorTernario {
    public static void main(String[] args) {
        // Estructura
        // variable = condicion ? si es verdadero : si es falso;
        String variable = 7 == 5 ? "si es verdadero" : "si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 6.2;

        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);
        

    }
}
