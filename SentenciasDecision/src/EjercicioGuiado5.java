
import java.util.Scanner;

public class EjercicioGuiado5 {

    public static void main(String[] args) {
        var vacaciones = "";
        var diaDescanso = "";
        var consola = new Scanner(System.in);
        final var OPCION_SI = "SI";
        final var OPCION_NO = "NO";

        System.out.println("Tiene usted día de descanso: ");
        diaDescanso = String.valueOf(consola.nextLine()).toUpperCase(); // .toUpperCase() coloca todo en mayúsculas

        System.out.println("Tiene usted vacaciones: ");
        vacaciones = String.valueOf(consola.nextLine()).toUpperCase();

        if (diaDescanso.equals(OPCION_SI) || vacaciones.equals(OPCION_SI)) {
            System.out.println("Si podrá asistir al juego de su hijo "
                    + "\nRespuestas: "
                    + "\n- Vacaciones: " + vacaciones + ""
                    + "\n- Dia de Descando: " + diaDescanso);
        } else if (diaDescanso.equals(OPCION_NO) && vacaciones.equals(OPCION_NO)) {
            System.out.println("No podrá asistir"
                    + "\nRespuestas: "
                    + "\n- Vacaciones: " + vacaciones + ""
                    + "\n- Dia de Descando: " + diaDescanso);
        } else {
            System.out.println("Respuesta no válida. Por favor, ingrese SI o NO");
        }

    }

}
