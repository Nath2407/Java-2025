import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 1000.0;
        int opcion;

        do {
            System.out.println("\nBienvenido al cajero automático");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            while (!scanner.hasNextInt()) {
                System.out.println("❌ Opción inválida. Intente nuevamente.");
                scanner.next();
                System.out.print("Seleccione una opción: ");
            }

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.printf("✅ Su saldo actual es: $%.2f\n", saldo);
                    break;
                case 2:
                    System.out.print("Ingrese el monto a depositar: ");
                    double deposito = scanner.nextDouble();
                    if (deposito > 0) {
                        saldo += deposito;
                        System.out.printf("💰 Depósito exitoso. Nuevo saldo: $%.2f\n", saldo);
                    } else {
                        System.out.println("❌ El monto debe ser mayor a 0.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el monto a retirar: ");
                    double retiro = scanner.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("⚠️ Saldo insuficiente.");
                    } else if (retiro <= 0) {
                        System.out.println("❌ El monto debe ser mayor a 0.");
                    } else {
                        saldo -= retiro;
                        System.out.printf("💸 Retiro exitoso. Nuevo saldo: $%.2f\n", saldo);
                    }
                    break;
                case 4:
                    System.out.println("👋 Gracias por usar el cajero. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("❌ Opción inválida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 4);

        scanner.close();
    }
}
