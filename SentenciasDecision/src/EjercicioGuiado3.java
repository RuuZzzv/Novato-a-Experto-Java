
import java.util.Scanner;

public class EjercicioGuiado3 {

    public static void main(String[] args) {
        var cadena1 = "shande";
        var cadena2 = "shande";
        var consola = new Scanner(System.in);
        var cadena3 = "";

        System.out.println("Ingrese la cadena 3: ");
        cadena3 = consola.nextLine();

        if (cadena1 == cadena3) {
            System.out.println("Las cadena son iguales en (referencia a memoria)");
        } else {
            System.out.println("Las cadenas son distintas en (referencia a memoria)");
        }

        //Comparacion usando el metodo equals || equalIgnoreCase
        if (cadena1.equalsIgnoreCase(cadena3)) {
            System.out.println("Las cadenas son iguales en (contenido)");
        } else {
            System.out.println("Las cadenas son distintas en (contenido)");
        }
    }

}
