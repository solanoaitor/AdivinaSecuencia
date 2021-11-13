package modelo;

/**
 * @autor       Desirée y Aitor
 * @name        Bola.java
 * @description Interface del cual podremos sobrecargar el método 'revisaBola(String intentos[][], int solucionFinal[], int intento)'
 * para poder utilizarlo de diferente manera en las clases Nogra,java y Blanca.java
 */
public interface Bola {

    boolean revisaBola(String intentos[][], int solucionFinal[], int intento);
}
