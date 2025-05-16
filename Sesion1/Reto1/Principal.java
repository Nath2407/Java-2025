import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear objeto de tipo Paciente
        Paciente paciente = new Paciente();

        // Solicitar datos al usuario
        System.out.print("Ingresa el nombre del paciente: ");
        paciente.nombre = scanner.nextLine();

        System.out.print("Ingresa la edad del paciente: ");
        paciente.edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        System.out.print("Ingresa el número de expediente: ");
        paciente.expediente = scanner.nextLine();

        // Mostrar la información del paciente
        System.out.println("\nInformación del paciente:");
        paciente.mostrarInformacion();

        scanner.close();
    }
}
