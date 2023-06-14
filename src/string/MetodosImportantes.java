package D_string;

public class MetodosImportantes {
    public static void main(String[] args) {
        String nombre = "Nahuel";

        // Largo de la cadena
        System.out.println("nombre.length() = " + nombre.length());
        
        // Convertir a mayuscula
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        
        // Convertir a minusculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());

        // Comparar por valor
        System.out.println("nombre.equals(\"Nahuel\") = " + nombre.equals("Nahuel"));

        // Comparar por valor y ignorar la may y min
        System.out.println("nombre.equals(\"Nahuel\") = " + nombre.equalsIgnoreCase("nahuel"));
        
        // Comparando a nivel de un orden.
        // -1 Menor
        // 0 Igual
        // 1 Mayor
        System.out.println("nombre.compareTo(\"Nahuel\") = " + nombre.compareTo("Nahuel"));
        System.out.println("nombre.compareTo(\"Aaron\") = " + nombre.compareTo("Aaron"));
        
        // Obtener un caracter
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        // Forma dinamica
        System.out.println("nombre.charAt(0) = " + nombre.charAt(nombre.length() - 1));
        
        // Obtener una parte del string
        System.out.println("nombre.substring(1) = " + nombre.substring(1));

        // Obtener una parte hasta otra parte de un String
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));

        String trabalengua = "trabalenguas";

        // Remplazar
        System.out.println("trabalengua.replace(\"a\", \".\") = " + trabalengua.replace("a", "."));
        
        // Encuentra la primer ocurrencia y te devuelve la posicion
        System.out.println("trabalengua.indexOf() = " + trabalengua.indexOf('a'));

        // Ultima ocurrencia y te devuelve la posicion
        System.out.println("trabalengua.lastIndexOf(\"a\") = " + trabalengua.lastIndexOf('a'));

        // Si no existe devuelve -1
        System.out.println("trabalengua.lastIndexOf(\"z\") = " + trabalengua.lastIndexOf('z'));
        
        //  Secuencia de caracteres
        System.out.println("trabalengua.contains('t') = " + trabalengua.contains("lenguas"));
        
        // Comienza con
        System.out.println("trabalengua.startsWith(\"traba\") = " + trabalengua.startsWith("traba"));

        // Termina con
        System.out.println("trabalengua.endsWith(\"traba\") = " + trabalengua.endsWith("traba"));

        // Matchea
        System.out.println("trabalengua.matches(\"nahuel\") = " + trabalengua.matches("trabalenguas"));

        // Quita espacios en blanco
        System.out.println(" trabalenguas ".trim());
    }
}
