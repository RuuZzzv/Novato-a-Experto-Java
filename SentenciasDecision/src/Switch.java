
import java.util.Scanner;

public class Switch {

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
            System.out.println("Estación del año (if/else): "
                    + "\n- " + invierno);
        } else if (mes >= 3 && mes <= 5) {
            System.out.println("Estación del año (if/else): "
                    + "\n- " + primavera);
        } else if (mes >= 6 && mes <= 8) {
            System.out.println("Estación del año (if/else): "
                    + "\n- " + verano);
        } else if (mes >= 9 && mes <= 11) {
            System.out.println("Estación del año (if/else): "
                    + "\n- " + otonio);
        } else {
            System.out.println(x + ": " + mes);
        }

        //Ternario
        System.out.println((mes == 1 || mes == 2 || mes == 12) ? "Ternario: \n- " + invierno : "");
        System.out.println((mes >= 3 && mes <= 5) ? "Ternario: \n- " + primavera : "");
        System.out.println((mes >= 6 && mes <= 8) ? "Ternario: \n- " + verano : "");
        System.out.println((mes >= 9 && mes <= 11) ? "Ternario: \n- " + otonio : "");

        //Switch
        switch(mes)
        {
            case 1: case 2: case 12:
            System.out.println("Estación del año (Switch): "
                    + "\n- " + invierno);
            break;
            case 3: case 4: case 5:
                System.out.println("Estación del año(Switch): "
                    + "\n- " + primavera);
                break;
            case 6: case 7: case 8:
                System.out.println("Estación del año (Switch): "
                    + "\n- " + verano);
                break;
            case 9: case 10: case 11:
                System.out.println("Estación del año (Switch): "
                    + "\n- " + otonio);
                break;
            default:
                System.out.println(x + ": " + mes);
        }
    }

}
