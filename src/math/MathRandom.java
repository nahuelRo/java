package K_Math;

import java.util.Random;

public class MathRandom {
    public static void main(String[] args) {

        String[] colores = {"Azul", "Amarillo", "Rojo", "Verde", "Blanco", "Negro"};

        // Numero random entre 0 y 1
        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length;

        System.out.println("random = " + random);
        
        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[ (int) random]);

        Random randomObj = new Random();
        int randomInt = randomObj.nextInt(7);
        System.out.println("randomInt = " + randomInt);
    }
}
