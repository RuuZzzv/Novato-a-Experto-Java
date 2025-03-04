package animales;

import static java.lang.System.out;

/**
 * Clase base que representa un animal genérico. Demuestra el concepto de
 * herencia en POO.
 */
public class Animal {

    //---------------------------------------------
    //  MÉTODOS DE COMPORTAMIENTO BASE
    //---------------------------------------------
    /**
     * Simula la acción de comer del animal.
     *
     * @implNote Comportamiento genérico para todos los animales.
     */
    public void comer() {
        out.println("Como muchas veces al día");
    }

    /**
     * Simula la acción de dormir del animal.
     *
     * @implNote Comportamiento genérico para todos los animales.
     */
    public void dormir() {
        out.println("Duermo muchas horas al día");
    }
} // Fin de la clase Animal

//---------------------------------------------
//  SUBCLASE PERRO (HERENCIA)
//---------------------------------------------
/**
 * Clase que representa un perro, heredando comportamiento básico de Animal.
 *
 * @extends Animal Demuestra herencia simple en Java.
 */
class Perro extends Animal {

    /**
     * Muestra el sonido característico del perro.
     *
     * @implNote Comportamiento específico de la subclase.
     */
    public void hacerSonido() {
        out.println("Puedo ladrar");
    }
}

//---------------------------------------------
//  CLASE DE PRUEBA
//---------------------------------------------
/**
 * Clase para demostrar el funcionamiento de la jerarquía Animal-Perro.
 *
 * @example Muestra herencia y polimorfismo básico.
 */
class PruebaAnimal {

    /**
     * Método principal que ejecuta la demostración.
     *
     * @param args Argumentos de consola (no usados)
     */
    public static void main(String[] args) {
        out.println("*** Ejemplo de Herencia ***");

        //------------------------------
        //  Demostración clase base
        //------------------------------
        out.println("Clase Padre, soy un animal");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();

        //------------------------------
        //  Demostración subclase
        //------------------------------
        out.println("\nClase hija, soy un perro");
        var perro1 = new Perro();
        perro1.comer();    // Método heredado
        perro1.dormir();   // Método heredado
        perro1.hacerSonido(); // Método específico
    }
}
