package operadores;

public class Incrementales {
    public static void main(String[] args) {

        // Pre incremento
        int numeroUno = 1;
        int numeroDos = ++numeroUno; // i = i + 1
        System.out.println("numeroUno = " + numeroUno);
        System.out.println("numeroDos = " + numeroDos);

        // Post incremento
        numeroUno = 2;
        System.out.println("inicial de numeroUno = " + numeroUno);
        numeroDos = numeroUno++;
        System.out.println("numeroUno = " + numeroUno);
        System.out.println("numeroDos = " + numeroDos);

        // Pre decremento
        numeroUno = 3;
        numeroDos = --numeroUno;
        System.out.println("numeroUno = " + numeroUno);
        System.out.println("numeroDos = " + numeroDos);

        // Post decremento
        numeroUno = 3;
        System.out.println("inicial de numeroUno = " + numeroUno);
        numeroDos = numeroUno--;
        System.out.println("numeroUno = " + numeroUno);
        System.out.println("numeroDos = " + numeroDos);
    }
}
