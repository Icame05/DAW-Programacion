import java.util.Scanner;

public class T5E11 {
    public static void main(String[] args) {
        // Declaraciones
        int base = 0;
        int exponente = 0;
        int potencia = 1;
        Scanner sc = new Scanner(System.in);

        // Leemos base y exponente de teclado
        System.out.println("Introduce base: ");
        base = sc.nextInt();
        System.out.println("Introduce exponente: ");
        exponente = sc.nextInt();

        // Calculamos la potencia
        for (int i = 1; i <= exponente; i++) {
            potencia *= base;
        }

        System.out.println("La potencia con base " + base + " y exponente " + exponente + " es " + potencia);

        // Cerramos el Scanner
        sc.close();
    }
}