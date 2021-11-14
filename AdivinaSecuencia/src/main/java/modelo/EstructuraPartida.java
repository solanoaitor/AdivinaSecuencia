package modelo;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @autor       Desirée y Aitor
 * @name 		EstructuraPartida.java
 * @description	Clase que contiene toda la lógica del juego, crea la solución, revisa los números e intentos realizados
 *
 */
public class EstructuraPartida {
    private int solucion[];
    private String intentos[][];
    private int intento;
    private Random numeroRandom = new Random();

    /**
     * @constructor         Constructor amb parámetres intentosMaximos
     * @param intentosMaximos   Parametros de intentos máximos permitidos
     * @solucion        Slución final del juego
     * @intentos        Array de strings donde guardan los intentos introducidos por el usuario
     * @intento         Intento actual introducido por el usuario
     */
    public EstructuraPartida(int intentosMaximos) {
        this.solucion = new int[4];
        this.intentos = new String[intentosMaximos][6];
        this.intento = 0;
    }

    /**
     * @solucion    Realiza la solución válida para ganar
     * @return      Devuelve la solución final del juego
     */
    public int [] solucion(){
        Set<Integer> numerosUsados = new HashSet<>();
        int total = 0;
        while (numerosUsados.size() < 4) {
            int numeroAleatorio = numeroRandom.nextInt(10);
            if (!numerosUsados.contains(numeroAleatorio)){
                solucion[total] = numeroAleatorio;
                numerosUsados.add(numeroAleatorio);
                total++;
            }
        }
        return solucion;
    }

    /**
     * @revisaNumero    Revisa el número introducido por el usuario es un dígito y lo transforma a un integer
     * @param valor     Le pasamos el valor en string introducido por el usuario
     * @return          Devolvemos true o false si es de 4 dígitos o no
     */
    public boolean revisaNumero(String valor) {
        if(valor.length() == 4) {
            try {
                Integer.parseInt(valor);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        else {
            return false;
        }
    }

    /**
     * @introduceIntentos   Método para guardar los intentos realizados por el usuario
     * @param valor         Pasamos el valor introducido por el usuario
     * @return              Devuelve les intentos realizados por el usuario
     */
    public String[][] introduceIntentos(String valor) {
        char[] valueSeparate = valor.toCharArray();
        for(int i = 0; i < 4; i++) {
            intentos[intento][i] = Character.toString(valueSeparate[i]);
        }
        return intentos;
    }

    /**
     * @introduceBolas      Introduce bolas negras y bolas blancas en el array de intentos.
     * @param bolaNegra     Bolas negras introducidas
     * @param bolaBlanca    Bolas blancas introducidas
     * @return      Devuelve todo el array de intentos
     */
    public String[][] introduceBolas(int bolaNegra, int bolaBlanca) {
        String blanca = String.valueOf(bolaBlanca);
        String negra = String.valueOf(bolaNegra);
        this.intentos[intento][5] = blanca;
        this.intentos[intento][4] = negra;
        return intentos;
    }

    /**
     * @getArraySolucion    Método que devuelve en un array con la solución
     * @return      Devuelve el array con la solución
     */
    public int[] getArraySolucion() {
        return solucion;
    }

    /**
     * @getIntentos Método que devuelve los intentos del usuario
     * @return      Devuelve un array con los intentos introducidos por el usuario
     */
    public int getIntentos() {
        return intento;
    }

    /**
     * @getArrayIntentos    Método para devolver todos los intentos de el usuario
     * @return  Devuelve todos los intentos intriducidos por el usuario
     */
    public String[][] getArrayIntentos() {
        return intentos;
    }

    /**
     * @setIntentos     Método para introducir los intentos del usuairo
     * @param intento   Introduce el intento del usuario
     */
    public void setIntentos(int intento) {
        this.intento = intento;
    }
}
