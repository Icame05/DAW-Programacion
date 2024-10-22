package tema3.EntradaTeclado1;

import java.util.Locale;
import java.util.Scanner;

public class T3E8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el número de horas trabajadas durante la semana: ");
        int horas = sc.nextInt();
        int pago = horas * 12;

        System.out.print("Su salario semanal es de : " + pago + " euros.");

        sc.close();
    }
}
