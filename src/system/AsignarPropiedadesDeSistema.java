package J_system;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AsignarPropiedadesDeSistema {
    public static void main(String[] args) {

        try {
            // 1. Creo un archivo con la extension .properties
            // Con la clase FileInputStream Leo el archivo .properties
            FileInputStream archivo = new FileInputStream("src/system/config.properties");

            // Con la clase properties guardo todas las propiedades que ya tiene mi sistema
            Properties p = new Properties(System.getProperties());
            // Y ademas cargo el archivo que lei
            p.load(archivo);
            // Tambien se pueden guardar de una propiedad
            p.setProperty("mi.propiedad.personalizada", "Mi valor guardado en el objeto properties");
            // En el sistema guardamos las propiedades
            System.setProperties(p);

            // Con una clase properties llamamos las propiedades del sistema
            Properties ps = System.getProperties();
            System.out.println("ps.getProperty(\"mi.propiedad.personalizada\") = " + ps.getProperty("mi.propiedad.personalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("config.autor.nombre"));
            System.out.println(System.getProperty("config.autor.email"));

        }catch (FileNotFoundException e){
            System.out.println("no existe el archivo = " + e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
