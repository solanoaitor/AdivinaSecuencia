package modelo;

public class Negra implements Bola{

    private int bolaNegra;
    boolean encontrado;
    private String stringArray[];

    public Negra(){
        this.bolaNegra = 0;
        this.encontrado = false;
    }

    //TODO: reducir complejidad.
    @Override
    public boolean revisaBola(String intentos[][], int solucionFinal[], int intento) {
        bolaNegra = 0;
        encontrado = false;
        stringArray = new String[solucionFinal.length];

        for (int i = 0; i < solucionFinal.length; i++){

            for (int j = 1; j < solucionFinal.length; j++){
                stringArray[i] = String.valueOf(solucionFinal[(i + j)%4]);

                if(intentos[intento][i].equals(stringArray[i])){
                    this.bolaNegra++;
                    encontrado = true;
                }
            }
        }
        return encontrado;
    }

    public int getBolaNegra(){
        return bolaNegra;
    }
}
