
import java.util.Random;
import java.util.Scanner;

public class FuncionValorAleatorio {

    public static void main(String[] args) {
        // Crear una instancia de la clase Random para generar números aleatorios
        var aleatorio = new Random();

        // Generar un número aleatorio entre 0 y 100 (incluyendo 100)
        int valorAleatorio = aleatorio.nextInt(0, 100 + 1);
        System.out.println("Valor aleatorio entre 0 y 100: " + valorAleatorio);

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el valor mínimo del rango
        System.out.print("Ingrese el valor mínimo: ");
        int valorMinimo = Integer.parseInt(scanner.nextLine());

        // Pedir al usuario que ingrese el valor máximo del rango
        System.out.print("Ingrese el valor máximo: ");
        int valorMaximo = Integer.parseInt(scanner.nextLine());

        // Generar un número aleatorio dentro del rango definido por el usuario
        int valorAleatorio2 = aleatorio.nextInt(valorMinimo, valorMaximo + 1);

        // Mostrar el número aleatorio generado dentro del rango del usuario
        System.out.println("Valor aleatorio entre " + valorMinimo + " y " + valorMaximo + ": " + valorAleatorio2);

        // Cerrar el objeto Scanner para evitar fugas de recursos
        scanner.close();
    }
}
