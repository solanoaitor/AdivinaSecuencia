package modelo;

public class Blanca implements Bola{
    private int bolaBlanca;
    boolean encontrado;
    private String stringArray[];

    public Blanca(){
        this.bolaBlanca = 0;
        this.encontrado = false;
    }

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

    public int getBolaBlanca(){
        return bolaBlanca;
    }
}
