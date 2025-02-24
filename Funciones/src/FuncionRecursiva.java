
import java.util.Scanner; // Importa la clase Scanner para la entrada de datos

/**
 * Clase FuncionRecursiva que implementa un método recursivo para imprimir los
 * números desde 1 hasta el número ingresado por el usuario.
 */
public class FuncionRecursiva {

    /**
     * Método recursivo que imprime los números en orden ascendente desde 1
     * hasta el número dado.
     *
     * @param numero El número hasta el cual se imprimirá la secuencia.
     */
    static void recursiva(int numero) {
        if (numero == 1) { // Caso base: si el número es 1, se imprime y se detiene la recursión.
            System.out.print(numero + " ");
        } else {
            recursiva(numero - 1); // Llamada recursiva con el número reducido en 1
            System.out.print(numero + " "); // Se imprime el número después de la recursión
        }
    }

    /**
     * Método principal que solicita un número al usuario y llama al método
     * recursivo.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este
     * programa).
     */
    public static void main(String[] args) {
        System.out.print("Ingrese un número: ");
        int dato = Integer.parseInt(new Scanner(System.in).nextLine()); // Captura la entrada del usuario y la convierte a entero
        recursiva(dato); // Llama al método recursivo con el número ingresado
    }
}
