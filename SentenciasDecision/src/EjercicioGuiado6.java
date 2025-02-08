
import java.util.Scanner;

public class EjercicioGuiado6 {

    public static void main(String[] args) {
        var salirSistema = true;
        var consola = new Scanner(System.in);

        System.out.println("****Sistema Web****"
                + "\nOpciones: "
                + "\n- 1. Continuar (true)"
                + "\n- 2. Salir del Sistema (false)");
        salirSistema = Boolean.parseBoolean(consola.nextLine());

        if (!salirSistema) {
            System.out.println("Gracias por utilizar nuestro sistema!.");
        } else {
            System.out.println("Continuamos en el sistema!");
        }

    }
}
