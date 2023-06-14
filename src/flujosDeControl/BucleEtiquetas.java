package F_flujosDeControl;

public class BucleEtiquetas {
    public static void main(String[] args) {

        // Etiqueta
        bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if ( i == 2) {
                    continue bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }

        System.out.println("\n======================================");

        // Etiqueta
        bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if ( i == 2) {
                    break bucle1;
                }
                System.out.print("[i = " + i + ", j = " + j + "], ");
            }
        }


    }
}
