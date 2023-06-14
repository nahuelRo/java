package G_wrapper;

import java.lang.reflect.Method;

public class MetodoGetClass {
    public static void main(String[] args) {

        String texto = "Hola que tal!";

        Class strClass = texto.getClass();

        // Nombre completo de la clase con el package
        System.out.println("strClass.getName() = " + strClass.getName());

        // Nombre sin el package
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());

        System.out.println("strClass.getPackageName() = " + strClass);

        for (Method metodo: strClass.getMethods()) {
            System.out.println("metodo.getName() = " + metodo.getName());
        }

        Integer num = 34;
        Class intClass = num.getClass();

        System.out.println("intClass.getSuperclass().getSuperclass() = " + intClass.getSuperclass().getSuperclass());
    }
}
