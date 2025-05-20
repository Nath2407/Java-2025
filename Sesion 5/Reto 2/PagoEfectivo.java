// Clase que representa un pago en efectivo
public class PagoEfectivo extends MetodoPago implements Autenticable {

    public PagoEfectivo(double monto) {
        super(monto);
    }

    // Autenticación siempre válida para efectivo
    @Override
    public boolean autenticar() {
        return true;
    }

    // Implementación del procesamiento de pago
    @Override
    public void procesarPago() {
        System.out.println("Procesando pago en efectivo por $" + monto);
    }
}
