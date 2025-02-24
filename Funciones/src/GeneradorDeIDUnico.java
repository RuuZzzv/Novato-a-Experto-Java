import static java.lang.System.out; // Importación estática para usar 'out' sin 'System'
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class GeneradorDeIDUnico {

    /**
     * Método para generar un ID único basado en el nombre, apellido,
     * año de nacimiento y un número aleatorio.
     */
    static void generarIdUnico() {
        // Crear un objeto Scanner para leer la entrada del usuario
        var consola = new Scanner(System.in);
        var nombreEntrada = "";
        var apellidoEntrada = "";
        var nacimientoEntrada = "";
        
        // Generar un número aleatorio entre 0 y 999
        var aleatorio = new Random().nextInt(0, 999);

        // Solicitar datos al usuario
        out.print("Ingrese su nombre: ");
        nombreEntrada = consola.nextLine().toUpperCase(); // Convertir a mayúsculas
        out.print("Ingrese su apellido: ");
        apellidoEntrada = consola.nextLine().toUpperCase(); // Convertir a mayúsculas
        out.print("Su año de nacimiento (YYYY): ");
        nacimientoEntrada = consola.nextLine(); // Mantener en formato de texto
        
        // Formatear el número aleatorio a un valor de hasta 4 dígitos
        String valorAleatorio = new DecimalFormat("####").format(aleatorio);
        
        // Extraer los primeros dos caracteres del nombre y apellido
        var nombreCadena = nombreEntrada.substring(0, 2);
        var apellidoCadena = apellidoEntrada.substring(0, 2);
        
        // Extraer los dos últimos dígitos del año de nacimiento
        var nacimientoCadena = nacimientoEntrada.substring(2, 4);

        // Construir el ID único combinando los valores extraídos
        var idUnico = nombreCadena + apellidoCadena + nacimientoCadena + valorAleatorio;

        // Mostrar el ID generado
        System.out.println("Su ID único es: " + idUnico);
        
        // Cerrar el Scanner para evitar fugas de recursos
        consola.close();
    }

    /**
     * Método principal que ejecuta la generación del ID único.
     */
    public static void main(String[] args) {
        generarIdUnico();
    }
}
