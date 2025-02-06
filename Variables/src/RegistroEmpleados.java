
import java.util.Scanner;

public class RegistroEmpleados {

    public static void main(String[] args) {
        
        var consola = new Scanner(System.in);
        
        System.out.println("**Ingrese los datos del Empleado**");
        
        //Nombre del Empleado
        System.out.println("Ingrese el nombre del Empleado: ");
        var nombreEmpleado = consola.nextLine();
        
        //Edad del Empleado
        System.out.println("Ingrese la edad del Empleado: ");
        var edadEmpleado = consola.nextLine();
        
        //Sueldo del Empleado
        System.out.println("Ingrese el sueldo del Empleado: ");
        var sueldoEmpleado = consola.nextLine();
        
        //Empleado de Confianza¿?
        System.out.println("El empleado es de confianza? (true or false): ");
        var confianzaEmpleado = consola.nextLine();
        
        
        System.out.println("***Detalles del Empleado***");
        System.out.println("Nombre: " + nombreEmpleado);
        System.out.println("Edad: " + Integer.parseInt(edadEmpleado));
        System.out.println("Sueldo: " + Float.parseFloat(sueldoEmpleado));
        System.out.println("Confianza: " + Boolean.parseBoolean(confianzaEmpleado));
    }
    
}
