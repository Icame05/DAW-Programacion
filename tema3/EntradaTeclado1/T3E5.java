package tema3.EntradaTeclado1;

import java.util.Locale;
import java.util.Scanner;

public class T3E5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        System.out.println("Área de un rectángulo");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Introduzca la longuitud de la base (cm): ");
        double longuitud = sc.nextDouble();
        System.out.print("Introduzca la altura (cm): ");
        double altura = sc.nextDouble();
        double area = longuitud * altura;
        System.out.printf("El área de un rectángulo es %.2f", area);
        sc.close();
    }
}
