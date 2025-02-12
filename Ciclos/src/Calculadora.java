
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        //Atributos
        var valorA = 0.00f;
        var valorB = 0.00f;
        var consolaCMD = new Scanner(System.in);
        var salirSistema = false;
        var opcionMenu = 0;
        var resultado = 0.00f;

        //Ciclo
        while (!salirSistema) {
            System.out.println("*** Calculadora Virtual ***");
            System.out.print("""
                               Operación:
                               1. Sumar
                               2. Restar
                               3. Multiplicar
                               4. Dividir
                               5. Salir
                               Escoge una opcion:\s""");
            opcionMenu = consolaCMD.nextInt();
            if (opcionMenu != 5 && opcionMenu < 5) {
                System.out.println("Ingrese el primer valor: ");
                valorA = consolaCMD.nextFloat();
                System.out.println("Ingrese el segundo valor: ");
                valorB = consolaCMD.nextFloat();
            } else if (opcionMenu > 5) {
                System.out.println("Ingrese un valor correcto en el menú, valo incorrecto: " + opcionMenu);
                salirSistema = true;
            } else {
                System.out.println("Saliendo de la calculadora Virtual..");
                salirSistema = true;
            }

            switch (opcionMenu) {

                case 1: {

                    resultado = valorA + valorB;
                    System.out.println("La suma es: " + resultado);
                    break;
                }

                case 2: {

                    resultado = valorA - valorB;
                    System.out.println("La resta es: " + resultado);
                    break;
                }

                case 3: {

                    resultado = valorA * valorB;
                    System.out.println("La multiplicacion es: " + resultado);
                    break;
                }

                case 4: {

                    resultado = valorA / valorB;
                    System.out.println("La division es: " + resultado);
                    break;

                }

                case 5: {
                    salirSistema = true;
                    break;
                }
            }
        }
    }

}
