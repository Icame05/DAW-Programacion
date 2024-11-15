import java.util.Scanner;

public class T4Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Este programa te dirá tu horóscopo.");

        // Entrada del mes
        System.out.print("Introduce el número del mes en que naciste (1-12): ");
        int mes = scanner.nextInt();

        // Entrada del día
        System.out.print("Ahora introduce el día: ");
        int dia = scanner.nextInt();

        // Variable para el horóscopo
        String horoscopo = "";

        // Determinación del horóscopo según el día y mes
        switch (mes) {
            case 1:
                horoscopo = (dia <= 19) ? "Capricornio" : "Acuario";
                break;
            case 2:
                horoscopo = (dia <= 18) ? "Acuario" : "Piscis";
                break;
            case 3:
                horoscopo = (dia <= 20) ? "Piscis" : "Aries";
                break;
            case 4:
                horoscopo = (dia <= 19) ? "Aries" : "Tauro";
                break;
            case 5:
                horoscopo = (dia <= 20) ? "Tauro" : "Géminis";
                break;
            case 6:
                horoscopo = (dia <= 20) ? "Géminis" : "Cáncer";
                break;
            case 7:
                horoscopo = (dia <= 22) ? "Cáncer" : "Leo";
                break;
            case 8:
                horoscopo = (dia <= 22) ? "Leo" : "Virgo";
                break;
            case 9:
                horoscopo = (dia <= 22) ? "Virgo" : "Libra";
                break;
            case 10:
                horoscopo = (dia <= 22) ? "Libra" : "Escorpio";
                break;
            case 11:
                horoscopo = (dia <= 21) ? "Escorpio" : "Sagitario";
                break;
            case 12:
                horoscopo = (dia <= 21) ? "Sagitario" : "Capricornio";
                break;
            default:
                horoscopo = "Mes inválido";
                break;
        }

        // Validar el día y mostrar el horóscopo
        if (mes >= 1 && mes <= 12 && dia > 0 && dia <= 31) {
            System.out.println("Su horóscopo es " + horoscopo);
        } else {
            System.out.println("Fecha inválida. Verifica el día y el mes ingresado.");
        }

        scanner.close();
    }
}
