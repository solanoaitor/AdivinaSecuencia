package tests;

/**
 * @author 		Desirée y Aitor
 * @name 		MockPlay.java
 * @description	MockPlay: Esta clase tiene como objetivo crear por defecto para realizar partidas
 * arrays de diferentes opciones y valores para posteriormente poder testear el main en el fichero
 * JugarTests.java.
 */
public class MockPlay {
    private String options[];
    private String values[];

    /**
     * Este método pretende inicializar los arrays de opciones y de valores.
     * ANOTACIÓN: Inicializamos el array de opciones indicando que tenemos 3 posibles
     * opciones (tal y como se puede observar en la clase Jugar, las opciones disponibles son 0, 1 y 2).
     * Inicializamos el array de valores con 12 valores posibles para poder testear la introducción
     * y obtención de valores.
     * @param
     * @constructor MockPlay
     */
    public MockPlay() {
        this.options = new String[3];
        this.values = new String[12];
    }

    /**
     * Este método pretende obtener las opciones del array de opciones.
     * @param
     * @return String[]
     */
    public String[] getOptions() {
        return options;
    }

    /**
     * Este método pretende obtener los valores del array de valores.
     * @param
     * @return String[]
     */
    public String[] getValues() {
        return values;
    }

    /**
     * Este método pretende introducir los posibles valores que pueden tener las opciones
     * para poder testear posteriormente. Dejamos como ultimo valor 0 para que no salga del juego
     * inicialmente.
     * @param
     * @return void
     */
    public void introduceOptions() {
        options[0] = "2";
        options[1] = "1";
        options[2] = "0";
    }

    /**
     * Este método pretende introducir los posibles valores que se podrían tener en el array
     * de valores para poder testear posteriormente.
     * ANOTACIÓN: Como podemos obtener muchos valores distintos correctos e incorrectos se
     * han puesto solo 12 para simplificar.
     * @param
     * @return void
     */
    public void introduceValues() {
        values[0] = "";
        values[1] = "9000";
        values[2] = "9010";
        values[3] = "9001";
        values[4] = "00005";
        values[5] = "0000";
        values[6] = "9000";
        values[7] = "0900";
        values[8] = "1543";
        values[9] = "1543";
        values[10] = "1543";
        values[11] = "90ab";
    }
}
