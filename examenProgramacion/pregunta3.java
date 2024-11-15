import java.util.Scanner;

public class pregunta3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\033[1mVOLUMEN DE UN TOROIDE\033[0m");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Introduzca el radio mayor (cms): ");
        double radioMayor = sc.nextDouble();
        System.out.print("Introduzca el radio menor (cms): ");
        double radioMenor = sc.nextDouble();

        double volumen = 2 * (Math.PI * Math.PI) * radioMayor * (radioMenor * radioMenor);
        System.out.printf("El volumen del toroide es de \033[31m %.4f", volumen);
        System.out.print("\033[0m cm\u00B3.");

        sc.close();
    }
}