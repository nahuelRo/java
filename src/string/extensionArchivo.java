package string;

public class extensionArchivo {
    public static void main(String[] args) {
        String archivo = "alguna_imagen.js";

        int posicionPunto = archivo.lastIndexOf(".");

        System.out.println("Extension: " + archivo.substring(posicionPunto + 1));

    }
}
