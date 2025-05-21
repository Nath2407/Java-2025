package implementaciones;

import interfaces.GestorDialogo;

public class DialogoTexto implements GestorDialogo {
    @Override
    public void mostrarDialogo(String mensaje) {
        System.out.println("🗣️ Diálogo: " + mensaje);
    }
}
