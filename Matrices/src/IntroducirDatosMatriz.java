
import java.util.Scanner;

public class IntroducirDatosMatriz {

    public static void main(String[] args) {
        //Introduccion valores a la matriz
        var reglones = 0;
        var columnas = 0;
        var consola = new Scanner(System.in);

        //Definimos la matriz
        System.out.print("Proporciona los reglones: ");
        reglones = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona las columnas: ");
        columnas = Integer.parseInt(consola.nextLine());
        
        int[][] matriz = new int[reglones][columnas];
        
        //Solicitar Valores
        for(int ren = 0; ren < reglones; ren++){
            for(int col = 0; col < columnas; col++){
                System.out.print("Valor [" + ren + "][" + col + "] = ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }
        //Iterar los valores de la matriz
        System.out.println();
        for(int ren = 0; ren < reglones; ren++){
            for(int col=0; col < columnas; col++){
                System.out.println("Matriz[" + ren + "][" + col + "] = "
                + matriz[ren][col] + " ");
            }
        }
    }

}
