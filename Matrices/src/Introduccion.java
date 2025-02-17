public class Introduccion {

    public static void main(String[] args) {
        //Definir Constantes
        final int REGLONES = 2;
        final int COLUMNAS = 3;
        
        //Definimos la Matriz
        int[][] matriz = new int[REGLONES][COLUMNAS];
        
        //Llenamos la Matriz
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        
        //Accedemos a los valores de nuestra matriz
        System.out.println("Valor 1 [0][0]: " + matriz[0][0]);
        System.out.println("Valor 5 [1][1]: " + matriz[1][1]);
        
    }
    
}
