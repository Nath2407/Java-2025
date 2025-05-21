import interfaces.GestorDialogo;
import interfaces.LogicaDecision;
import interfaces.TransicionHistoria;
import implementaciones.DecisionBinaria;
import implementaciones.DialogoTexto;
import implementaciones.TransicionSimple;

public class MainNarrativa {
    private final TransicionHistoria transicion;
    private final GestorDialogo dialogo;
    private final LogicaDecision decision;

    public MainNarrativa(TransicionHistoria transicion, GestorDialogo dialogo, LogicaDecision decision) {
        this.transicion = transicion;
        this.dialogo = dialogo;
        this.decision = decision;
    }

    public void ejecutarEscena() {
        dialogo.mostrarDialogo("Te encuentras en una aldea misteriosa...");
        String respuesta = decision.tomarDecision();

        if (respuesta.equals("si")) {
            dialogo.mostrarDialogo("El anciano te agradece y te entrega un mapa secreto.");
        } else if (respuesta.equals("no")) {
            dialogo.mostrarDialogo("El anciano se marcha triste. Has perdido una oportunidad.");
        } else {
            dialogo.mostrarDialogo("No entiendo tu decisión, el destino es incierto...");
        }

        transicion.siguienteEscena();
    }

    public static void main(String[] args) {
        MainNarrativa narrativa = new MainNarrativa(
            new TransicionSimple(),
            new DialogoTexto(),
            new DecisionBinaria()
        );
        narrativa.ejecutarEscena();
    }
}
