package ArgumentosComandos;

public class ArgumentoLineaComandoCalculadora {
    public static void main(String[] args) {

        if (args.length != 3){
            System.out.println("Por favor ingresar una operacion (suma, resta, div o multi) y dos enteros");
            System.exit(-1);
        }

        String operacion = args[0];
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        double resultado = 0.00;
        try {
            a = Integer.parseInt(args[1]);
            b = Integer.parseInt(args[2]);
        } catch (NumberFormatException e){
            System.err.println("Cuidado a y b deben ser enteros");
            System.exit(-1);
        }

        switch (operacion) {
            case "suma" -> resultado = a + b;
            case "resta" -> resultado = a - b;
            case "multi" -> resultado = a * b;
            case "div" -> {
                if (b == 0) {
                    System.exit(-1);
                    System.out.println("No se puede dividir por zero!");
                }
                resultado = (double) a / b;
            }
            default -> resultado = a + b;
        }
        System.out.println("Resultado de la operacion '" + operacion + "' es: " + resultado);
    }
}
