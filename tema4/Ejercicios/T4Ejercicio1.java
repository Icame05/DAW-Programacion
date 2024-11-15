import java.util.Scanner;

public class T4Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un día de la semana y te diré qué asignatura toca a primera hora de ese día: ");
        String dia = scanner.nextLine().toLowerCase();

        // Definición de asignaturas según el día
        String asignatura;
        switch (dia) {
            case "lunes":
                asignatura = "PROGRAMACIÓN";
                break;
            case "martes":
                asignatura = "MATEMÁTICAS";
                break;
            case "miércoles":
                asignatura = "BASES DE DATOS";
                break;
            case "jueves":
                asignatura = "SISTEMAS";
                break;
            case "viernes":
                asignatura = "REDES";
                break;
            default:
                asignatura = "El día introducido no es correcto";
                break;
        }

        // Mostrar resultado
        System.out.println(asignatura);
        scanner.close();
    }
}
