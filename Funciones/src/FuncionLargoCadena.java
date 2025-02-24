
/**
 * Clase FuncionLargoCadena que muestra la longitud de una cadena
 * y recorre sus caracteres mostrando su índice y valor.
 */
public class FuncionLargoCadena {

    /**
     * Método principal que obtiene la longitud de una cadena y recorre cada
     * carácter mostrando su posición.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este
     * programa).
     */
    public static void main(String[] args) {
        // Definir una cadena de texto
        var cadena = "Hola Mundo";

        // Obtener y mostrar la longitud de la cadena
        System.out.println("Largo de la cadena: " + cadena.length());

        // Recorrer la cadena e imprimir cada carácter con su índice
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(i + " -> " + cadena.charAt(i));
        }
    }
}
