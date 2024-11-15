import java.util.Scanner;

public class pregunta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\033[1mVUELTAS DE LA TIERRA\033[0m");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Introduzca un número de años: ");
        int años = sc.nextInt();

        int vueltas = años * 365;
        System.out.print("La tierra habrá dado un total de " + vueltas + " en " + años + " años." );

        sc.close();
    }
}