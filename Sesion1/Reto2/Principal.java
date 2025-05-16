public class Principal {
    public static void main(String[] args) {
        // Usando la clase Entrada con constructor
        Entrada entrada1 = new Entrada("Obra de Teatro", 450.0);
        Entrada entrada2 = new Entrada("Concierto de Rock", 1200.5);

        entrada1.mostrarInformacion();
        entrada2.mostrarInformacion();

        // Usando el record Entrada_Record (reto adicional)
        Entrada_Record entradaRecord = new Entrada_Record("Festival de Jazz", 800.0);
        entradaRecord.mostrarInformacion();
    }
}
