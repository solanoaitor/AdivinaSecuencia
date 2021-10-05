package modelo;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Juego {
    private int solucion[];
    private String intentos[][];
    private int intento;
    private Random creadorrabdom = new Random();

    public Juego(int intentosMaximos) {
        this.intentos = new String[intentosMaximos][6];
        this.intento = 0;
        this.solucion = new int[4];
    }

    //Crea una solucion valida y comprueba que ningun numero es igual al anterior
    public int [] solucion(){

        return solucion;
    }

    public boolean revisaNumero(String valor) {

        return false;
    }

    public String[][] introduceIntentos(String valor) {

        return intentos;
    }

    public String[][] introduceBolas(int bolaBlanca, int bolaNegra) {


        return intentos;
    }

    public int[] getArraySolucion() {
        return solucion;
    }

    public int getIntentos() {
        return intento;
    }

    public String[][] getArrayIntentos() {
        return intentos;
    }

    public void setIntentos(int intento) {
        this.intento = intento;
    }
}
