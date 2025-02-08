
import java.util.Scanner;

public class EjercicioPractico2 {

    public static void main(String[] args) {
        var mes = 1;
        var consola = new Scanner(System.in);
        final var invierno = "Invierno";
        final var primavera = "Primavera";
        final var verano = "Verano";
        final var otonio = "Otoño";
        final var x = "Estación Desconocida";

        System.out.println("Ingresa el mes del año: ");
        mes = consola.nextInt();

        if (mes == 1 || mes == 2 || mes == 12) {
            System.out.println("Estación del año: "
                    + "\n- " + invierno);
        } else if (mes >= 3 && mes <= 5) {
            System.out.println("Estación del año: "
                    + "\n- " + primavera);
        } else if (mes >= 6 && mes <= 8) {
            System.out.println("Estación del año: "
                    + "\n- " + verano);
        } else if (mes >= 9 && mes <= 11) {
            System.out.println("Estación del año: "
                    + "\n- " + otonio);
        } else {
            System.out.println(x + ": " + mes);
        }

        //Ternario
        System.out.println((mes == 1 || mes == 2 || mes == 12) ? invierno : "");
        System.out.println((mes >= 3 && mes <= 5) ? primavera : "");
        System.out.println((mes >= 6 && mes <= 8) ? verano : "");
        System.out.println((mes >= 9 && mes <= 11) ? otonio : "");
    }

}
