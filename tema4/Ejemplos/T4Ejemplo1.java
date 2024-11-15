package tema4;

import java.util.Scanner;

public class T4Ejemplo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contador = 0;
        int suma = 0;
        int numero = sc.nextInt();

        while (numero >= 0) {
            contador++;
            suma = suma + numero;
            numero = sc.nextInt();
        }

        System.out.println("Se han introducido " + contador + " números en total y la suma de todos ellos es " + suma + ".");

        sc.close();
    }
}