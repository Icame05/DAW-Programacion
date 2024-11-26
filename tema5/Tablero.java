import java.util.Scanner;
public class Tablero {
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

            System.out.print("Introduzca la altura del tablero: ");
            int altura = sc.nextInt();
            System.out.print("Introduzca ahora el ancho: ");
            int ancho = sc.nextInt();
            sc.close();
            int repeat = altura;
            

            while (repeat > 0) {
                for (int i = ancho; i > 0 ; i--){
                    System.out.print(" ---");
                }
                System.out.println();
                for (int i = ancho + 1; i > 0 ; i--){
                    System.out.print("|   ");
                }
                System.out.println();
                repeat--;
            }
            for (int i = ancho; i > 0 ; i--){
                System.out.print(" ---");
            }
        }
}