// Paquete al que pertenece la clase
package persona;

// Importaciones necesarias
import static java.lang.System.out;
import java.util.Scanner;

/**
 * Clase de prueba para demostrar el funcionamiento de la clase Persona.
 * Incluye interacción con el usuario mediante consola.
 */
public class PruebaPersona {

    //---------------------------------------------
    //  COMPONENTES DE INTERFAZ
    //---------------------------------------------
    /** Scanner para entrada de datos desde consola */
    private static Scanner consola = new Scanner(System.in);
    
    //---------------------------------------------
    //  OBJETOS DE PRUEBA
    //---------------------------------------------
    /** Primera instancia de persona (inicializada con valores vacíos) */
    private static Persona persona1 = new Persona("", "");
    /** Segunda instancia de persona (inicializada con valores vacíos) */
    private static Persona persona2 = new Persona("", "");

    //---------------------------------------------
    //  MÉTODO PRINCIPAL
    //---------------------------------------------
    
    /**
     * Punto de entrada principal del programa
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        out.println("[DEMO] Datos Persona\n");

        //------------------------------------------------
        //  Captura datos para primera persona
        //------------------------------------------------
        out.println("Ingrese su nombre: ");
        persona1.setPrimerNombre(String.valueOf(consola.nextLine()));
        out.println("Ingrese su apellido: ");
        persona1.setApellidoPaterno(String.valueOf(consola.nextLine()));

        //------------------------------------------------
        //  Captura datos para segunda persona
        //------------------------------------------------
        out.println("Ingrese su nombre: ");
        persona2.setPrimerNombre(String.valueOf(consola.nextLine()));
        out.println("Ingrese su apellido: ");
        persona2.setApellidoPaterno(String.valueOf(consola.nextLine()));

        //------------------------------------------------
        //  Mostrar resultados
        //------------------------------------------------
        out.println("\n--- Datos ingresados ---");
        persona1.mostraPersona();
        persona2.mostraPersona();

        //------------------------------------------------
        //  Mostrar referencias de memoria
        //------------------------------------------------
        out.println("\n--- Referencias de objeto ---");
        out.println("Persona1: " + persona1);
        out.println("Persona2: " + persona2);
    }
}