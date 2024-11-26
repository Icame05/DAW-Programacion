import java.util.Scanner;

public class T5E28 {
    public static void main(String[] args) {
        // Declaraciones
        int numero = 0;
        int altura = 0;
        Scanner sc = new Scanner(System.in);

        // Lee de teclado el número
        while (numero == 0) {
            try {
                System.out.print("Introduzca la altura de la L: ");
                numero = sc.nextInt();
            } catch (Exception e) {
                System.out.println("ERROR: Se debe introducir un número entero");
                sc.nextLine();
            }
        }

        // Largo de la L
        int ancho = (numero / 2) + 1;

        // Creamos el palo horizontal
        String paloHorizontal = "*";
        for (int i = 0; i < ancho; i++) {
            String relleno = "*";
        }

        // Pintamos el palo vertical
        for (int i = 0; i < numero - 1; i++) {
            System.out.println("*");
        }

        // Pintamos el palo horizontal
        for (int i = 0; i < ancho; i++) {
            System.out.print("* ");
        }

        sc.close();
    }
}
