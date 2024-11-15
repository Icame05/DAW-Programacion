import java.util.Scanner;

public class T5E8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        try {
            // Lee número de teclado
            System.err.print("Introduzca un número: ");
            numero = sc.nextInt();
            // Pinta la cabecera de la tabla
            System.out.println("   n   |   n2   |   n3   ");
            System.out.println("---------------------------");
            // Calcula y pinta la potencia de los números
            for (int i = 1; i <= 5; i++) {
                System.out.printf("   %-4d|   %-5d|   %-4d\n", numero, numero*numero, numero*numero*numero);
                numero++;
            }

        } catch (Exception e) {
            System.out.printf("ERROR: Se debe introducir un valor númerico.");
        } finally {
            sc.close();
        }
    }
}
