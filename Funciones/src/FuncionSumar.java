
import java.util.Scanner;

/**
 * La clase FuncionSumar demuestra cómo crear y utilizar una función que suma
 * dos números enteros. El programa solicita al usuario que ingrese dos valores
 * enteros, llama a la función {@code sumar} para calcular la suma, y luego
 * muestra el resultado junto con los valores ingresados.
 */
public class FuncionSumar {

    /**
     * Suma dos números enteros.
     *
     * @param a el primer número a sumar.
     * @param b el segundo número a sumar.
     * @return la suma de {@code a} y {@code b}.
     */
    static int sumar(int a, int b) {
        int resultado = a + b;
        return resultado;
    }

    /**
     * Método principal que ejecuta el programa. Este método realiza las
     * siguientes acciones: Solicita al usuario que ingrese dos números enteros.
     * Utiliza la función {@code sumar} para calcular la suma de dichos números.
     * Muestra el resultado de la suma y los valores ingresados en la consola.
     *
     *
     *
     * @param args argumentos de línea de comandos (no se utilizan en este
     * programa).
     */
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario desde la consola.
        var consola = new Scanner(System.in);
        int arg1, arg2;

        // Solicitar al usuario el primer valor y convertirlo a entero.
        System.out.print("Ingrese el valor A: ");
        arg1 = Integer.parseInt(consola.nextLine());

        // Solicitar al usuario el segundo valor y convertirlo a entero.
        System.out.print("Ingrese el valor B: ");
        arg2 = Integer.parseInt(consola.nextLine());

        // Llamar a la función sumar para obtener la suma de arg1 y arg2.
        var resultado = sumar(arg1, arg2);

        // Mostrar en consola el resultado de la suma junto con los valores ingresados.
        System.out.print("El resultado de la suma es: " + resultado
                + "\nValores:"
                + "\n" + arg1
                + "\n" + arg2);
        System.out.println("\n");
    }
}
