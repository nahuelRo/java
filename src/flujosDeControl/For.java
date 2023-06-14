package F_flujosDeControl;

public class For {
    public static void main(String[] args) {

        // 1. Inicializacion y declaracion
        // 2. Condicion
        // 3. Incremento
        for (int i = 0; i < 5; i++){
            System.out.println("i = " + i);
        }

        // Recorrer de atras hacia delante
        for (int i = 10; i >= 0; i--){
            System.out.println("i = " + i);
        }

        // For con dos variables
        for (int i = 1, j = 10; i < j; i++, j--) {
            System.out.println(i + " - " + j);
        }


        // Numeros impares
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0){
                continue;
            }
            System.out.println("i = " + i);
        }
    }
}
