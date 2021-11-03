package controlador;

import modelo.Blanca;
import modelo.EstructuraPartida;
import modelo.Negra;
import vista.MostrarJuego;

import java.util.Scanner;

public class Jugar {
    private MostrarJuego mostrarJuego;
    private Scanner reader;
    private Blanca blanca;
    private Negra negra;
    private EstructuraPartida partida;
    private String valor;
    private String opcion;
    private boolean fin;

    public Jugar() {
        this.mostrarJuego = new MostrarJuego();
        this.reader = new Scanner(System.in);
        this.blanca = new Blanca();
        this.negra = new Negra();
        this.partida = new EstructuraPartida(10);
        this.valor = "";
        this.opcion = "";
        this.fin = false;
    }

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        MostrarJuego mostrarJuego = new MostrarJuego();
        String opcion;

        do {
            mostrarJuego.limpiar();
            mostrarJuego.instrucciones();
            opcion = reader.nextLine();

            if("0".equals(opcion)) {
                mostrarJuego.salirJuego();
                System.exit(0);
            }

            Blanca blanca = new Blanca();
            Negra negra = new Negra();
            String valor;
            boolean fin = false;
            EstructuraPartida partida = new EstructuraPartida(10);
            partida.solucion();

            do {
                mostrarJuego.limpiar();
                mostrarJuego.muestraResultado(partida.getArrayIntentos());
                do {
                    mostrarJuego.introducirNumero();
                    valor = reader.nextLine();

                    if(partida.revisaNumero(valor) == false) {
                        mostrarJuego.revisarNumero(valor);
                    }
                }while(partida.revisaNumero(valor) == false);

                partida.introduceIntentos(valor);

                blanca.revisaBola(partida.getArrayIntentos(), partida.getArraySolucion(), partida.getIntentos());
                negra.revisaBola(partida.getArrayIntentos(), partida.getArraySolucion(), partida.getIntentos());

                partida.introduceBolas( negra.getBolaNegra(), blanca.getBolaBlanca() );
                partida.setIntentos(partida.getIntentos()+1);

                if((negra.getBolaNegra() == 4 || partida.getIntentos() == 10)) {
                    fin = true;
                }else {
                    fin = false;
                }

            }while(fin != true);

            mostrarJuego.limpiar();
            mostrarJuego.muestraResultado(partida.getArrayIntentos());

            if(negra.getBolaNegra() == 4) {
                mostrarJuego.ganar();
                new java.util.Scanner(System.in).nextLine();
            }else {
                mostrarJuego.perder(partida.getArraySolucion());
                new java.util.Scanner(System.in).nextLine();
            }
        }while(opcion != "0");
    }
}
