package aritmetica;

import static java.lang.System.out;

/**
 * Clase que realiza operaciones aritméticas básicas con encapsulamiento.
 * Demuestra: 
 * - Sobrecarga de constructores
 * - Uso de 'this'
 * - Métodos getters/setters
 * - Manejo de excepciones implícito
 */
public class Aritmetica {
    //------------------------------------------
    // ATRIBUTOS (Encapsulados)
    //------------------------------------------
    /** Primer operando (privado para encapsulamiento) */
    private int operador1;
    /** Segundo operando (privado para encapsulamiento) */
    private int operador2;
    /** Resultado de operaciones (acceso paquete) */
    int resultado;

    //------------------------------------------
    // CONSTRUCTORES
    //------------------------------------------
    
    /**
     * Constructor parametrizado que inicializa ambos operandos
     * @param operador1 Valor inicial para el primer operando
     * @param operador2 Valor inicial para el segundo operando
     * @implNote Imprime la referencia del objeto usando System.out
     */
    public Aritmetica(int operador1, int operador2) {
        this.operador1 = operador1;  // this diferencia atributo de parámetro
        this.operador2 = operador2;
        out.println("Referencia objeto: " + this);
    }

    /**
     * Constructor vacío (sobrecarga)
     * @implNote Los operandos deben asignarse posteriormente vía setters
     */
    public Aritmetica() {
        out.println("Referencia objeto: " + this);
    }

    //------------------------------------------
    // GETTERS/SETTERS (Acceso controlado)
    //------------------------------------------
    
    /** @return Valor actual del primer operando */
    public int getOperando1() {
        return operador1;
    }

    /** @return Valor actual del segundo operando */
    public int getOperando2() {
        return operador2;
    }

    /**
     * Establece nuevo valor para primer operando
     * @param operador1 Nuevo valor numérico
     */
    public void setOperando1(int operador1) {
        this.operador1 = operador1;
    }

    /**
     * Establece nuevo valor para segundo operando
     * @param operador2 Nuevo valor numérico
     */
    public void setOperando2(int operador2) {
        this.operador2 = operador2;
    }

    //------------------------------------------
    // MÉTODOS DE OPERACIONES
    //------------------------------------------
    
    /** Realiza suma y muestra resultado por consola */
    public void sumar() {
        resultado = operador1 + operador2;
        out.println("Suma: " + resultado);
    }

    /** Realiza resta y muestra resultado por consola */
    public void restar() {
        resultado = operador1 - operador2;
        out.println("Resta: " + resultado);
    }

    /** Realiza multiplicación y muestra resultado por consola */
    public void multiplicar() {
        resultado = operador1 * operador2;
        out.println("Multiplicación: " + resultado);
    }

    /**
     * Realiza división entera
     * @warning Lanza ArithmeticException si operador2 es cero
     */
    public void dividir() {
        resultado = operador1 / operador2;
        out.println("División: " + resultado);
    }

    /** Calcula resto de división y muestra resultado por consola */
    public void resto() {
        resultado = operador1 % operador2;
        out.println("Resto: " + resultado);
    }
}