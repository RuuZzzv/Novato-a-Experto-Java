// Paquete al que pertenece la clase
package persona;

// Importación estática para simplificar el uso de System.out
import static java.lang.System.out;

/**
 * Clase que representa una entidad persona con nombre y apellido.
 * Demuestra conceptos básicos de POO como encapsulamiento y métodos accesores.
 */
public class Persona{

    //---------------------------------------------
    //  ATRIBUTOS (Encapsulados)
    //---------------------------------------------
    /** Almacena el nombre de la persona (acceso privado) */
    private String primerNombre;
    /** Almacena el apellido paterno (acceso privado) */
    private String apellidoPaterno;

    //---------------------------------------------
    //  CONSTRUCTOR
    //---------------------------------------------
    
    /**
     * Constructor parametrizado para inicializar todos los atributos
     * @param primerNombre Nombre inicial de la persona
     * @param apellidoPaterno Apellido inicial de la persona
     */
    public Persona(String primerNombre, String apellidoPaterno) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
    }

    //---------------------------------------------
    //  MÉTODOS ACCESORES (Getters/Setters)
    //---------------------------------------------
    
    /** 
     * @return Nombre actual de la persona 
     */
    public String getPrimerNombre() {
        return this.primerNombre;
    }

    /** 
     * @return Apellido actual de la persona 
     */
    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }

    /**
     * Establece un nuevo nombre
     * @param primerNombre Nuevo valor para el nombre
     */
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    /**
     * Establece un nuevo apellido
     * @param apellidoPaterno Nuevo valor para el apellido
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    //---------------------------------------------
    //  MÉTODOS DE COMPORTAMIENTO
    //---------------------------------------------
    
    /**
     * Muestra en consola los detalles de la persona
     * @implNote Formato de salida:
     * Nombre: [valor]
     * Apellido: [valor] 
     */
    
    @Override
    public String toString(){
        return "Nombre: " + this.primerNombre 
                + ", Apellido: " + this.apellidoPaterno
                + ", Dir, Mem: " + super.toString();
    }
    
    public void mostraPersona() {
        out.println("Nombre: " + this.primerNombre);
        out.println("Apellido: " + this.apellidoPaterno);
    }
}