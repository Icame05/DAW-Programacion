public class T6Ejemplo1 {
    public static void main(String[] args) {
        // Números entre [0, 1) con decimales
        for (int i = 1; i < 11; i++) { System.out.println(Math.random());}

        // Números entre [0, 1) con decimales
        for (int i = 1; i < 11; i++) { System.out.println(Math.random() * 10);}

        // Números entre [0, 10) enteros
        for (int i = 1; i < 11; i++) { System.out.println((int) (Math.random() * 10));}

        // Números entre [1, 10] enteros
        for (int i = 1; i < 11; i++) { System.out.println((int) (Math.random() * 10) + 1);}

        // Supongamos que necesitamos [3, 7)
        System.out.println((int) ((Math.random() *4) + 3));
    }
}
