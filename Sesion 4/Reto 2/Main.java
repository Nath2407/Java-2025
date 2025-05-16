public class Main {
    public static void main(String[] args) {
        // Crear declaración e imprimir
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("sdsvfsdv", 5200.0);
        System.out.println("📄 Declaración enviada por RFC: " + declaracion.rfcContribuyente() +
                " por $" + declaracion.montoDeclarado());

        // Crear cuenta e imprimir
        CuentaFiscal cuenta = new CuentaFiscal("<sfs<dv<s", 5200.0);
        System.out.println("🏦 Cuenta fiscal registrada con RFC: " + cuenta.getRfc() +
                ", saldo disponible: $" + cuenta.getSaldoDisponible());

        // Validar RFC
        boolean valido = cuenta.validarRFC(declaracion);
        System.out.println("✅ ¿RFC válido para esta cuenta?: " + valido);
    }
}
