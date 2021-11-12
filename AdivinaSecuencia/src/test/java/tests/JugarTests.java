package tests;

import controlador.Jugar;
import org.junit.jupiter.api.Test;

/**
 * @author 		Desirée y Aitor
 * @name 		JugarTests.java
 * @description	Realiza test del objeto Jugar, también realizará todos los tests de nuestra aplicación,
 * por lo que nos aseguramos que no hay ningun error de test
 */

public class JugarTests {

    /**
     * @testMain    Creará un mockObjects con unas opciones y un array de valores. De esta manera se ejecutará el programa
     * tantas veces como lleno esté el array de opciones.
     * Después se realizan todos los test de las otras clases, de esta manera nos aseguramos poder ejecutar todos los test correctamente.
     */
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
