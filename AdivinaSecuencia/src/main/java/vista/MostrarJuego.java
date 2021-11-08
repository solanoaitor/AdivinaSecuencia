package vista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MostrarJuego {

    public MostrarJuego() {}

    public void instrucciones() {
        System.out.println("-------------------------");
        System.out.println("Juego Adivina Secuecia");
        System.out.println("-------------------------");
        System.out.println("Instrucciones:");
        System.out.println("Introduce una secuencia de cuatro dígitos para adivinar la secuencia correcta.");
        System.out.println("Pueden ser dígitos del 0 al 9 ");
        System.out.println("Tedras 10 intentos. Para saber si has ganado o perdido:");
        System.out.println("                Bolas Negras, indican bolas correctas en una posición correcta");
        System.out.println("                Bolas Blancas, indican bolas correctas en una posición incorrecta");
        System.out.println("");
        System.out.println("Jugar --> Enter");
        System.out.println("Salir --> 0 y después Enter");
        System.out.println("--------------------------");
    }

    //TODO: reducir complejidad
    public void muestraResultado(String intentos[][]) {
        System.out.println("                 Bolas       Blancas  Negras" );
        int limiteIntentos = 10;
        int limite = 4;
        List<String> myList;
        for(int i = 9; i >= 0; i--) {

            if(limiteIntentos == 10) {
                System.out.print("    " + limiteIntentos + ": ");
            }else {
                System.out.print("     " + limiteIntentos + ": ");
            }
            limiteIntentos = limiteIntentos - 1;

            System.out.print("      ");
            for(int j = 0; j < limite; j++) {

                if(intentos[i][j] != null) {
                    //Digitos del intento
                    myList = new ArrayList<>();
                    String secuencia = intentos[i][j];
                    myList.add(secuencia);
                    System.out.print(myList);

                    if(j == 3) {
                        //Bolas Blancas
                        System.out.print("\t    " + intentos[i][4]);
                        //Bolas Negras
                        System.out.print("\t    " + intentos[i][5]);
                    }
                }
            }
            System.out.println("");
        }
    }

    public void introducirNumero() {
        System.out.println("");
        System.out.print("Intento:  ");
    }

    public void revisarNumero(String valor) {
        System.out.println("\t Incorrecto,  " + valor + " no és un formato válido.");
    }

    public void ganar() {
        System.out.println("");
        System.out.println("Muy bien, has ganado!");
        System.out.println("Pulsa enter para continuar");
    }

    public void perder(int [] solucion) {
        System.out.println("");
        System.out.print("Lo siento has perdido, la solución era: ");
        System.out.print(Arrays.toString(solucion));
        System.out.println("");
        System.out.println("Apretar enter para continuar...");
    }
    
    public void salirJuego() {
        System.out.println("Saliendo del juego.");
    }

    public void limpiar() {
        for (int i = 0; i < 200; i++) {
            System.out.println();
        }
    }
}
