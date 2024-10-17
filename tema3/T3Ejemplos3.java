package tema3;

import java.util.Scanner;

public class T3Ejemplos3 {
    public static void main(String[] args) {
        String linea = "";
        String adios = "Adios";
        Scanner entrada = new Scanner(System.in);
        while (!adios.equals(linea)) {
            // Introducimos la cadena
            System.out.println("Introduzca una cadena de caracteres: ");
            linea = entrada.nextLine();
        }

        // Imprime la línea por pantalla
        System.out.println("La cadena introducida es " + linea);

        entrada.close();
    }
}
