import java.util.Scanner;

public class T4Ejercicio7 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar las tres notas al usuario
        System.out.print("Introduzca la primera nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("Ahora introduzca la segunda nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.print("Por último introduzca la tercera nota: ");
        double nota3 = scanner.nextDouble();
        
        // Calcular la media de las tres notas
        double media = (nota1 + nota2 + nota3) / 3;
        
        // Determinar la nota del boletín según la media
        String boletin;
        if (media < 5) {
            boletin = "Insuficiente";
        } else if (media < 6) {
            boletin = "Suficiente";
        } else if (media < 7) {
            boletin = "Bien";
        } else if (media < 9) {
            boletin = "Notable";
        } else {
            boletin = "Sobresaliente";
        }
        
        // Mostrar la media y la nota del boletín
        System.out.printf("La media es de %.2f%n", media);
        System.out.println("La nota del boletín es: " + boletin);
        
        // Cerrar el scanner
        scanner.close();
    }
}
