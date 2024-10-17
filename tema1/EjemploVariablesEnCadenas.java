package tema1;
public class EjemploVariablesEnCadenas {
    public static void main(String args[]) {
        String nombre = "Iván";
        int edad = 19;
        int meses = 11;
        // Ejemplo usando printf sin necesidad de concatenar
        System.out.printf("\tMe llamo %s, \"tengo\" %d años y %d meses.\n", nombre, edad, meses);

        // Ejemplo usando println y concatenación de cadenas de caracteres
        System.out.println("Me llamo " + nombre + ", \"tengo\" " + edad + " años y " + meses + " meses.");

    }
}