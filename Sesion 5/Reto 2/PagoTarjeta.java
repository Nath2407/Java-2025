// Clase que representa un pago con tarjeta bancaria
public class PagoTarjeta extends MetodoPago implements Autenticable {
    private double saldoDisponible; // Simula el saldo disponible de la tarjeta

    public PagoTarjeta(double monto, double saldoDisponible) {
        super(monto);
        this.saldoDisponible = saldoDisponible;
    }

    // Verifica si el saldo es suficiente
    @Override
    public boolean autenticar() {
        return monto <= saldoDisponible;
    }

    // Procesa el pago si fue autenticado
    @Override
    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta por $" + monto);
    }
}
