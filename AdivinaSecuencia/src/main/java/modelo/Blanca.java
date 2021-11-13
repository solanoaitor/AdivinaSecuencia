package modelo;

/**
 * @autor       Desirée y Aitor
 * @name        Blanca,java
 * @intercafe   Bola.java
 * @description Clase que permite guardar el número de bolas blancas a un intento, gracias a la interface Bola, la cual
 * podemos sobrecargar el método 'revisaBola(String intentos[][], int solucionFinal[], int intento)'
 */
public class Blanca implements Bola{
    private int bolaBlanca;
    boolean encontrado;
    private String stringArray[];

    /**
     * @construtor      Creación del objeto Blanca con sus atributo
     * @encontrado      Permite ver si se han encontrado bolas
     * @bolaBlanca       Cantidad de bolas blancas en el intento
     */
    public Blanca(){
        this.bolaBlanca = 0;
        this.encontrado = false;
    }

    /**
     * @revisaBola              Método sobrecargado que comprueba si hay bolas blancas en solucionFinal[] y en este caso
     * las guarda en bolaBlanca
     * @param intentos          Guarda todos los intentos que realiza el usuario
     * @param solucionFinal     Solución final del juego para ganar
     * @param intento           Intento actual que registra el usuario
     * @return                  Devuelve true si ha encontrado bolas blancas, false si no ha encontrado
     */
    @Override
    public boolean revisaBola(String intentos[][], int solucionFinal[], int intento) {
        bolaBlanca = 0;
        encontrado = false;
        stringArray = new String[solucionFinal.length];

        for (int i = 0; i < solucionFinal.length; i++){
            stringArray[i] = String.valueOf(solucionFinal[i]);

            if(intentos[intento][i].equals(stringArray[i])){
                this.bolaBlanca++;
                encontrado = true;
            }
        }
        return encontrado;
    }

    /**
     * @getBolaBlanca   Método para la obtención de bola blanca
     * @return          Devuelve un integer de la bola blanca
     */
    public int getBolaBlanca(){
        return bolaBlanca;
    }
}
