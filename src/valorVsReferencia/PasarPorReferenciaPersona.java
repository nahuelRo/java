package H_valorVsReferencia;

class Persona {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

public class PasarPorReferenciaPersona {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Nahuel");

        System.out.println("iniciamos el método main");

        System.out.println("persona.getNombre() = " + persona.getNombre());

        System.out.println("Antes de llamar al método test");

        test(persona);

        System.out.println("Despues de llamar al método test");

        System.out.println("persona.getNombre() = " + persona.getNombre());

        System.out.println("Finaliza el método main");
    }

    public static void test(Persona persona){
        System.out.println("Iniciamos el método test");

        persona.setNombre("Carlito");

        System.out.println("Finaliza el método test");
    }
}
