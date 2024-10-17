package tema3;

import java.util.Locale;
import java.util.Scanner;

public class T3E4 {
    public static void main(String[] args) {
        // Definimos el Locale
        Locale.setDefault(Locale.ENGLISH);

        // Bienvenida
        System.out.println("Este programa realiza las 4 operaciones básicsa de dos números decimales");

        // Abrimos Scanner
        Scanner sc = new Scanner(System.in);

        // Lee el primer número
        System.out.print("Introduzca el primer número: ");
        double numero1 = sc.nextDouble();

        // Lee el segundo número
        System.out.print("Introduzca el segundo número: ");
        double numero2 = sc.nextDouble();

        // Almacenamos ca resultado en una variable
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double producto = numero1 * numero2;
        double cociente = numero1 / numero2;

        // Generamos salida por pantalla
        System.out.println("x = " + numero1);
        System.out.println("y = " + numero2);
        System.out.println("x + y = " + suma);
        System.out.println("x - y = " + resta);
        System.out.println("x * y = " + producto);
        System.out.println("x / y = " + cociente);

        // Cerramos Scanner
        sc.close();
    }
}
