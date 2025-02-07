
import java.util.Scanner;

public class EjercicioPropuesto {
    
    public static void main(String[] args) {
        //Realizar un programa que calcule el area de  un rectangulo
        // formula: area = base * altura
        
        //variables
        var consola = new Scanner(System.in);
        String entradaBase, entradaAltura;
        int altura, base, areaRectangulo, perimetroRectangulo;
        
        //Recoleccion de datos
        System.out.println("Ingrese la altura del rectangulo: ");
        entradaAltura = consola.nextLine();
        
        System.out.println("Ingrese la base del rectangulo: ");
        entradaBase = consola.nextLine();
        
        //Conversion de cadena a entero
        altura = Integer.parseInt(entradaAltura);
        base = Integer.parseInt(entradaBase);
        
        //Calculo con formula del area
        areaRectangulo = base * altura;
        
        //Resultado del Area
        System.out.println("Area del rectangulo: " + areaRectangulo);
        
        //Calculo con formula del perimetro
        perimetroRectangulo = (base + altura) * 2;
        
        //Resultado del Area
        System.out.println("Perimetro del rectangulo: " + perimetroRectangulo);
    }
    
}
