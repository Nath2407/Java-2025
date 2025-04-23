import java.util.Scanner;

public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del medicamento: ");
        String medicamento = scanner.nextLine();

        System.out.print("Ingrese el precio unitario: ");
        double precioUnitario = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de piezas: ");
        int cantidad = scanner.nextInt();

        // Calcular total sin descuento
        var totalSinDescuento = precioUnitario * cantidad;

        // Verificar si aplica descuento (15% si total > 500)
        boolean aplicaDescuento = totalSinDescuento > 500;
        double descuento = aplicaDescuento ? totalSinDescuento * 0.15 : 0;
        double totalFinal = totalSinDescuento - descuento;

        // Mostrar resumen
        System.out.println("\nResumen de compra:");
        System.out.println("Medicamento: " + medicamento);
        System.out.println("Cantidad: " + cantidad);
        System.out.printf("Precio unitario: $%.2f\n", precioUnitario);
        System.out.printf("Total sin descuento: $%.2f\n", totalSinDescuento);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.printf("Descuento: $%.2f\n", descuento);
        System.out.printf("Total a pagar: $%.2f\n", totalFinal);

        scanner.close();
    }
}
