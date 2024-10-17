package tema3;

public class T3Ejemplos {
    public static void main(String[] args) {

        System.out.print("Dime cómo te llamas: ");
        String nombre = System.console().readLine();

        System.out.print("Dime tu edad: ");
        String edadString = System.console().readLine();
        int edad = Integer.parseInt(edadString);

        System.out.println("Hola " + nombre + " tienes " + edad + "años , ¡encantado de conocerte!");
    }
}