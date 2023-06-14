package E_operadores;

import java.util.Scanner;

public class LogicosLogin {
    public static void main(String[] args) {

        String[] usernames = {"Nahuel", "admin", "pepe"};
        String[] passwords = {"123", "1234", "12345"};
        usernames[0] = "Nahuel";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "pepe";
        passwords[2] = "12345";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el username");
        String u = scanner.nextLine();
        System.out.println("Ingrese la password");
        String p = scanner.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            if ((usernames[i].equals(u) && passwords[i].equals(p))) {
                esAutenticado = true;
                break;
            }
        }

        if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Username o contraseña incorrecta");
            System.out.println("Lo siento, requiere autenticación");
        }

    }
}
