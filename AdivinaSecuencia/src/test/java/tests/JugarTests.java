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
        MockJugar mockJugar = new MockJugar();

        mockJugar.selecionaOpcion();
        mockJugar.introduceValor();

        String opciones[] = mockJugar.getOpciones();
        String valores[] = mockJugar.getValores();

        for(int i = 0; i < opciones.length; i++) {
            Jugar jugar = new Jugar();
            jugar.testMain(opciones[i], valores);
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
