package tests;

import modelo.Blanca;
import modelo.Negra;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author 		Desirée y Aitor
 * @name 		BolasTests.java
 * @description	BolasTests: Realiza los test de las funciones
 * asociadas a Blanca.java y Negra.java
 */
public class BolasTests {

    /**
     * Este método pretende comprovar si funciona el método getBolaNegra()
     * y se asigna correctamente el número de bolas negras.
     * @param
     * @return void
     */
    @Test
    public void testGetBolaNegra() {
        Negra bolaNegra = new Negra();
        int balls = 0, get_bolaNegra = bolaNegra.getBolaNegra();
        assertEquals(balls, get_bolaNegra);

        balls = 2;
        assertNotEquals(balls, get_bolaNegra);

        balls = 3;
        assertNotEquals(balls, get_bolaNegra);

    }

    /**
     * Este método pretende comprovar si funciona el método getBolaBlanca()
     * y se asigna correctamente el número de bolas blancas.
     * @param
     * @return void
     */
    @Test
    public void testGetBolaBlanca() {
        Blanca bolaBlanca = new Blanca();
        int balls = 0;
        int get_bolaBlanca = bolaBlanca.getBolaBlanca();
        assertEquals(balls, get_bolaBlanca);

        balls = 2;
        assertNotEquals(balls, get_bolaBlanca);

        balls = 2;
        assertNotEquals(balls, get_bolaBlanca);

    }

    /**
     * Este método pretende comprovar si funciona el método revisaBola() para las bolas negras.
     * Utilizamos un objeto Mock para crear arrays
     * @param
     * @return void
     */
    @Test
    public void testRevisaBolasNegras() {
        Negra bolasNegras = new Negra();
        MockBolas mockBalls = new MockBolas();

        mockBalls.arrayIntentos();
        mockBalls.solucionNegras();
        String[][] mock_intentos = mockBalls.getIntentos();
        assertTrue(bolasNegras.revisaBola(mock_intentos, mockBalls.getSolucion(), 0));

        mockBalls.solucionFalsa();

        assertFalse(bolasNegras.revisaBola(mock_intentos, mockBalls.getSolucion(), 0));
    }

    /**
     * Este método pretende comprovar si funciona el método revisaBola() para las bolas blancas
     * Utilizamos un objeto Mock para crear arrays
     * @param
     * @return void
     */
    @Test
    public void testRevisaBolasBlancas() {
        Blanca bolasBlancas = new Blanca();
        MockBolas mockBalls = new MockBolas();

        mockBalls.arrayIntentos();
        mockBalls.solucionBlancas();

        String[][] mock_intentos = mockBalls.getIntentos();
        assertTrue(bolasBlancas.revisaBola(mock_intentos, mockBalls.getSolucion(), 0));

        mockBalls.solucionFalsa();

        assertFalse(bolasBlancas.revisaBola(mock_intentos, mockBalls.getSolucion(), 0));
    }

}
