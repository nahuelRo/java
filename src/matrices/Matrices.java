package N_matrices;

public class Matrices {
    public static void main(String[] args) {

        // Declaramos una matriz
        // [filas][columnas]
        int[][] numeros = new int[2][4];

        // Rellenando la matriz

        // Primera fila
        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;

        // Segunda fila
        numeros[1][0] = 11;
        numeros[1][1] = 12;
        numeros[1][2] = 12;
        numeros[1][3] = 14;

        // Guardando en variable
        int num1 = numeros[0][0];
        int num2 = numeros[0][1];
        int num3 = numeros[0][2];
        int num4 = numeros[0][3];

        int num5 = numeros[1][0];
        int num6 = numeros[1][1];
        int num7 = numeros[1][2];
        int num8 = numeros[1][3];

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);
        System.out.println("num7 = " + num7);
        System.out.println("num8 = " + num8);


        // Cantidad de filas
        System.out.println("Numero de filas: " + numeros.length);
        // Cantidad de columnas
        System.out.println("Numero de Columnas: " + numeros[0].length);

        // Primer elemento de la matriz
        System.out.println("Primer elemento de la matriz: " + numeros[0][0]);
        // Ultimo elemento
        System.out.println("Ultimo elemento: " + numeros[numeros.length - 1][numeros[0].length - 1]);
    }
}
