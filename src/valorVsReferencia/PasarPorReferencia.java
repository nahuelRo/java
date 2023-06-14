package H_valorVsReferencia;

public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edad = {10, 11, 12};

        System.out.println("iniciamos el método main");

        int total = edad.length;
        for (int i = 0; i < total; i++) {
            System.out.println("edad[i] = " + edad[i]);
        }

        System.out.println("Antes de llamar al método test");

        test(edad);

        System.out.println("Despues de llamar al método test");

        for (int i = 0; i < total; i++) {
            System.out.println("edad[i] = " + edad[i]);
        }

        System.out.println("Finaliza el método main");
    }

    public static void test(int[] edadArr){
        System.out.println("Iniciamos el método test");

        int total = edadArr.length;
        for (int i = 0; i < total; i++) {
            edadArr[i] = edadArr[i] + 20;
        }

        System.out.println("Finaliza el método test");
    }
}
