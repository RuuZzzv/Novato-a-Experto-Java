import java.util.Scanner;

/**
 * La clase SumaDiagonal permite calcular la suma de los elementos 
 * que se encuentran en la diagonal principal de una matriz.
 * 
 * La diagonal principal es aquella en la que el índice de la fila es igual 
 * al índice de la columna (por ejemplo, posiciones [0][0], [1][1], etc.).
 * 
 * Este programa solicita al usuario el número de renglones y columnas de la matriz,
 * luego pide al usuario que ingrese los valores para cada posición de la matriz.
 * Finalmente, recorre la matriz y suma aquellos elementos que pertenecen a la diagonal principal,
 * mostrando el resultado al final.
 */
public class SumaDiagonal {

    public static void main(String[] args) {
        // Se crea un objeto Scanner para leer la entrada del usuario.
        var consola = new Scanner(System.in);
        
        // Declaración e inicialización de variables para el número de renglones y columnas.
        // Inicialmente se asignan a 0.
        var reglones = 0;
        var columnas = 0;

        // Solicitar al usuario el número de renglones de la matriz.
        System.out.print("Proporcione reglones: ");
        reglones = Integer.parseInt(consola.nextLine());
        
        // Solicitar al usuario el número de columnas de la matriz.
        System.out.print("Proponercione columnas: ");
        columnas = Integer.parseInt(consola.nextLine());

        // Se declara e inicializa la matriz con el tamaño proporcionado por el usuario.
        int[][] matriz = new int[reglones][columnas];
        
        // Se solicitan los valores para cada elemento de la matriz.
        for (int ren = 0; ren < reglones; ren++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print("Valor [" + ren + "][" + col + "] = ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }
        
        // Inicializar la variable que almacenará la suma de la diagonal principal.
        var sumarDiagonal = 0;
        
        // Se recorre la matriz para sumar los elementos que se encuentran en la diagonal.
        // Para ello, se verifica que el índice de la fila (ren) sea igual al índice de la columna (col).
        for (int ren = 0; ren < reglones; ren++) {
            for (int col = 0; col < columnas; col++) {
                if (ren == col) {
                    sumarDiagonal += matriz[ren][col];
                }
            }
        }
        
        // Se muestra el resultado de la suma de los elementos de la diagonal.
        System.out.println("La suma diagonal de la matriz es: " + sumarDiagonal);
    }
}
