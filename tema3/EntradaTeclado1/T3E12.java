package tema3.EntradaTeclado1;

import java.util.Locale;
import java.util.Scanner;

public class T3E12 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la nota del primer examen: ");
        double primero = sc.nextDouble();
        System.out.print("¿Qué nota quiere sacar en el trimestre? ");
        double deseada = sc.nextDouble();
        double necesita = (deseada - (primero * 0.4)) / 0.6;

        System.out.print("Para tener un " + deseada + " en el trimestre necesita sacar un ");
        System.out.printf("%.2f", necesita);
        System.out.print(" en el segundo examen.");

        sc.close();
    }
}
