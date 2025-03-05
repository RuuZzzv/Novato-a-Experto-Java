package animales;

import static java.lang.System.out;

/**
 * Clase base que representa un animal genérico.
 * Demuestra conceptos de herencia y polimorfismo en POO.
 */
public class Animal {
    
    /**
     * Método que muestra el sonido genérico de un animal.
     * @implNote Será sobrescrito por las subclases (polimorfismo).
     */
    public void hacerSonido() {
        out.println("El animal hace un sonido");
    }
}

//---------------------------------------------
//  JERARQUÍA DE ANIMALES (HERENCIA)
//---------------------------------------------

/**
 * Clase que representa un perro, heredando comportamiento básico de Animal.
 * @extends Animal Demuestra sobrescritura de métodos.
 */
class Perro extends Animal {

    /**
     * Sobreescribe el método hacerSonido() de la clase padre.
     * @implNote Implementación específica para perros.
     */
    @Override
    public void hacerSonido() {
        out.println("El perro hace wau");
    }
    
    /* Ejemplo de método comentado:
    @Override
    public void dormir(){
        System.out.println("Duermo 15 horas al día");
        super.dormir(); // Llama a la versión del padre
    }
    */
}

/**
 * Clase que representa un gato, heredando comportamiento básico de Animal.
 * @extends Animal Demuestra polimorfismo con implementación específica.
 */
class Gato extends Animal {
    
    /**
     * Sobreescribe el método hacerSonido() de la clase padre.
     * @implNote Implementación específica para gatos.
     */
    @Override
    public void hacerSonido() {
        out.println("El Gato hace miau");
    }
}

//---------------------------------------------
//  CLASE DE PRUEBA (POLIMORFISMO)
//---------------------------------------------

/**
 * Clase para demostrar polimorfismo y herencia.
 * @example Muestra cómo un objeto puede tomar múltiples formas.
 */
class PruebaAnimal {

    /**
     * Método principal que ejecuta la demostración.
     * @param args Argumentos de consola (no usados)
     */
    public static void main(String[] args) {
        out.println("*** Ejemplo de Polimorfismo ***");
        
        // Polimorfismo: variable de tipo Animal que referencia un Gato
        Animal miMascota = new Gato();
        miMascota.hacerSonido(); // Ejecuta la versión de Gato
        
        /* Ejemplo de herencia comentado:
        out.println("\n*** Ejemplo de Herencia ***");
        Perro miPerro = new Perro();
        miPerro.hacerSonido();
        */
    }
}