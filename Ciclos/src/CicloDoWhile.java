
public class CicloDoWhile {

    public static void main(String[] args) {

        //Imprimir del 1 al 5
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        //Ciclo Do - sWhile
        var contador = 1;
        final var VALOR_MAXIMO = 5;

        do {
            System.out.println("Valor: " + contador++);
        } while (contador <= VALOR_MAXIMO);
    }
}
