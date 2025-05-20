// Clase que representa un pago mediante transferencia bancaria
public class PagoTransferencia extends MetodoPago implements Autenticable {
    private boolean validacionExterna; // Resultado de una validación externa (simulada)

    public PagoTransferencia(double monto, boolean validacionExterna) {
        super(monto);
        this.validacionExterna = validacionExterna;
    }

    // Devuelve el resultado de la validación externa
    @Override
    public boolean autenticar() {
        return validacionExterna;
    }

    // Procesa el pago si fue autenticado
    @Override
    public void procesarPago() {
        System.out.println("Procesando transferencia bancaria por $" + monto);
    }
}
