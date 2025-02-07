
import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {

        //Constantes
        final int MINIMO = 0, MAXIMO = 5;
        //Variables
        var estaEnRango = false;
        var consola = new Scanner(System.in);
        var entradaUsuario = "";
        var numeroConvertido = 0;

        //Recoleccion de dato númerico
        System.out.println("Ingrese un valor en un rango de 0 - 5: ");
        entradaUsuario = consola.nextLine();

        //Conversion de tipo cadena a numero (nextLine() es de tipo cadena)
        numeroConvertido = Integer.parseInt(entradaUsuario);

        //Logica
        estaEnRango = numeroConvertido >= 0 && numeroConvertido <= 5;

        
        //Resultado
        System.out.println("El numero es: " + estaEnRango);

    }

}
