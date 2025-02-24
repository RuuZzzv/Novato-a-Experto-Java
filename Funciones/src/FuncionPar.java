
import java.util.Scanner; // Importa la clase Scanner para la entrada de datos

/**
 * Clase FuncionPar que determina si un número ingresado por el usuario es par.
 */
public class FuncionPar {

    /**
     * Método que verifica si un número es par.
     *
     * @param numero El número a evaluar.
     * @return true si el número es par, false en caso contrario.
     */
    static boolean esPar(int numero) {
        return (numero % 2 == 0); // Retorna true si el residuo de la división entre 2 es 0
    }

    /**
     * Método principal que solicita un número al usuario y determina si es par.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este
     * programa).
     */
    public static void main(String[] args) {
        System.out.print("Proporcione un valor numérico: ");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine()); // Captura la entrada del usuario y la convierte a entero
        System.out.println("¿Número Par? " + esPar(numero)); // Llama a la función y muestra el resultado
    }
}
