package implementaciones;

import interfaces.LogicaDecision;
import java.util.Scanner;

public class DecisionBinaria implements LogicaDecision {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public String tomarDecision() {
        System.out.println("¿Quieres ayudar al viejito? (si/no): ");
        String respuesta = scanner.nextLine().trim().toLowerCase();
        return respuesta;
    }
}
