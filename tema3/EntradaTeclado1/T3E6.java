package tema3.EntradaTeclado1;

import java.util.Locale;
import java.util.Scanner;

public class T3E6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        System.out.println("Área de un triángulo");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Introduzca la longuitud de la base (cm): ");
        double base = sc.nextDouble();
        System.out.print("Introduzca la altura (cm): ");
        double altura = sc.nextDouble();
        double area = (base * altura) / 2;
        System.out.printf("El área de un triángulo es %.2f", area);

        sc.close();
    }
}
