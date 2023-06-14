package J_system;

import java.util.Properties;

public class ClaseSystem {
    public static void main(String[] args) {

        // Obtener las propiedades del sistema
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);
        
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        String java = System.getProperty("java.version");
        System.out.println("java = " + java);

        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator: = " + lineSeparator + "Una linea nueva");

        // Clase properties nos permite guardar las propiedades de la clase System
        Properties p = System.getProperties();
        // Metodo list me permite verlas
        p.list(System.out);
    }
}
