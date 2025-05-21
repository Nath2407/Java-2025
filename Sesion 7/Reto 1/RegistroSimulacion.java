import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion {

    public static void main(String[] args) {
        // Definir la ruta de la carpeta y del archivo
        Path carpetaConfig = Paths.get("config");
        Path archivoParametros = carpetaConfig.resolve("parametros.txt");

        try {
            // Crear la carpeta config/ si no existe
            if (!Files.exists(carpetaConfig)) {
                Files.createDirectories(carpetaConfig);
                System.out.println("📁 Carpeta 'config/' creada.");
            }

            // Crear el contenido de los parámetros
            String parametros = """
                Tiempo de ciclo: 55.8 segundos
                Velocidad de línea: 1.2 m/s
                Número de estaciones: 8
                """;

            // Escribir los parámetros en el archivo
            Files.writeString(archivoParametros, parametros);
            System.out.println("✍️ Parámetros escritos en el archivo.");

            // Validar que el archivo fue creado correctamente
            if (Files.exists(archivoParametros)) {
                System.out.println("✅ Archivo creado exitosamente: " + archivoParametros.toString());

                // Leer y mostrar el contenido del archivo
                String contenido = Files.readString(archivoParametros);
                System.out.println("📄 Contenido del archivo:");
                System.out.println(contenido);
            } else {
                System.out.println("❌ No se pudo crear el archivo.");
            }

        } catch (IOException e) {
            System.err.println("❗ Error al procesar el archivo: " + e.getMessage());
        }
    }
}
