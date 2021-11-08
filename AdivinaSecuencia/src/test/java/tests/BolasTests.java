package tests;

import modelo.Blanca;
import modelo.Negra;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BolasTests {

    @Test
    public void testRevisaBolasNegras() {
        Negra bolasNegras = new Negra();
        MockBolas mockBalls = new MockBolas();

        mockBalls.arrayIntentos();
        mockBalls.solucionNegras();

        boolean bolasNegrasTrue = bolasNegras.revisaBola(mockBalls.getIntentos(), mockBalls.getSolucion(), 0);
        assertTrue(bolasNegrasTrue);

        mockBalls.solucionFalsa();

        boolean bolasNegrasFalse = bolasNegras.revisaBola(mockBalls.getIntentos(), mockBalls.getSolucion(), 0);
        assertFalse(bolasNegrasFalse);
    }

    @Test
    public void testRevisaBolasBlancas() {
        Blanca bolasBlancas = new Blanca();
        MockBolas mockBalls = new MockBolas();

        mockBalls.arrayIntentos();
        mockBalls.solucionBlancas();

        boolean bolasBlancasTrue = bolasBlancas.revisaBola(mockBalls.getIntentos(), mockBalls.getSolucion(), 0);
        assertTrue(bolasBlancasTrue);

        mockBalls.solucionFalsa();

        boolean bolasBlancasFalse = bolasBlancas.revisaBola(mockBalls.getIntentos(), mockBalls.getSolucion(), 0);
        assertFalse(bolasBlancasFalse);
    }

    @Test
    public void testGetBolaNegra() {
        Negra bolaNegra = new Negra();
        int balls = 0;

        assertEquals(balls, bolaNegra.getBolaNegra());

        balls = 4;
        assertNotEquals(balls, bolaNegra.getBolaNegra());

    }

    @Test
    public void testGetBolaBlanca() {
        Blanca bolaBlanca = new Blanca();
        int balls = 0;

        assertEquals(balls, bolaBlanca.getBolaBlanca());

        balls = 4;
        assertNotEquals(balls, bolaBlanca.getBolaBlanca());

    }
}
