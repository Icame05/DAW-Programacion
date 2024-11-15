import java.util.Scanner;

public class T5E9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        final int primero = 0;
        final int segundo = 1;
        int ultimo = 0;
        int penultimo = 1;
        int aux = 0;
        try {
            // Lee número de teclado
            System.out.println("\033[1m;N PRIMEROS NÚMEROS DE LA SERIE FIBONACCI\033[0m");
            System.out.print("Introduzca un número: ");
            numero = sc.nextInt();

            // Calcula la serie Fibonacci
            if (numero == 0) {
                System.out.println(primero);
            } else if (numero == 1) {
                System.out.println(primero + " " + segundo);
            } else {
                System.out.print(primero + " " + segundo);
                while (numero > 2) {
                    aux = ultimo + penultimo;
                    penultimo = ultimo = aux;
                    ultimo = aux;
                    System.out.print(" " + ultimo);

                    numero--;
                }
            }

        } catch (Exception e) {
            System.out.printf("ERROR: Se debe introducir un valor númerico.");
        } finally {
            sc.close();
        }
    }
}