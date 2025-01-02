import java.util.Scanner;

public class Variables {
    //    public static void main(String[] args) {
//        //Variables
//        int edad = 30;
//        double sueldo = 20300.50d;
//        String nombre = "Shande";
//
//        //Acceder a los valores
//        System.out.println("Edad: " + edad);
//        System.out.println("Sueldo: " + sueldo);
//        System.out.println("Nombre: " +nombre);
//
//        // Modificar el valor de las variables
//        edad = 35;
//        sueldo = 300.80d;
//        nombre = "Daysuke";
//        System.out.println("Edad Moficado: " + edad);
//        System.out.println("Sueldo Modificado: " + sueldo);
//        System.out.println("Nombre Modificado: " + nombre);
//    }
//    public static void main(String[] args) {
//        //Variables
//        var edad = 30;
//        var sueldo = 20300.50d;
//        var nombre = "Shande";
//
//        //Acceder a los valores
//        System.out.println("Edad: " + edad);
//        System.out.println("Sueldo: " + sueldo);
//        System.out.println("Nombre: " + nombre);
//
//        // Modificar el valor de las variables
//        edad = 35;
//        sueldo = 300.80d;
//        nombre = "Daysuke";
//        System.out.println("Edad Moficado: " + edad);
//        System.out.println("Sueldo Modificado: " + sueldo);
//        System.out.println("Nombre Modificado: " + nombre);
//    }
//    public static void main(String[] args) {
//        //Concatenacion
//        var nombre = "Shande";
//        var apellido = "Fernandez";
//        var nombreCompleto = nombre + " " + apellido;
//
//        //Salida
//        System.out.println("nombreCompleto = " + nombreCompleto);
//    }

    public static void main(String[] args) {
        // Introducir valores por la consola
        var consola = new Scanner(System.in); // in - input - entrada de datos
        System.out.println("Escribe tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
    }
}
