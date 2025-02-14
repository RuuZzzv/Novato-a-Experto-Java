
import java.util.Scanner;

public class EjercicioPropuesto {

    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var titulo = "*** Promedio de Calificaciones ***";
        var pregunta = "¿Cuántas calificaciones deseas agregar?";
        float[] boletaNotas; // Arreglo para almacenar las calificaciones
        var cantidadCalificaciones = 0; // Cantidad de calificaciones (debe ser entero)
        var sumaPromedios = 0f; // Suma de las calificaciones
        var promedioTotal = 0f; // Promedio final

        System.out.println(titulo);
        System.out.println(pregunta);

        cantidadCalificaciones = Integer.parseInt(consola.nextLine()); //Llamamos un número entero de la capacidad del arreglo
        boletaNotas = new float[cantidadCalificaciones];//Indicamos la longitud del arreglo

        //Almacenamos datos en la longitud establecida en el arreglo
        for (int i = 0; i < cantidadCalificaciones; i++) {
            System.out.print("Calificacion[" + i + "] = ");
            boletaNotas[i] = Float.parseFloat(consola.nextLine());
        }
        
        //Realizamos la parte lógica y la salida de data
        System.out.println("\nImpresion de notas: ");
        for (int i = 0; i < cantidadCalificaciones; i++) {
            sumaPromedios += boletaNotas[i];
            promedioTotal = sumaPromedios / cantidadCalificaciones;
            System.out.println("Nota[" + i + "] = " + boletaNotas[i]);
        }
        System.out.println("El promedio es: " + promedioTotal);
    }

}
