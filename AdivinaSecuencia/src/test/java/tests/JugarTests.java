package tests;

import controlador.Jugar;
import modelo.EstructuraPartida;
import org.junit.jupiter.api.Test;

public class JugarTests {
    @Test
    public void testMain() {
        MockPlay mockPlay = new MockPlay();

        mockPlay.introduceOptions();
        mockPlay.introduceValues();

        String options[] = mockPlay.getOptions();
        String values[] = mockPlay.getValues();

        for(int index = 0; index < options.length; index++) {
            Jugar play = new Jugar();
            play.testMain(options[index], values);
        }


        EstructuraPartidaTests partidaTest = new EstructuraPartidaTests();
        partidaTest.testSolucion();
        partidaTest.testRevisaNumero();
        partidaTest.testIntroduceIntentos();
        partidaTest.testIntroduceBolas();
        partidaTest.testGetSolucion();
        partidaTest.testGetArrayIntentos();
        partidaTest.testGetIntentos();
        partidaTest.testSetIntentos();

        BolasTests bolasTest = new BolasTests();
        bolasTest.testRevisaBolasBlancas();
        bolasTest.testRevisaBolasNegras();
        bolasTest.testGetBolaNegra();
        bolasTest.testGetBolaBlanca();
    }
}
