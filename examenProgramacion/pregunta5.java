import java.util.Scanner;

public class pregunta5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\033[1mCALCULADORA DE TIEMPO\033[0m");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Introduzca un cantidad de segundos: ");
        int segundosTotales = sc.nextInt();
        int horas = segundosTotales / (60 * 60);
        int minutos = (segundosTotales - (horas * 60 * 60)) / 60;
        int segundos = segundosTotales - (horas * 60 * 60) - (minutos * 60);

        System.out.print(segundosTotales + " segundos son \033[48;5;11m\033[1m" + horas + " horas\033[0m, \033[48;5;9m\033[38;5;15m" + minutos + " minutos\033[0m y \033[48;5;10m\033[1m" + segundos + " segundos\033[0m." );

        sc.close();
    }
}