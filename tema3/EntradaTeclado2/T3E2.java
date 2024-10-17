package tema3.EntradaTeclado2;

import java.util.Locale;
import java.util.Scanner;

public class T3E2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        System.out.println("\033[1mVOLUMEN DE UNA ESFERA");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Introduzca el radio de la esfera (cms): ");
        double radio = sc.nextDouble();
        double volumen = (4/3) * Math.PI * (radio * radio * radio);
        System.out.printf("El volumen del toroide es de \033[38;5;9m %.4f", volumen);
        System.out.println("\033[0m cm\u00B3.");

        sc.close();
    }
}
