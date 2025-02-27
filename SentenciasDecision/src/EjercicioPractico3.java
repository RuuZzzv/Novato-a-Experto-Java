
import java.awt.BorderLayout;
import java.util.Scanner;

public class EjercicioPractico3 {

    public static void main(String[] args) {
        //Constante
        final int MAYOR_EDAD = 18;
        //Atributos
        var edad = 1;

        //Interfazs
        System.out.println("Ingrese la edad: ");
        edad = new Scanner(System.in).nextInt();

        //Controlador
        switch (edad) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                System.out.println("La persona con " + edad + " años es menor de edad");
                break;
            default:
                System.out.println("La persona con " + edad + " años es mayor de edad");
        }
        if (MAYOR_EDAD >= edad) {
            System.out.println("\nLa persona con " + edad + " años es mayor de edad (if/else)");
        } else {
            System.out.println("\nLa persona con " + edad + " años es menor de edad (if/else)");
        }
    }

}
