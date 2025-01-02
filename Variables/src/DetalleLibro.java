import java.util.Scanner;

public class DetalleLibro {
    public static void main(String[] args) {
        //Declarar Variables
        var titulo = "No existe Titulo";
        var autor = "No existe Autor";

        //Captura de Datos
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese el Titulo del Libro: ");
        titulo = consola.nextLine();
        System.out.println("Ingrese el Autor del Libro: ");
        autor = consola.nextLine();


        //Salida de Datos

        System.out.println(titulo + " tiene como autor a " + autor);
    }
}
