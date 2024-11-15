import java.util.Scanner;

public class T5E7 {
    public static void main(String[] args) {
        int numero = 0;
        int valor = 0;
        float contador = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Este programa calcula la media de los números positivos introducidos.");
        System.out.println("Para parar, introduzca un número negativo.");
        System.out.println("Vaya introduciendo números.");

        do {
            try {
                numero = sc.nextInt();
                if (numero >= 0) {
                    valor += numero;
                    contador++;
                }
            } catch (Exception e) {
                System.out.println("ERROR: Solo valen valores númericos. Inténtelo de nuevo.");
                sc.nextLine();
            }
        } while (numero >= 0);

        float media = valor / contador;
        System.out.println("La media de los números introducidos es " + media);

        sc.close();
    }
}