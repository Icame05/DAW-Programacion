import java.util.Scanner;

public class T5E12 {
    public static void main(String[] args) {
        // Declaraciones
        int base = 0;
        int exponenteMinimo = 0;
        int exponenteMaximo = 0;
        int potencia = 1;
        Scanner sc = new Scanner(System.in);

        // Leemos base y exponente de teclado
        System.out.println("Introduce base: ");
        base = sc.nextInt();
        System.out.println("Introduce exponente: ");
        exponenteMaximo = sc.nextInt();

        // Calculamos la potencia
        for (int i = 1; i <= exponenteMaximo; i++) {
            exponenteMinimo++;
            potencia *= base;
            System.out.println(base + " ^ " + exponenteMinimo + " = " + potencia);
        }

        // Cerramos el Scanner
        sc.close();
    }
}