package G_wrapper;

public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 32768;
        // Clase que envuelve al primitivo (int)
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = 32768;
        System.out.println("intObjeto = " + intObjeto);

        // Convertir de referencia a primitivo
        int numero1 = intObjeto;
        System.out.println("numero1 = " + numero1);
        int numero2 = intObjeto.intValue();
        System.out.println("numero2 = " + numero2);

        // Convertir de String a Entero de referencia
        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        // No marca error, pero hay perdida de información
        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);

        // Me lo permite, pero hay perdida de información
        Byte byteObjeto = intObjeto.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        // Me lo permite
        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);
        

    }
}
