import java.util.Scanner;

public class T4Ejercicio3 {
    public static void main(String[] args) {
        // Constantes
        final int HORAS_REGULARES = 40;
        final double TARIFA_REGULAR = 12.0;
        final double TARIFA_EXTRA = 16.0;
        
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario el número de horas trabajadas
        System.out.print("Introduzca el número de horas trabajadas durante la semana: ");
        int horasTrabajadas = scanner.nextInt();
        
        double salario;

        // Calcular el salario en función de las horas trabajadas
        if (horasTrabajadas <= HORAS_REGULARES) {
            salario = horasTrabajadas * TARIFA_REGULAR;
        } else {
            // Calcular el pago regular para las primeras 40 horas
            salario = HORAS_REGULARES * TARIFA_REGULAR;
            // Agregar el pago extra para las horas adicionales
            salario += (horasTrabajadas - HORAS_REGULARES) * TARIFA_EXTRA;
        }
        
        // Mostrar el resultado
        System.out.printf("El sueldo semanal que le corresponde es de %.2f euros.%n", salario);
        
        // Cerrar el scanner
        scanner.close();
    }
}
