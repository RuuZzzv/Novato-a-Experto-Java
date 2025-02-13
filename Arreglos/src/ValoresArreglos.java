
import java.util.Scanner;

public class ValoresArreglos {

    public static void main(String[] args) {
        //Atributos
        var consola = new Scanner(System.in);
        //Declarar Arreglo
        System.out.print("Proporciona el largo del arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        //Creamos de manera dinamica el arreglo
        int[] enteros = new int[largoArreglo];
        //Solicitamos los valores del arreglo
        for(int i = 0; i < largoArreglo; i++){
            System.out.print("Proporciona enteros[" + i + "] = ");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }
        //Imprimir valores del arreglo
        System.out.println("\nImpresion del arreglo: ");
        for(int i = 0; i < largoArreglo; i++){
            System.out.println("enteros[" + i + "] = " + enteros[i]);
        }
    }
    
}
