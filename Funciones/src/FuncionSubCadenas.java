
/**
 * Clase FuncionSubCadenas que muestra cómo obtener subcadenas de una cadena dada.
 */
public class FuncionSubCadenas {

    /**
     * Método principal que extrae y muestra subcadenas de una cadena de texto.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este
     * programa).
     */
    public static void main(String[] args) {
        // Definir la cadena original
        var cadena = "Hola Mundo";

        // Obtener y mostrar la primera subcadena ("Hola")
        // substring(inicio, fin) extrae desde el índice 'inicio' hasta 'fin - 1'
        var subcadena1 = cadena.substring(0, 4);
        System.out.println("Subcadena de " + cadena + ": " + subcadena1);

        // Obtener y mostrar la segunda subcadena ("Mundo")
        var subcadena2 = cadena.substring(5, 10);
        System.out.println("Subcadena 2 de " + cadena + ": " + subcadena2);
    }
}
