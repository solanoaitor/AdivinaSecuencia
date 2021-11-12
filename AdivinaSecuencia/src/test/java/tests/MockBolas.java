package tests;

/**
 * @author 		Desirée y Aitor
 * @name 		MockBolas.java
 * @description	MockBolas: Esta clase tiene como objetivo comprobar en los test el funcionamiento
 * de los arrays de intentos y otro de soluciones (el de soluciones tiene como objetivo comprobar
 * las bolas negras y blancas).
 * @test testRevisaBolasNegras(), testRevisaBolasBlancas()
 */

public class MockBolas {
    private String intentos[][];
    private int solucion[];

    /**
     * Este método pretende inicializar los arrays de intentos y el de soluciones.
     * ANOTACIÓN: Inicializamos el array de soluciones indicando que tenemos 4 posibles
     * soluciones. Inicializamos el array de intentos con 2 intentos posibles y 4 + 2.
     * Donde 4 hace referencia a los números y 2 hace referencia a los dos tipos de bolas posibles
     * (blancas y negras).
     * @param
     * @constructor MockBolas
     */
    public MockBolas() {
        this.intentos = new String[2][6];
        this.solucion = new int[4];
    }

    /**
     * Este método pretende obtener los intentos del array de intentos.
     * @param
     * @return String[][]
     */
    public String[][] getIntentos() {
        return intentos;
    }

    /**
     * Este método pretende obtener las soluciones del array de soluciones.
     * @param
     * @return int[]
     */
    public int[] getSolucion() {
        return solucion;
    }

    /**
     * Este método pretende incializar el array de intentos, para poder testear su funcionamiento
     * @param
     * @return void
     */
    public void arrayIntentos() {
        intentos[0][0] = "0";
        intentos[0][1] = "1";
        intentos[0][2] = "2";
        intentos[0][3] = "3";
        intentos[0][4] = "4";
        intentos[0][5] = "5";
        intentos[1][0] = "0";
        intentos[1][1] = "1";
        intentos[1][2] = "2";
        intentos[1][3] = "3";
        intentos[1][4] = "4";
        intentos[1][5] = "5";
    }

    /**
     * Este método pretende incializar el array de soluciones (referente a las bolas blancas),
     * para poder testear su funcionamiento
     * @param
     * @return void
     */
    public void solucionBlancas() {
        solucion[0] = 0;
        solucion[1] = 1;
        solucion[2] = 2;
        solucion[3] = 3;
    }

    /**
     * Este método pretende incializar el array de soluciones (referente a las bolas negras),
     * para poder testear su funcionamiento
     * @param
     * @return void
     */
    public void solucionNegras() {
        solucion[0] = 3;
        solucion[1] = 2;
        solucion[2] = 1;
        solucion[3] = 0;
    }

    /**
     * Este método pretende incializar el array de soluciones (referente a las bolas negras y blancas),
     * con valores distintos a 0,1,2,3 para poder testear su funcionamiento
     * @param
     * @return void
     */
    public void solucionFalsa() {
        solucion[0] = 4;
        solucion[1] = 5;
        solucion[2] = 7;
        solucion[3] = 8;
    }
}
