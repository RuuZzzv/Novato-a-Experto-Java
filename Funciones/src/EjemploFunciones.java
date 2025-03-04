/**
 * La clase EjemploFunciones ejemplifica el uso de funciones (métodos) en Java.
 * Este ejemplo define una función estática llamada {@code saludar} que recibe un mensaje
 * y lo imprime en la consola con un prefijo. El método {@code main} invoca esta función
 * para demostrar su funcionamiento.
 */
public class EjemploFunciones {

    /**
     * Imprime un mensaje en la consola.
     * 
     * El método recibe un parámetro de tipo {@code String} que reprsesenta el mensaje a mostrar.
     * Se utiliza {@code System.out.println} para imprimir el mensaje, precedido del prefijo "Mensaje: ".
     * 
     *
     * @param mensaje El mensaje que se desea mostrar en la consola.
     */
    static void saludar(String mensaje) {
        System.out.println("Mensaje: " + mensaje);
    }
    
    
    /**
     * Método principal que inicia la ejecución del programa.
     * 
     * En este método se invoca a la función {@code saludar} pasando el mensaje "Hola".
     * 
     *
     * @param args Argumentos de la línea de comandos (no se utilizan en este programa).
     */
    public static void main(String[] args) {
        saludar("Hola");
    }
}