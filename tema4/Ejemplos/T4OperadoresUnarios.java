package tema4;

public class T4OperadoresUnarios {
    public static void main(String[] args) {
        int numero = 100;

        int incrementoSufijo = numero++;
        System.out.println(incrementoSufijo);

        int incrementoPrefijo = --numero;
        System.out.println(incrementoPrefijo);
    }
}
