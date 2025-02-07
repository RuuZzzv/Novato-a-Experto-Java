public class OperadoresLogicos {

    public static void main(String[] args) {
        //Operador Logico
        boolean a = true, b = false;
        
        //and regresa true si ambos valores son iguales
        var resultado = a && b;
        System.out.println("resultado a && b: " + resultado);
        
        
        // or regresa true si cualquiera de los valores es true
        resultado = a || b;
        System.out.println("resultado a || b: " + resultado);
        
        // not (!) este operador unario invite el valor
        resultado = !a;
        System.out.println("resultado !a: " + resultado);
    }
    
}
