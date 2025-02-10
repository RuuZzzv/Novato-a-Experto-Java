
import java.util.Scanner;

public class EjercicioPractica4 {

    public static void main(String[] args) {
        final var MENSAJE_CALIFICACION = "Su calificación tiene un valor alfabetico de: ";
        final var MENSAJE_NOTA = "\nNota: ";
        final var MENSAJE_ERROR = "Valor Desconocido: ";
        float nota = 0.0f;
        final String A = "A", B = "B", C = "C", D = "D", F = "F";

        System.out.println("Ingrese la nota: (0 - 10)");
        nota = new Scanner(System.in).nextFloat();

        if (nota >= 9 && nota <= 10) {
            System.out.println(MENSAJE_CALIFICACION + A + MENSAJE_NOTA + nota);
        } else if (nota >= 8 && nota < 9) {
            System.out.println(MENSAJE_CALIFICACION + B + MENSAJE_NOTA + nota);
        } else if (nota >= 7 && nota < 8) {
            System.out.println(MENSAJE_CALIFICACION + C + MENSAJE_NOTA + nota);
        } else if (nota >= 6 && nota < 7) {
            System.out.println(MENSAJE_CALIFICACION + D + MENSAJE_NOTA + nota);
        } else if (nota >= 0 && nota < 7) {
            System.out.println(MENSAJE_CALIFICACION + F + MENSAJE_NOTA + nota);
        } else {
            System.out.println(MENSAJE_ERROR + nota);
        }
    }

}
