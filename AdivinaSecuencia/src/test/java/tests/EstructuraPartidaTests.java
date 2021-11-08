package tests;

import modelo.EstructuraPartida;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EstructuraPartidaTests {

    @Test
    public void testSolucion() {
        EstructuraPartida partida = new EstructuraPartida(10);
        boolean rango = false;
        int limite = 4;
        int[] solucion = new int[4];
        solucion = partida.solucion();

        for(int i = 0; i < limite; i++) {
            for(int j = 0; j < limite; j++) {
                if(i != j){
                    assertNotEquals(solucion[i], solucion[j]);
                }
            }
        }

        for(int i = 0; i < limite; i++) {
            if(solucion[i] < 10 && solucion[i] >= 0) {
                rango = true;
            }
            assertTrue(rango);
        }
    }

    @Test public void testRevisaNumero() {
        EstructuraPartida partida = new EstructuraPartida(10);
        MockRevisarNumeros mock = new MockRevisarNumeros();

        mock.introducenNumerosCorrectos();
        mock.introduceNumerosIncorrectos();

        for (int index = 0; index < mock.getArrayNumerosCorrectos().length; index++) {
            boolean checkCorrectNumbers = partida.revisaNumero(mock.getArrayNumerosCorrectos()[index]);
            assertTrue(checkCorrectNumbers);
        }


        for (int index = 0; index < mock.getArrayNumerosIncorrectos().length; index++) {
            boolean checkFailNumbers = partida.revisaNumero(mock.getArrayNumerosIncorrectos()[index]);
            assertFalse(checkFailNumbers);
        }
    }

    @Test public void testIntroduceIntentos() {
        EstructuraPartida partida = new EstructuraPartida(10);
        String arrayAttempts[][] = partida.introduceIntentos("2893");

        assertEquals(arrayAttempts[0][0], "2");
        assertEquals(arrayAttempts[0][1], "8");
        assertEquals(arrayAttempts[0][2], "9");
        assertEquals(arrayAttempts[0][3], "3");

        assertNotEquals(arrayAttempts[0][0], "1");
        assertNotEquals(arrayAttempts[0][1], "6");
        assertNotEquals(arrayAttempts[0][2], "7");
        assertNotEquals(arrayAttempts[0][3], "2");

    }

    @Test public void testIntroduceBolas() {
        EstructuraPartida partida = new EstructuraPartida(10);
        String arrayAttempts[][] = partida.introduceBolas(1,2);

        assertEquals(arrayAttempts[0][4], "1");
        assertEquals(arrayAttempts[0][5], "2");

        assertNotEquals(arrayAttempts[0][4], "3");
        assertNotEquals(arrayAttempts[0][5], "0");

    }

    @Test public void testGetSolucion() {
        EstructuraPartida partida = new EstructuraPartida(10);
        int arraySolutionTrue[] = new int[4];

        assertArrayEquals(arraySolutionTrue, partida.getArraySolucion());

    }

    @Test public void testGetArrayIntentos() {
        EstructuraPartida partida = new EstructuraPartida(10);
        String arrayAttemptsTrue[][] = new String[10][6];

        assertArrayEquals(arrayAttemptsTrue, partida.getArrayIntentos());
    }

    @Test public void testGetIntentos() {
        EstructuraPartida partida = new EstructuraPartida(10);
        int attempt = 0;

        assertEquals(attempt, partida.getIntentos());

        attempt = 9;
        assertNotEquals(attempt, partida.getIntentos());
    }

    @Test public void testSetIntentos() {
        EstructuraPartida partida = new EstructuraPartida(10);
        partida.setIntentos(5);

        assertEquals(partida.getIntentos(), 5);

        partida.setIntentos(9);
        assertNotEquals(partida.getIntentos(), 5);
    }
}
