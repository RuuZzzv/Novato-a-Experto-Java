
import java.util.Scanner;

public class EjercicioGuiado2 {

    public static void main(String[] args) {
        var numeroEntrada = "";
        var numero = 0;
        var consola = new Scanner(System.in);

        System.out.println("Ingrese un valo numerico: ");
        numeroEntrada = consola.nextLine();

        numero = Integer.parseInt(numeroEntrada);

        if (numero > 0) {
            System.out.println("El número es positivo: " + numero);
        } else if (numero < 0) {
            System.out.println("El número es negativo: " + numero);
        } else {
            System.out.println("Es cero: " + numero);
        }

    }

}
