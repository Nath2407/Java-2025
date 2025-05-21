import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class AnalizadorDeLogs {
    public static void main(String[] args) {
        String archivoLog = "errores.log";
        int totalLineas = 0;
        int totalErrores = 0;
        int totalWarnings = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(archivoLog))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                totalLineas++;
                if (linea.contains("ERROR")) {
                    totalErrores++;
                }
                if (linea.contains("WARNING")) {
                    totalWarnings++;
                }
            }

            // Calcular porcentaje
            int totalEventos = totalErrores + totalWarnings;
            double porcentajeEventos = (totalLineas == 0) ? 0 : ((double) totalEventos / totalLineas) * 100;
            DecimalFormat df = new DecimalFormat("#.##");

            // Mostrar resumen
            System.out.println("Resumen del análisis:");
            System.out.println("Total de líneas leídas: " + totalLineas);
            System.out.println("Cantidad de errores: " + totalErrores);
            System.out.println("Cantidad de advertencias: " + totalWarnings);
            System.out.println("Porcentaje de líneas con errores/advertencias: " + df.format(porcentajeEventos) + "%");

        } catch (IOException e) {
            // Guardar mensaje de error en archivo
            try (BufferedWriter bw = new BufferedWriter(new FileWriter("registro_fallos.txt"))) {
                bw.write("Ocurrió un error al leer el archivo: " + e.getMessage());
                System.out.println("Error al procesar el archivo. Mensaje registrado en 'registro_fallos.txt'.");
            } catch (IOException ex) {
                System.out.println(" No se pudo escribir en registro_fallos.txt: " + ex.getMessage());
            }
        }
    }
}
