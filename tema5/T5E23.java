import java.util.Scanner;

public class T5E23 {
    public static void main(String[] args) {
        // Declaraciones
        int numero = 0;
        int digito = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        
        // Lee de teclado el número
        while (numero == 0) {
            try {
                System.out.print("Introduzca un numero entero: ");
                numero = sc.nextInt();
            } catch (Exception e) {
                System.out.println("ERROR: Se debe introducir un número entero");
                sc.nextLine();
            }
        }
        
        

        // Lee de teclado el dígito
        while (numero/10 != 0) {
            try {
                System.out.print("Introduzca un dígito: ");
                digito = sc.nextInt();
                if (digito / 10 != 0) {
                    System.out.println("ERROR: Se debe introducir un dígito (una sola cifra)");
                }
            } catch (Exception e) {
                System.out.println("ERROR: Se debe introducir un dígito existente");
                sc.nextLine();
            }
        }

        // Invertimos el número para obtener el resultado en la posición correcta
        int numeroInvertido = 0;            // Variable para almacenar el número invertido
        int numeroOriginal = numero;        // Variable para almacenar el número original
        numero = Math.abs(numero);
        while (numero / 10 != 0) {
            numeroInvertido = (numeroInvertido * 10) + (numero % 10);
            numero = numero / 10;
        }
        numeroInvertido = (numeroInvertido * 10) + numero;

        // Dividimos progresivamente entre 10 hasta quedarnos sin número
        int i = 0;
        String posicionesCoincidentes = "";
        while (numeroInvertido / 10 != 0) {
            int digitoActual = numeroInvertido % 10;
            numeroInvertido = numeroInvertido / 10;
            i++;
            if (digitoActual == digito) {
                posicionesCoincidentes += i + " ";
            }
        }
        if (numeroInvertido == digito) {
            posicionesCoincidentes += i;
        }

        System.out.println("Contando de izquierda a derecha, el " + digito + " aparece dentro de " + numeroOriginal + " en las siguientes posiciones: " + posicionesCoincidentes);

        sc.close();
    }
}