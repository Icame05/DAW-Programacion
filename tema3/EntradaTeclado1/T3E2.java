package tema3;

import java.util.Scanner;

public class T3E2 {
    public static void main(String[] args) {
        // Conversor de euros a pesetas
        // Constante que define el tipo de cambio
        final double TIPO = 166.386;

        // Definimos e inicializamos el escaner
        Scanner sc = new Scanner(System.in);
        //Leer por teclado una cantidad en euros
        System.out.print("Introduzca una cantidad en euros: ");
        double euros = sc.nextDouble();
        // Alternativa
        // double euros2 = Double.parseDouble(sc.nextLine());

        // Calculamos el valor en pesetas
        double pesetas = euros * TIPO;

        // Salida por pantalla
        System.out.println(euros + " euros son " + pesetas + " pesetas.");

        // Cerramos el Scanner
        sc.close();
    }
}
