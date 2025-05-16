public class Calculadora {

    // Método que suma dos números y devuelve el resultado
    public int sumar(int a, int b) {
        return a + b;
    }

    // Método que imprime un mensaje (sin retorno)
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int resultado = calc.sumar(5, 7);
        calc.mostrarMensaje("El resultado es: " + resultado);
    }
}
