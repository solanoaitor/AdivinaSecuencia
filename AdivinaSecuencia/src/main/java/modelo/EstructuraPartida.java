package modelo;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class EstructuraPartida {
    private int solucion[];
    private String intentos[][];
    private int intento;
    private Random numeroRandom = new Random();
    public EstructuraPartida(int intentosMaximos) {
        this.solucion = new int[4];
        this.intentos = new String[intentosMaximos][6];
        this.intento = 0;
    }

    //Crea una solucion valida y comprueba que ningun numero es igual al anterior
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

    public boolean revisaNumero(String valor) {
        if(valor.length() != 4) {
            return false;
        }else {
            try {
                Integer.parseInt(valor);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
    }

    public String[][] introduceIntentos(String valor) {
        char[] valueSeparate = valor.toCharArray();
        for(int i = 0; i < 4; i++) {
            intentos[intento][i] = Character.toString(valueSeparate[i]);
        }
        return intentos;
    }

    public String[][] introduceBolas(int bolaNegra, int bolaBlanca) {
        String blanca = String.valueOf(bolaBlanca);
        String negra = String.valueOf(bolaNegra);
        this.intentos[intento][5] = blanca;
        this.intentos[intento][4] = negra;
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
