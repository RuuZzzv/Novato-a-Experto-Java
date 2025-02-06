
public class OperadoresUnarios {

    public static void main(String[] args) {
        //Operadores Unarios
        int a = 3, b = -2, resultado = 0;
        //var c = true;

        //Operador Unario de Valor Negativo
        resultado = -a;
        System.out.println("-a = : " + resultado);

        resultado = -b;
        System.out.println("-b = : " + resultado);

        //Operador Unario de Incremento ++
        a = 3;
        resultado = ++a; //Preincremento
        System.out.println("PreIncremento: " + resultado);

        a = 3;
        resultado = a++; //PostIncremento
        System.out.println("PostIncremento: " + resultado);
        System.out.println("a : " + a);

        //Operador Unario de Decremento
        b = -2;
        resultado = --b; //Predecremento
        System.out.println("Predecremento: " + resultado);

        b = -2;
        resultado = b--; //Postdecremento
        System.out.println("Postdecremento: " + resultado);
        System.out.println("b : " + b);

        //Operador Unario de Negacion
        var c = false;

        var resultado2 = !c;

        System.out.println("Negacion !c: " + resultado2);
    }

}
