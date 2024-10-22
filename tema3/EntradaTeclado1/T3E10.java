package tema3.EntradaTeclado1;

import java.util.Locale;
import java.util.Scanner;

public class T3E10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el número de Mb: ");
        double Mb = sc.nextDouble();
        double Kb = Mb * 1024;

        System.out.print(Mb + "Mb son " + Kb + "Kb.");

        sc.close();
    }
}
