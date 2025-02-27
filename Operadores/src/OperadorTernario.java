
import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {
        var numeroUnoEntrada = "";
        var numeroDosEntrada = "";
        var numeroUno = 0;
        var numeroDos = 0;
        var consola = new Scanner(System.in);

        System.out.println("Ingrese el primero número: ");
        numeroUnoEntrada = consola.nextLine();

        System.out.println("Ingrese el segundo número: ");
        numeroDosEntrada = consola.nextLine();

        numeroUno = Integer.parseInt(numeroUnoEntrada);
        numeroDos = Integer.parseInt(numeroDosEntrada);

        if (numeroUno > numeroDos) {
            System.out.println("El número " + numeroUno + ", es mayor que " + numeroDos);
        } else if (numeroUno < numeroDos) {
            System.out.println("El número " + numeroUno + ", es menor que " + numeroDos);
        } else {
            System.out.println("El número " + numeroUno + ", es igual que " + numeroDos);
        }

        //Operadores Ternarios:
        System.out.println("El número mayor es: ");
        System.out.println(numeroUno > numeroDos ? numeroUno : numeroDos);

        System.out.println("El número menor es: ");
        System.out.println(numeroDos > numeroUno ? numeroUno : numeroDos);
    }

}
