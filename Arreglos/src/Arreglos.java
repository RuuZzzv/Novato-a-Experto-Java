
public class Arreglos {

    public static void main(String[] args) {
        //Declarar un arreglo Definir Variables, conocido como stack (almacena variables )
        int[] enteros;
        //inicializamos conocido como heap
        enteros = new int[5];
        //Declarar el arreglo e inicializar en una linea
        int[] numeros = new int[3];
        //Modificar Elementos
        enteros[0] = 13;
        enteros[1] = 21;
        enteros[4] = 62;
        //Leemos los elementos
        System.out.println("Valor 1: " + enteros[0]);
        System.out.println("Valor 2: " + enteros[1]);
        System.out.println("Valor 3: " + enteros[2]);
        System.out.println("Valor 4: " + enteros[3]);
        System.out.println("Valor 5: " + enteros[4]);
    }
}
