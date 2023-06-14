package operadores;

public class Asignacion {
    public static void main(String[] args) {
        int numeroUno = 5;
        int numeroDos = numeroUno + 4;
        System.out.println("numeroDos = " + numeroUno);
        System.out.println("numeroDos = " + numeroDos);

        // Autoincremento
        numeroUno += 2;
        System.out.println("numeroUno = " + numeroUno);

        // Autoincremento
        numeroUno += 5;
        System.out.println("numeroUno = " + numeroUno);

        // Autodecremento
        numeroDos -= 4;
        System.out.println("numeroDos = " + numeroDos);

        // Automultiplicacion
        numeroDos *= 5;
        System.out.println("numeroDos = " + numeroDos);

        String sqlString = "SELECT * from clientes as c";
        sqlString += " WHERE c.nombre='nahuel'";
        sqlString += " and c.activo=1";
        System.out.println("sqlString = " + sqlString);
    }
}
