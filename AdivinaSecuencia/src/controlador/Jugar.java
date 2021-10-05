package controlador;

import modelo.Bolas;
import modelo.Juego;
import vista.MostrarJuego;
import java.util.Scanner;

public class Jugar {
    private MostrarJuego mostrarJuego;
    private Scanner reader;
    private Bolas bolas;
    private Juego juego;
    private String valor;
    private String opcion;
    private boolean fin;

    public Jugar() {
        this.mostrarJuego = new MostrarJuego();
        this.reader = new Scanner(System.in);
        this.bolas = new Bolas();
        this.juego = new Juego(10);
        this.valor = "";
        this.opcion = "";
        this.fin = false;
    }

    public static void main(String[] args) {
    }
}
