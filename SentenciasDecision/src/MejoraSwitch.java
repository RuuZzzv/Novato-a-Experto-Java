
import java.util.Scanner;

public class MejoraSwitch {

    public static void main(String[] args) {
        //Dia de la semana (1 -7)
        
        var semana = 1;

        System.out.println("Ingrese un número de la semana (1 - 7): ");
        semana = new Scanner(System.in).nextInt();

        switch (semana) {
            case 1 -> System.out.println("El día de la semana es: "
                        + "\n- Lunes");
            case 2 -> System.out.println("El día de la semana es: "
                        + "\n- Martes");
            case 3 -> System.out.println("El día de la semana es: "
                        + "\n- Miercoles");
            case 4 -> System.out.println("El día de la semana es: "
                        + "\n- Jueves");
            case 5 -> System.out.println("El día de la semana es: "
                        + "\n- Viernes");
            case 6 -> System.out.println("El día de la semana es: "
                        + "\n- Sabado");
            case 7 -> System.out.println("El día de la semana es: "
                        + "\n- Domingo");
            default -> System.out.println("No ingreso un valor correcto dentro de (1 - 7)"
                    + "\nValor Erroneo: "
                    + "\n- " + semana);
        }
    }

}
