package tema4;

import java.util.Scanner;

public class T4OperadorTernario {
    public static void main(String[] args) {
        String edadIf = "";
        String edadTernario = "";

        Scanner sc = new Scanner(System.in);
        int edadNumerica = sc.nextInt();

        if (edadNumerica >= 18) {
            edadIf = "El usuario es mayor de edad";
        } else {edadIf = "El usuario es menor de edad";}

        // Operador terneario
        edadTernario = (edadNumerica >= 18) ? "El usuario es mayor de edad" :
                                    "El usuario es menor de edad";
        System.out.println(edadTernario);
        sc.close();
    }
}