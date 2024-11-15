import java.util.Scanner;

public class T4Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Indroduce una hora del día (0 - 23): ");
        int hora = sc.nextInt();

        if (hora >= 6 && hora <= 12 ) {
            System.out.println("Buenos días.");
        } else if (hora >= 13 && hora <= 19) {
            System.out.println("Buenas tardes.");
        } else if ((hora >= 0 && hora <= 5) && (hora >= 20 && hora <= 23)) {
            System.out.println("Buenas noches.");
        } else {
            System.out.println("Esa hora no existe.");
        }

        sc.close();
    }
}