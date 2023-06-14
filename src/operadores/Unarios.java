package operadores;

public class Unarios {
    public static void main(String[] args) {
        int numeroUno = -5;
        int numeroDos = +numeroUno;
        System.out.println("numeroDos = " + numeroDos);

        int numeroTres = -numeroUno;
        System.out.println("numeroTres = " + numeroTres);

        numeroUno = 6;
        numeroDos = +numeroUno;
        System.out.println("numeroDos = " + numeroDos);

        numeroTres = -numeroUno;
        System.out.println("numeroTres = " + numeroTres);
    }
}
