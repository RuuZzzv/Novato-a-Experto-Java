
import java.util.Scanner;

public class EjercicioGuia {

    public static void main(String[] args) {
        var llueveEntrada = false;
        var consola = new Scanner(System.in);
        var nubladoEntrada = false;

        if (llueveEntrada) {
            System.out.println("Llevar Paraguas");
        } else if (nubladoEntrada) {
            System.out.println("Llevar Imperneable");
        } else {
            System.out.println("No Llevar Paraguas, Ni Imperneable");
        }
    }

}
