
public class SintaxisSimplificadaMatriz {

    public static void main(String[] args) {
        //Definimos la Matriz
        int[][] matriz = { 
            {100, 200, 300},
            {400, 500, 600}
        }; //Sintaxis simplificada

        //Recorrer los reglones
        for (int ren = 0; ren < matriz.length; ren++) { //Seleccion reglon
            // Recorrer las columnas (del reglon que esta como pivote)
            for (int col = 0; col < matriz[ren].length; col++) { //Seleccion de columnas
                System.out.println("Valor [" + ren + "][" + col + "] = " + matriz[ren][col]);
            }
        }

    }

}
