package tema2;

public class T2E6 {
    public static void main(String[] args) {
        double baseImponible = 100.0;
        double iva = 0.21;

        double total = baseImponible + (baseImponible * iva);

        System.out.printf("La base imponible es: %.2f\n", baseImponible);
        System.out.printf("El total de la factura (con IVA) es: %.2f\n",total);
    }
}
