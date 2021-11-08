package tests;

public class MockBolas {
    private String intentos[][];
    private int solucion[];

    public MockBolas() {
        this.intentos = new String[10][6];
        this.solucion = new int[4];
    }

    public void arrayIntentos() {
        intentos[0][0] = "1";
        intentos[0][1] = "2";
        intentos[0][2] = "3";
        intentos[0][3] = "4";
    }

    public void solucionBlancas() {
        solucion[0] = 1;
        solucion[1] = 2;
        solucion[2] = 3;
        solucion[3] = 4;
    }

    public void solucionNegras() {
        solucion[0] = 4;
        solucion[1] = 3;
        solucion[2] = 2;
        solucion[3] = 1;
    }

    public void solucionFalsa() {
        solucion[0] = 5;
        solucion[1] = 6;
        solucion[2] = 7;
        solucion[3] = 8;
    }

    public String[][] getIntentos() {
        return intentos;
    }

    public int[] getSolucion() {
        return solucion;
    }
}
