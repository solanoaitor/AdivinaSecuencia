package vista;

public class MostrarJuego {
    public MostrarJuego() {}

    public void instrucciones() {
        System.out.println("-------------------------");
        System.out.println("Juego Adivina Secuecia");
        System.out.println("-------------------------");
        System.out.println("Instrucciones:");
        System.out.println("                Bolas Blancas, indican bolas correctas en una posición correcta");
        System.out.println("                Bolas Negras, indican bolas correctas en una posición incorrecta");
        System.out.println("Jugar --> Enter");
        System.out.println("Salir --> 0 y después Enter");
        System.out.println("--------------------------");
    }

    public void muestraResultado(String intentos[][]) {

    }

    public void introducirNumero() {
        System.out.println("");
        System.out.print("Intento:  \t");
    }

    public void ganar() {
        System.out.println("");
        System.out.println("Has ganado!");
        System.out.println("Aprieta enter para continuar");
    }

    public void perder(int solucion[]) {

    }

    public void revisarNumero(String valor) {
        System.out.print("\t Incorrecto,  "+valor+" no és un intento válido.");
    }

    public void salirJuego() {
        System.out.println("Saldras del juego.");
    }

    public void limpiar() {

    }
}
