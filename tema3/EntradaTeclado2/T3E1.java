package tema3.EntradaTeclado2;

import java.util.Locale;
import java.util.Scanner;

public class T3E1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        System.out.println("\033[1mSEGUNDOS QUE TIENE UN DÍA");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Introduzca un número de días: ");
        double dias = sc.nextDouble();
        double segundos = (dias * 24) * 60 * 60;
        System.out.println(dias + " días equivalen a " + segundos + " segundos.");

        sc.close();
    }
}
