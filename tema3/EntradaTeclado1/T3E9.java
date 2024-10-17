package tema3;

import java.util.Locale;
import java.util.Scanner;

public class T3E9 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        System.out.println("Volumen de un cono");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Introduzca la altura (cm): ");
        double altura = sc.nextDouble();
        System.out.print("Introduzca el radio de la base (cm): ");
        double radio = sc.nextDouble();
        double volumen = (1d/3d) * Math.PI * radio * radio * altura;
        System.out.println("El volumen del cono es de " + volumen);

        sc.close();
    }
}
