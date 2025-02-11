
import java.util.Scanner;

public class MenuInteractivo {

    public static void main(String[] args) {
        //Atributo
        var opcion = 0;
        var salir = false;

        //Titulo
        System.out.println("*** Sistema de Administración de Cuentas ***");

        //Ciclo
        while (!salir) {

            System.out.print("""
                               Menu:
                               1. Crear Cuenta
                               2. Eliminar Cuenta
                               0. Salir de la cuenta
                               Escoge una opcion:\s""");
            opcion = new Scanner(System.in).nextInt();

            switch (opcion) {
                case 1 ->
                    System.out.println("Creando Cuenta...\n");
                case 2 ->
                    System.out.println("Eliminando Cuenta...\n");
                case 0 -> {
                    System.out.println("Saliendo de la Cuenta, hasta pronto!!");
                    salir = true;
                }
                default ->
                    System.out.println("Ingrese un valor correcto");
            }
        }

    }

}
