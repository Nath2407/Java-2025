// Clase base abstracta para todos los métodos de pago
public abstract class MetodoPago {
    protected double monto; // Monto del pago

    public MetodoPago(double monto) {
        this.monto = monto;
    }

    // Método abstracto que cada subclase debe implementar
    public abstract void procesarPago();

    // Método concreto que muestra un resumen del pago
    public void mostrarResumen() {
        System.out.println("📄 Tipo: " + this.getClass().getSimpleName() + " - Monto: $" + monto);
    }
}
