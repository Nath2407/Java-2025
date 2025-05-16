public class Vuelo {
    // Atributos
    String origen;
    String destino;

    // Constructor
    public Vuelo(String origen, String destino) {
        this.origen = origen;
        this.destino = destino;
    }

    // Método para mostrar información del vuelo
    public void mostrarInformacion() {
        System.out.println("Vuelo de " + origen + " a " + destino);
    }

    public static void main(String[] args) {
        // Crear un objeto Vuelo
        Vuelo vuelo1 = new Vuelo("Ciudad de México", "Buenos Aires");
        vuelo1.mostrarInformacion();
    }
}
