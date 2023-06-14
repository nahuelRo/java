package flujosDeControl;

public class While {
    public static void main(String[] args) {

        // Inicializacion y declaracion
        int i = 0;
        // Mientras
        while(i < 5){
            System.out.println("i = " + i);
            // Incremento
            i++;
        }

        // Se utiliza cuando no conocemos la longitud.
        // Ademas no es requerido entrar si o si al while.
        i = 0;
        boolean prueba = true;
        while(prueba){
            if (i == 7){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        prueba = false;
        while (prueba){
            System.out.println("nunca se ejecuta");
        }

        // Almenos se ejecuta una sola vez el codigo
        do {
            System.out.println("se ejecuta al menos una vez");
        } while (prueba);


        prueba = true;
        i = 0;
        do {
            if (i == 10){
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        } while (prueba);
    }
}
