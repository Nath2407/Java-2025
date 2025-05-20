// Clase principal que simula la ejecución del sistema de pagos
public class CajaRegistradora {
    public static void main(String[] args) {
        // Creamos un arreglo con distintos tipos de pagos
        MetodoPago[] pagos = new MetodoPago[] {
            new PagoEfectivo(150.0),
            new PagoTarjeta(320.0, 500.0),
            new PagoTransferencia(200.0, false) // Este fallará
        };

        // Recorremos cada método de pago y lo procesamos
        for (MetodoPago pago : pagos) {
            if (pago instanceof Autenticable) {
                Autenticable metodo = (Autenticable) pago;
                if (metodo.autenticar()) {
                    System.out.println(" Autenticación exitosa.");
                    pago.procesarPago();
                    pago.mostrarResumen();
                } else {
                    System.out.println(" Fallo de autenticación. " + pago.getClass().getSimpleName() + " no válido.");
                }
                System.out.println(); // Espacio entre bloques de salida
            }
        }
    }
}
