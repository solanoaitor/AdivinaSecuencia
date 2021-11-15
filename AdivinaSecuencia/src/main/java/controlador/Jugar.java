package controlador;

import modelo.Blanca;
import modelo.EstructuraPartida;
import modelo.Negra;
import vista.MostrarJuego;

import java.util.Scanner;

/**
 * @author 		Desirée y Aitor
 * @name 		Jugar.java
 * @description	Jugar: Controlador principal de la aplicación, donde ejecutará un main de nuestro juego.
 * @test JugarTests.java
 *       Ejecuta los test automaticamente tanto de modelo, visto y controlador.
 *       Creados con valores mockObjects 100% success.
 *       Para realizar el test correctamente:
 *       - Debemos comprobar que el método 'public void testMain(String seleccionaOpcion, String[] valores)' no esté comentado.
 *       - Debemos comprobar que el método 'public static void main(String[] args)' esté comentado.
 *       - Clicar en Play con coverage en JugarTest.java, ejecutará automaticamente los test con sus respectivos resultados.
 *       - Si ejecutamos el test sin comentar el main del juego nos saldrá un coverage menor al 100% ya que no pasará por esas
 *       lineas de código.
 * @user Esta parte únicamente es para jugar al juego, seleccionaremos la opción de ejecutar el main y podremos jugar al juego.
 *       Debemos comprobar que el método 'public static void main(String[] args)' no esté comentado.
 *
 */

public class Jugar {
    private MostrarJuego mostrarJuego;
    private Scanner reader;
    private Blanca blanca;
    private Negra negra;
    private EstructuraPartida partida;
    private String valor;
    private String opcion;
    private boolean fin;

    /**
     * @constructor Creación de el objeto con sus atributos.
     * @blanca      Modelo: Creación de la bola blanca
     * @negra       Modelo: Creación de la bola negra
     * @partida     Modelo: Creación de la lógica de el programa
     * @mostrarJuego Vista: Output para mostrar la partida y el juego
     * @valor       Opción que introduce el usuario
     * @opcion      Opción para el usuario, puede jugar o salir del juego
     * @fin         Valor de cada usuario en cada intento
     * @reader      Objeto para leer entradas de teclado
     */
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

    /**
     * @main    Ejecución de el programa para que el usuario pueda jugar.
     */
    /*public static void main(String[] args) {

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
    }/*

    /**
     * @testMain				Execución del programa para realizar todo el test, funciona con números fijados.
     * @param seleccionaOpcion 	Opción que queremos jugar.
     * @param valores			Contiene los valors finales para cada intento del usuario, en este caso estan fijados por un mockObject.
     */
    public void testMain(String seleccionaOpcion, String[] valores) {

        int valoresIntentos = 0;

        mostrarJuego.limpiar();
        mostrarJuego.instrucciones();

        if(seleccionaOpcion.equals("0")) {
            mostrarJuego.salirJuego();
        }else {
            partida.solucion();

            if(seleccionaOpcion.equals("2")) {
                int arraySolucion[] = partida.getArraySolucion();
                String solucion = "";

                for(int i = 0; i < arraySolucion.length; i++) {
                    solucion = solucion + arraySolucion[i];
                }
                valores[0] = solucion;
            }

            do {
                mostrarJuego.limpiar();
                mostrarJuego.muestraResultado(partida.getArrayIntentos());

                do {
                    mostrarJuego.introducirNumero();
                    valor = valores[valoresIntentos];

                    if(partida.revisaNumero(valor) == false) {
                        mostrarJuego.revisarNumero(valor);
                        valoresIntentos = valoresIntentos + 1;
                    }
                }while(partida.revisaNumero(valor) == false);
                partida.introduceIntentos(valor);

                blanca.revisaBola(partida.getArrayIntentos(), partida.getArraySolucion(), partida.getIntentos());
                negra.revisaBola(partida.getArrayIntentos(), partida.getArraySolucion(), partida.getIntentos());

                partida.introduceBolas(negra.getBolaNegra(), blanca.getBolaBlanca());
                partida.setIntentos(partida.getIntentos() + 1);

                if((negra.getBolaNegra() == 4 || partida.getIntentos()  == 10)) {
                    fin = true;
                }else {
                    fin = false;
                }

                valoresIntentos = valoresIntentos + 1;

            }while(fin != true);

            mostrarJuego.limpiar();
            mostrarJuego.muestraResultado(partida.getArrayIntentos());

            if(negra.getBolaNegra() != 4) {
                mostrarJuego.perder(partida.getArraySolucion());
            }
        }
        if (seleccionaOpcion.equals("1")){
            mostrarJuego.ganar();
        }
    }
}
