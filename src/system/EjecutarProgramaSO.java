package system;

public class EjecutarProgramaSO {
    public static void main(String[] args) {

        Runtime rt = Runtime.getRuntime();
        Process proceso;

        try {
            if (System.getProperty("os.name").startsWith("Windows")) {
                proceso = rt.exec("notepad");
            } else if (System.getProperty("os.name").startsWith("Mac")) {
                proceso = rt.exec("textedit");
            } else if (System.getProperty("os.name").startsWith("Nux")) {
                proceso = rt.exec("textedit");
            }else {
                proceso = rt.exec("gedit");
            }
                proceso.waitFor();
        } catch (Exception e){
            e.printStackTrace();
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor");

    }
}
