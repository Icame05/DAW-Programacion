package tema3;

import java.util.Scanner;

public class T3E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el primer número a multiplicar: ");
        int numero1 = sc.nextInt();

        System.out.print("Introduzca el segundo número a multiplicar: ");
        int numero2 = sc.nextInt();

        int total = numero1 * numero2;

        System.out.println(numero1 + " * " + numero2 + " = " + total);

        sc.close();
    }
}