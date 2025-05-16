// Clase Factura
import java.util.Objects;

public class Factura {
    private String folio;
    private String cliente;
    private double total;

    // Constructor con parámetros
    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    // Método toString()
    @Override
    public String toString() {
        return "🧾 Factura [folio=" + folio + ", cliente=" + cliente + ", total=$" + total + "]";
    }

    // Método equals(): solo compara el folio
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Factura)) return false;
        Factura factura = (Factura) o;
        return Objects.equals(folio, factura.folio);
    }

    // Método hashCode(): basado en folio
    @Override
    public int hashCode() {
        return Objects.hash(folio);
    }
}
