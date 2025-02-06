
import java.util.Scanner;

public class PresentacionDetalle {

    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        //nombre
        System.out.println("Ingrese su nombre: ");
        var nombre = consola.nextLine();

        //edad
        System.out.println("Ingrese su edad: ");
        var edad = consola.nextLine();

        //hijoUnico
        System.out.println("Es usted hijo unico?:");
        var hijoUnico = consola.nextLine();

        //bebidaFavorita
        System.out.println("Ingrese su bebida favorita: ");
        var bebidaFavorita = consola.nextLine();

        //PrecioBF
        System.out.println("Ingrese el precio de su BF: ");
        var PrecioBF = consola.nextLine();

        var resultadoCompleto = "Hola, " + nombre + " usted tiene una edad de " + Integer.parseInt(edad)
                + ", usted " + Boolean.parseBoolean(hijoUnico) + " es hijo único, su bebida favorita es: " + bebidaFavorita
                + ", tiene un costo de " + Float.parseFloat(PrecioBF);

        System.out.println(resultadoCompleto);
    }

}
