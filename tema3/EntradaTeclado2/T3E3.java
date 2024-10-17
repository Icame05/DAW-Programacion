package tema3.EntradaTeclado2;

import java.util.Locale;
import java.util.Scanner;

public class T3E3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        System.out.println("\033[1mCALCULADORA DE MEDIDAS IMPERIALES \033[0m");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Introduce una longuitud en metros: ");
        int metros = sc.nextInt();
        double pulgadas = metros * 39.3701;
        double pies = metros * 3.28084;
        double yardas = metros * 1.09361;
        System.out.println("\033[1m" + metros + " metros\033[0m son: ");
        System.out.printf("\033[48;5;11m%.3f", pulgadas);
        System.out.println(" pulgadas. \033[0m");
        System.out.printf("\033[48;5;10m%.3f", pies);
        System.out.println(" pies. \033[0m");
        System.out.printf("\033[48;5;9m%.4f", yardas);
        System.out.println(" yardas. \033[0m");

        sc.close();
    }
}