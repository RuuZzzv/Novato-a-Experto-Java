
import java.util.Scanner;

public class SumaDiagonal {

    public static void main(String[] args) {
        //Introduccion valores a la matriz
        var consola = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        //Solicitar Valores
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.print("Valor [" + ren + "][" + col + "] = ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }
        //Iterar los valores de la matriz
        System.out.println();
        var suma = matriz[0][0] + matriz[1][1] + matriz[2][2];
                System.out.println("La suma diagonal es: "
                        + suma);
    }

}
