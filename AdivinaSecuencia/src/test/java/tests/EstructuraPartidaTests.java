package tests;

import modelo.EstructuraPartida;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EstructuraPartidaTests {

    /**
     * Este metodo comprueba que los numeros recibidos y guardados en el array
     * son distintos. Además, comprueba que los números estan comprendidos dentro
     * del rango adecuado [0,9].
     * @param No recibe parametros la función testSolucion().
     * @return void
     */
    @Test
    public void testSolucion() {
        EstructuraPartida partida = new EstructuraPartida(10);
        boolean rango = false;
        int limite = 4;
        int[] solucion = new int[4];
        solucion = partida.solucion();
        int i, j;
        int solucion_i, solucion_j;
        for(i = 0, j = 0; i < limite; i++,j++) {
            solucion_i = solucion[i];
            solucion_j = solucion[j];
            if(solucion_i >= 0 && solucion_i < 10) {
                rango = true;
            }
            assertTrue(rango);
            if(i != j){
                assertNotEquals(solucion_i, solucion_j);
            }
        }
    }

    /**
     * Este metodo comprueba si el objeto Mock introduce valores válidos o inválidos.
     * @param No recibe parametros la función testRevisaNumero().
     * @return void
     */
    @Test
    public void testRevisaNumero() {
        EstructuraPartida partida = new EstructuraPartida(10);
        MockRevisarNumeros mock = new MockRevisarNumeros();

        mock.introducenNumerosCorrectos();
        mock.introduceNumerosIncorrectos();
        int len_numeros_incorrectos = mock.getArrayNumerosIncorrectos().length;
        boolean checkCorrectNumbers;

        checkCorrectNumbers = partida.revisaNumero(mock.getArrayNumerosCorrectos()[0]);
        assertTrue(checkCorrectNumbers);
        checkCorrectNumbers = partida.revisaNumero(mock.getArrayNumerosCorrectos()[1]);
        assertTrue(checkCorrectNumbers);
        checkCorrectNumbers = partida.revisaNumero(mock.getArrayNumerosCorrectos()[2]);
        assertTrue(checkCorrectNumbers);

        for (int index = 0; index < len_numeros_incorrectos; index++) {
            boolean checkFailNumbers = partida.revisaNumero(mock.getArrayNumerosIncorrectos()[index]);
            assertFalse(checkFailNumbers);
        }
    }

    /**
     * Este metodo comprueba si los valores se guardan correctamente en el array de intentos.
     * @param No recibe parametros la función testIntroduceIntentos().
     * @return void
     */
    @Test
    public void testIntroduceIntentos() {
        EstructuraPartida partida = new EstructuraPartida(10);
        String intentos[][] = partida.introduceIntentos("5372");

        assertEquals(intentos[0][0], "5");
        assertEquals(intentos[0][1], "3");
        assertEquals(intentos[0][2], "7");
        assertEquals(intentos[0][3], "2");

        assertNotEquals(intentos[0][0], "1");
        assertNotEquals(intentos[0][1], "6");
        assertNotEquals(intentos[0][2], "3");
        assertNotEquals(intentos[0][3], "4");
        assertNotEquals(intentos[0][3], "1");
    }

    @Test
    public void testIntroduceBolas() {
        EstructuraPartida partida = new EstructuraPartida(10);
        String arrayAttempts[][] = partida.introduceBolas(1,2);

        assertEquals(arrayAttempts[0][4], "1");
        assertEquals(arrayAttempts[0][5], "2");

        assertNotEquals(arrayAttempts[0][4], "3");
        assertNotEquals(arrayAttempts[0][5], "0");

    }

    @Test
    public void testGetSolucion() {
        EstructuraPartida partida = new EstructuraPartida(10);
        int arraySolutionTrue[] = new int[4];

        assertArrayEquals(arraySolutionTrue, partida.getArraySolucion());

    }

    @Test
    public void testGetArrayIntentos() {
        EstructuraPartida partida = new EstructuraPartida(10);
        String arrayAttemptsTrue[][] = new String[10][6];

        assertArrayEquals(arrayAttemptsTrue, partida.getArrayIntentos());
    }

    @Test
    public void testGetIntentos() {
        EstructuraPartida partida = new EstructuraPartida(10);
        int attempt = 0;

        assertEquals(attempt, partida.getIntentos());

        attempt = 9;
        assertNotEquals(attempt, partida.getIntentos());
    }

    @Test
    public void testSetIntentos() {
        EstructuraPartida partida = new EstructuraPartida(10);
        partida.setIntentos(5);

        assertEquals(partida.getIntentos(), 5);

        partida.setIntentos(9);
        assertNotEquals(partida.getIntentos(), 5);
    }
}
