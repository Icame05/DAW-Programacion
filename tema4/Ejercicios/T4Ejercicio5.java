import java.util.Scanner;

public class T4Ejercicio5 {
    public static void main(String[] args) {
        // Constante de aceleración gravitacional en la Tierra (m/s^2)
        final double GRAVEDAD = 9.81;
        
        // Crear un escáner para obtener la altura desde el usuario
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cálculo del tiempo de caída de un objeto.");

        System.out.print("Introduce la altura (en metros) desde la que cae el objeto: ");
        double altura = scanner.nextDouble();
        
        // Cálculo del tiempo de caída usando la fórmula t = sqrt(2 * h / g)
        double tiempo = Math.sqrt((2 * altura) / GRAVEDAD);
        
        // Mostrar el resultado
        System.out.printf("El objeto tarda %.2f segundos.%n", tiempo);
        
        // Cerrar el escáner
        scanner.close();
    }
}