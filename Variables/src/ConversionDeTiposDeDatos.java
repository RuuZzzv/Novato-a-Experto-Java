
import java.util.Scanner;

public class ConversionDeTiposDeDatos {
    
    //Conversion de tipos de Datos

    public static void main(String[] args) {
        
        var consola = new Scanner(System.in);
        System.out.print("Ingrese el primer valor: ");
        // el metodo parseInt convierte de cadena a un valor numerico
        var valor1 = consola.nextLine(); //el metodo nextline regresa un valor en cadena
        
        System.out.print("Ingrese el segundo valor: ");
        var valor2 = consola.nextLine();
        
        var resultado = Integer.parseInt(valor1) + Integer.parseInt(valor2);
        
        var concatenacion = valor1 + valor2;
        
        System.out.println("Concatenacion: " + concatenacion);
        System.out.println("Resultado: " + resultado);
    }
    
}
