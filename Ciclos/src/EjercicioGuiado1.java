
public class EjercicioGuiado1 {

    public static void main(String[] args) {

        //Sumar los 5 primeros números
        var acumuladorSuma = 0;
        final var VALOR_MAXIMO = 5;
        var numero = 0;

        //ciclo for
        for (numero = 1; numero <= VALOR_MAXIMO; numero++) {
            //Lo que se va sumar
            System.out.println("(acumulador + numero) -> " + acumuladorSuma + " : " + numero);
            acumuladorSuma += numero;
            //Resultado parcial
            System.out.println("Suma parcial acumulada: " + acumuladorSuma);
        }
        System.out.println("Suma acumulativa de los 5 primeros números: " + acumuladorSuma);

        //ciclo while
        while (numero <= VALOR_MAXIMO) {
            System.out.println("(acumulador + numero) -> " + acumuladorSuma + " : " + numero);
            acumuladorSuma += numero;
            System.out.println("Suma parcial acumulada: " + acumuladorSuma);
            numero++;
            System.out.println("Suma acumulativa de los 5 primeros números: " + acumuladorSuma);
        }

        //ciclo do while
        do {
            System.out.println("(acumulador + numero) -> " + acumuladorSuma + " : " + numero);
            acumuladorSuma += numero;
            System.out.println("Suma parcial acumulada: " + acumuladorSuma);
            numero++;
            System.out.println("Suma acumulativa de los 5 primeros números: " + acumuladorSuma);
        } while (numero <= VALOR_MAXIMO);
    }

}
