package tests;

import modelo.EstructuraPartida;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EstructuraPartidaTests {

    /**
     * Este método pretende comprovar si funciona el método getIntentos()
     * i se obtienen los intentos actuales correctamente.
     * ACLARACIÓN: Inicialmente, cuando empezamos el juego no hemos realizado ningun
     * intento.
     * @param
     * @return void
     */
    @Test
    public void testGetIntentos() {
        EstructuraPartida partida = new EstructuraPartida(10);

        assertEquals(0, partida.getIntentos());

        assertNotEquals(7, partida.getIntentos());
    }

    /**
     * Este método pretende comprovar si funciona el método setIntentos()
     * i se asigna correctamente el número de intentos realizados.
     * @param
     * @return void
     */
    @Test
    public void testSetIntentos() {
        EstructuraPartida partida = new EstructuraPartida(10);
        partida.setIntentos(8);

        assertEquals(partida.getIntentos(), 8);
        assertNotEquals(partida.getIntentos(), 52);

        partida.setIntentos(9);
        assertNotEquals(partida.getIntentos(), 52);
        assertEquals(partida.getIntentos(), 9);
    }

    /**
     * Este método pretende comprovar si funciona correctamente el método
     * getArraySolucion()
     * @param
     * @return void
     */
    @Test
    public void testGetSolucion() {
        EstructuraPartida partida = new EstructuraPartida(10);
        int arraySolutionTrue[] = new int[4];

        assertArrayEquals(arraySolutionTrue, partida.getArraySolucion());

    }

    /**
     * Este método pretende comprovar que si se introduce un array de soluciones
     * incorrectas el método getArraySolucion() obtendrá valores diferentes.
     * @param
     * @return void
     */
    @Test
    public void testGetIncorrectSolucion() {
        EstructuraPartida partida = new EstructuraPartida(10);
        int arraySolutionIncorrect[] = new int[2];

        assertNotEquals(arraySolutionIncorrect, partida.getArraySolucion());

    }

    /**
     * Este método pretende comprovar si funciona correctamente el método
     * getArrayIntentos()
     * @param
     * @return void
     */
    @Test
    public void testGetArrayIntentos() {
        EstructuraPartida partida = new EstructuraPartida(10);
        String arrayIntentosTrue[][] = new String[10][6];

        assertArrayEquals(arrayIntentosTrue, partida.getArrayIntentos());
    }

    /**
     * Este método pretende comprovar que si se introduce un array de intentos
     * incorrecto el método getArrayIntentos() obtendrá valores diferentes.
     * @param
     * @return void
     */
    @Test
    public void testGetIncorrectArrayIntentos() {
        EstructuraPartida partida = new EstructuraPartida(10);
        String[][] arrayIntentosFalse = new String[10][5];

        assertNotEquals(arrayIntentosFalse, partida.getArrayIntentos());
    }

    /**
     * Este metodo comprueba que los numeros recibidos y guardados en el array
     * son distintos. Además, comprueba que los números estan comprendidos dentro
     * del rango adecuado [0,9].
     * @param
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
     * @param
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
     * @param
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

    /**
     * Este metodo comprueba si el array bolas guarda los valores correctamente
     * @param
     * @return void
     */
    @Test
    public void testIntroduceBolas() {
        EstructuraPartida partida = new EstructuraPartida(10);
        String[][] bolas = partida.introduceBolas(3,5);

        assertEquals(bolas[0][4], "3");
        assertEquals(bolas[0][5], "5");

        assertNotEquals(bolas[0][4], "0");
        assertNotEquals(bolas[0][5], "1");
        assertNotEquals(bolas[0][4], "1");
        assertNotEquals(bolas[0][5], "0");

    }
}
