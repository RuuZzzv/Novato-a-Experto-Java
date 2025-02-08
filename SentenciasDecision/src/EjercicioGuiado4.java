
import java.util.Scanner;

public class EjercicioGuiado4 {

    public static void main(String[] args) {

        var usuario = "Shande";
        var password = "sistemas";
        var usuarioEntrada = "";
        var passwordEntrada = "";
        var consola = new Scanner(System.in);

        System.out.println("Ingrese el usuario: ");
        usuarioEntrada = consola.nextLine();

        System.out.println("Ingresa la contraseña: ");
        passwordEntrada = consola.nextLine();

        if (usuario.equalsIgnoreCase(usuarioEntrada) && password.equals(passwordEntrada)) {
            System.out.println("Ingresando al sistema!!");
        } else if (usuario.equalsIgnoreCase(usuarioEntrada) && !password.equals(passwordEntrada)) {
            System.out.println("La contraseña es incorrecta segun (Contenido)");
        } else if (!usuario.equalsIgnoreCase(usuarioEntrada) && password.equals(passwordEntrada)) {
            System.out.println("El usuario es incorrecto segun (Contenido)");
        } else {
            System.out.println("El usuario y la contraseña son incorrectos (Segun contenido)");
        }

    }

}
