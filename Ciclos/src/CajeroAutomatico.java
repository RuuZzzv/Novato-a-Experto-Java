
import java.util.Scanner;

public class CajeroAutomatico {

    public static void main(String[] args) {
        //Atributo
        var opcionMenu = 0;
        var dineroActual = 1000.00f;
        var salirSistema = false;
        var depositarDinero = 0.00f;
        var retirarDinero = 0.00f;
        var consolaCMD = new Scanner(System.in);
        var confirmarExit = false;

        //Ciclo
        while (!salirSistema) {
            //Titulo
            System.out.println("*** Sistema de Finanzas (Cajero Automático) ***");
            System.out.print("""
                               Solicitud:
                               1. Depositar
                               2. Retirar
                               3. Consultar Saldo
                               0. Salir
                               Escoge una opcion:\n\s""");
            opcionMenu = consolaCMD.nextInt();

            switch (opcionMenu) {
                case 1 -> {
                    System.out.print("Ingrese la cantidad a depositar");
                    depositarDinero = consolaCMD.nextFloat();
                    dineroActual += depositarDinero;
                }
                case 2 -> {
                    System.out.print("Ingrese la cantidad a retirar");
                    retirarDinero = consolaCMD.nextFloat();
                    if (dineroActual > retirarDinero) {
                        dineroActual -= retirarDinero;
                        System.out.println("Se realizo el retiro safistactoriamente!!");
                    } else {
                        System.out.println("Saldo Insuficiente..."
                                + "\nTu saldo actual es: " + dineroActual);
                    }
                }
                case 3 -> {
                    System.out.println("Su saldo actual es: "
                            + "\n- $" + dineroActual);
                }
                case 0 -> {
                    System.out.println("Confirmar si saldrá del sistema... (true/false)");
                    confirmarExit = consolaCMD.nextBoolean();
                    if (confirmarExit) {
                        salirSistema = true;
                    }
                }
                default ->
                    System.out.println("Ingrese un valor correcto");
            }
            System.out.println("\n");
        }

    }

}
