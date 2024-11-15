import java.util.Scanner;

public class T4Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int puntaje = 0; // Inicializa el puntaje en 0

        System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
        System.out.print("( V ) erdadero o ( F ) also: ");
        String a = sc.nextLine();
        char respA = a.charAt(0);
        if (respA == 'V' || respA == 'v') puntaje+=3;

        System.out.println("Ha aumentado sus gastos de vestuario.");
        System.out.print("( V ) erdadero o ( F ) also: ");
        String b = sc.nextLine();
        char respB = b.charAt(0);
        if (respB == 'V' || respB == 'v') puntaje+=3;

        System.out.println("Ha perdido el interés que mostraba anteriormente en ti.");
        System.out.print("( V ) erdadero o ( F ) also: ");
        String c = sc.nextLine();
        char respC = c.charAt(0);
        if (respC == 'V' || respC == 'v') puntaje+=3;

        System.out.println("Ahora se afeita y asea con más frecuencia (si es hombre) o ahora se arregla el pelo y asea con más frecuencia (si es mujer).");
        System.out.print("( V ) erdadero o ( F ) also: ");
        String d = sc.nextLine();
        char respD = d.charAt(0);
        if (respD == 'V' || respD == 'v') puntaje+=3;

        System.out.println("No te deja que mires la agenda de su teléfono móvil.");
        System.out.print("( V ) erdadero o ( F ) also: ");
        String e = sc.nextLine();
        char respE = e.charAt(0);
        if (respE == 'V' || respE == 'v') puntaje+=3;

        System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
        System.out.print("( V ) erdadero o ( F ) also: ");
        String f = sc.nextLine();
        char respF = f.charAt(0);
        if (respF == 'V' || respF == 'v') puntaje+=3;

        System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
        System.out.print("( V ) erdadero o ( F ) also: ");
        String g = sc.nextLine();
        char respG = g.charAt(0);
        if (respG == 'V' || respG == 'v') puntaje+=3;

        System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
        System.out.print("( V ) erdadero o ( F ) also: ");
        String h = sc.nextLine();
        char respH = h.charAt(0);
        if (respH == 'V' || respH == 'v') puntaje+=3;

        System.out.println("Has notado que últimamente se perfuma más.");
        System.out.print("( V ) erdadero o ( F ) also: ");
        String i = sc.nextLine();
        char respI = i.charAt(0);
        if (respI == 'V' || respI == 'v') puntaje+=3;

        System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
        System.out.print("( V ) erdadero o ( F ) also: ");
        String j = sc.nextLine();
        char respJ = j.charAt(0);
        if (respJ == 'V' || respJ == 'v') puntaje+=3;

        sc.close();

        // Muestra el puntaje final

        if (puntaje >= 0 && puntaje < 10) {
            System.out.println("¡Enhorabuena! Tu pareja parece ser totalmente fiel.");
        } else if (puntaje > 11 && puntaje < 22) {
            System.out.println("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
        } else {
            System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.");
        }

        System.out.println("Puntaje total: " + puntaje);
    }
}
