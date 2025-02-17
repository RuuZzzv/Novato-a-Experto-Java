public class IterarMatriz {

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
        
        //Recorrer los reglones
        for(int ren = 0; ren < REGLONES; ren++){ //Seleccion reglon
            // Recorrer las columnas (del reglon que esta como pivote)
            for(int col = 0; col < COLUMNAS; col++){ //Seleccion de columnas
                System.out.println("Valor [" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }
        
    }
    
}
