package aritmetica.prueba;

import aritmetica.Aritmetica;
import aritmetica.Aritmetica;
import static java.lang.System.out;

/**
 * Clase de prueba para demostrar funcionalidad de la clase Aritmetica
 * @example 
 * - Creación de objetos
 * - Uso de constructores
 * - Manipulación mediante setters/getters
 */
public class PruebaAritmetica {

    /**
     * Método principal de ejecución
     * @param args Argumentos de consola (no usados)
     */
    public static void main(String[] args) {
        out.println("[DEMO] Clase Aritmética\n");
        
        //------------------------------------------------
        // Objeto 1: Constructor parametrizado
        //------------------------------------------------
        out.println("--- Primer objeto (valores iniciales) ---");
        Aritmetica calc1 = new Aritmetica(5, 7);
        
        // Mostrar valores mediante getters
        out.println("Operando 1: " + calc1.getOperando1());
        out.println("Operando 2: " + calc1.getOperando2() + "\n");
        
        // Realizar operaciones
        calc1.sumar();
        calc1.restar();
        calc1.multiplicar();
        calc1.dividir();  // División entera: 5/7=0
        calc1.resto();    // Resto: 5%7=5
        
        out.println("\nReferencia memoria: " + calc1 + "\n");

        //------------------------------------------------
        // Objeto 2: Constructor vacío + setters
        //------------------------------------------------
        out.println("--- Segundo objeto (asignación posterior) ---");
        Aritmetica calc2 = new Aritmetica();
        
        // Asignar valores mediante setters
        calc2.setOperando1(12);
        calc2.setOperando2(16);
        
        // Verificar asignación
        out.println("Operando 1: " + calc2.getOperando1());
        out.println("Operando 2: " + calc2.getOperando2() + "\n");
        
        // Realizar operaciones
        calc2.sumar();     // 12+16=28
        calc2.restar();    // 12-16=-4
        calc2.multiplicar(); // 12*16=192
        calc2.dividir();   // 12/16=0
        calc2.resto();     // 12%16=12
        
        out.println("\nReferencia memoria: " + calc2);
    }
}