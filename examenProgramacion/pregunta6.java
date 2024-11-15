import java.util.Scanner;

public class pregunta6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\033[1mTANGO MODAS\033[0m");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Introduce código de artículo: ");
        int codigo = sc.nextInt();
        System.out.print("Introduce precio: ");
        double precio = sc.nextDouble();
        System.out.print("Introduce unidades vendidas: ");
        int unidadesVendidas = sc.nextInt();
        System.out.print("Introduce descuento (%): ");
        int descuento = sc.nextInt();

        double precioUnidades = precio * unidadesVendidas;
        double descuentoPrecio = (10f / 100) * precioUnidades;
        double IVA = (16f / 100) * precioUnidades ;
        double precioTotal = precioUnidades - descuentoPrecio + IVA;

        System.out.println("");
        System.out.println("Su ticket:");
        System.out.println("");

        System.out.println("\033[1mTANGO MODAS\033[0m");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------");

        System.out.print(codigo);
        System.out.printf("          %.2f", precio);
        System.out.println("€");

        System.out.print(unidadesVendidas);
        System.out.printf(" unidades      %.2f", precioUnidades);
        System.out.println("€");

        System.out.print("-" + descuento + "%");
        System.out.printf("            -%.2f", descuentoPrecio);
        System.out.println("€");

        System.out.print("16%");
        System.out.printf(" IVA         +%.2f", IVA);
        System.out.println("€");

        System.out.print("\033[1m\033[48;5;245mTOTAL           ");
        System.out.printf("%.2f", precioTotal);
        System.out.println("€\033[0m");

        sc.close();
    }
}