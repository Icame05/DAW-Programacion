package tema4;

import java.util.Scanner;

public class T4OperadoresLogicos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un número del 1 al 100: ");
        int numero = sc.nextInt();

        if (numero >= 1 && numero <= 100) {
            System.out.println("El número esta dentro del rango");
        } else {
            System.out.println("El número esta fuera del rango");
        }
        
        sc.close();
    }
}
