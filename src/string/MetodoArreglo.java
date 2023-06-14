package string;

public class MetodoArreglo {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";

        char[] arreglo = trabalenguas.toCharArray();

        for (int i = 0; i < arreglo.length; i++) {
            char result = arreglo[i];
            System.out.println("result = " + result);
        }

        String[] arreglo2 = trabalenguas.split("a");
        for (String resultString : arreglo2) {
            System.out.println("resultString = " + resultString);
        }
    }
}
