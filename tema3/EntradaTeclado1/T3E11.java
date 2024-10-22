package tema3.EntradaTeclado1;

import java.util.Locale;
import java.util.Scanner;

public class T3E11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el número de Kb: ");
        double Kb = sc.nextDouble();
        double Mb = Kb / 1024;

        System.out.print(Kb + "Kb son " + Mb + "Mb.");

        sc.close();
    }
}
