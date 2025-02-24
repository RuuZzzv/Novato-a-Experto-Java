
import static java.lang.System.out;
import java.util.Scanner;

public class GeneradorEmail {

    static void generarEmail(){
        var nombreEntrada = "";
        var apellidoEntrada = "";
        var consola = new Scanner(System.in);
        var resultadoConcatenadoEmail = "";
        var dominioEntrada = "";
        
        out.print("Ingrese su nombre: ");
        nombreEntrada = String.valueOf(consola.nextLine().toLowerCase());
        out.print("Ingrese su apellido: ");
        apellidoEntrada = String.valueOf(consola.nextLine().toLowerCase());
        out.print("Ingrese su dominio del email: ");
        dominioEntrada = String.valueOf(consola.nextLine().toLowerCase());
        
        resultadoConcatenadoEmail = nombreEntrada + "." + apellidoEntrada + "@" + dominioEntrada;
        
        out.println("Su correo generado es: " + resultadoConcatenadoEmail);
    }

    public static void main(String[] args) {
        generarEmail();
    }
    
}
