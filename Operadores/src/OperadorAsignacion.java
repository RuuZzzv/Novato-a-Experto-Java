public class OperadorAsignacion {

    public static void main(String[] args) {
        // Operador de Asignacion (=)
        var miNumero = 10;
        int miNumero2; //Declaracion
        miNumero2 = 5;
        
        //Asignacion Compuesto
        //+=
        miNumero += 5; // miNumero = miNumero + 5;
        System.out.println("miNumero: " + miNumero);
        
        //-=
        miNumero -= 5; // miNumero = miNumero - 5;
        System.out.println("miNumero: " + miNumero);
        
        //*=
        miNumero *= 5; // miNumero = miNumero * 5;
        System.out.println("miNumero: " + miNumero);
        
    }
}
