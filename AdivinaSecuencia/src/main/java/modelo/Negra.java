package modelo;

/**
 * @author       Desirée y Aitor
 * @name        Negra,java
 * @intercafe   Bola.java
 * @description Clase que permite guardar el número de bolas negras a un intento, gracias a la interface Bola, la cual
 * podemos sobrecargar el método 'revisaBola(String intentos[][], int solucionFinal[], int intento)'
 */
public class Negra implements Bola{

    private int bolaNegra;
    boolean encontrado;
    private String stringArray[];

    /**
     * @construtor      Creación del objeto Negra con sus atributo
     * @encontrado      Permite ver si se han encontrado bolas
     * @bolaNegra       Cantidad de bolas negras en el intento
     */
    public Negra(){
        this.bolaNegra = 0;
        this.encontrado = false;
    }

    /**
     * @revisaBola              Método sobrecargado que comprueba si hay bolas negras en solucionFinal[] y en este caso
     * las guarda en bolaNegra
     * @param intentos          Guarda todos los intentos que realiza el usuario
     * @param solucionFinal     Solución final del juego para ganar
     * @param intento           Intento actual que registra el usuario
     * @return                  Devuelve true si ha encontrado bolas negras, false si no ha encontrado
     */
    @Override
    public boolean revisaBola(String intentos[][], int solucionFinal[], int intento) {
        bolaNegra = 0;
        encontrado = false;
        int length_solucionFinal = solucionFinal.length;
        stringArray = new String[solucionFinal.length];
        int i = 0, j = 1;
        for (i = 0, j=1; i < length_solucionFinal && j < length_solucionFinal; i++,j++){

            stringArray[i] = String.valueOf(solucionFinal[(i + j)%4]);

            if(intentos[intento][i].equals(stringArray[i])){
                this.bolaNegra++;
                encontrado = true;
            }
        }
        return encontrado;
    }

    /**
     * @getBolaNegra    Método para la obtención de bola negra
     * @return          Devuelve un integer de la bola negra
     */
    public int getBolaNegra(){
        return bolaNegra;
    }
}
