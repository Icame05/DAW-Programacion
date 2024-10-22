package tema3.EntradaTeclado1;

import java.util.Locale;
import java.util.Scanner;

public class T3E7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la base imponible (precio del artículo sin IVA): ");
        double articulo = sc.nextDouble();
        double IVA = articulo * 21 / 100;

        System.out.println("Base imponible: " + articulo + " euros");
        System.out.printf("IVA (21%%): %.2f", IVA);
        System.out.println(" euros");

        double total = articulo + IVA;
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("Total: %.2f", total);
        System.out.println(" euros");

        sc.close();
    }
}
