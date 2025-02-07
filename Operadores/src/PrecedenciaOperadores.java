public class PrecedenciaOperadores {

    public static void main(String[] args) {
        // Precedencia de Operadores
        // 1. Parentesis y Corchetes
        // 2. Operadores Unarios -, ++, --
        // 3. Operadores Aritmeticos *, / y %
        // 4. Operadores Aritmeticos + y -
        // 5. Relacionales <, <=, >, >=
        // 6. Equivalencia == y !=
        // 7. Logicos && y ||
        // 8. Asignacion =, +=, -=,*=, etc 
        
        //Expresion
        //Paso 1: 12 se divida con 3 y tome el resultado de 4
        //Paso 2: 2 por 3 toma el resultado de 6
        //Paso 3: 4 + 6 es igual a 10
        //Paso 4: 10 menos 1 da como resultado 9
        var a = 12 / 3 + 2 * 3 - 1;
        
        System.out.println("resultado: " + a);
    }
    
}
