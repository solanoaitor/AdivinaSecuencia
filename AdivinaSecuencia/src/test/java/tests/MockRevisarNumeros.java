package tests;

/**
 * @author 		Desirée y Aitor
 * @name 		MockRevisarNumeros.java
 * @description	MockRevisarNumeros: Esta clase tiene como objetivo crear por defecto
 * arrays de números correctos e incorrectos para testear en el fichero EstructuraPartidaTests.java
 */
public class MockRevisarNumeros {

    private String numerosCorrectos[];
    private String numerosIncorrectos[];

    /**
     * Este método pretende inicializar los arrays de números correctos e incorrectos.
     * @param
     * @constructor MockRevisarNumeros
     */
    public MockRevisarNumeros() {
        this.numerosCorrectos = new String[10];
        this.numerosIncorrectos = new String[10];
    }

    /**
     * Este método pretende obtener el array de números correctos.
     * @param
     * @return String[]
     */
    public String[] getArrayNumerosCorrectos() {
        return numerosCorrectos;
    }

    /**
     * Este método pretende obtener el array de números incorrectos.
     * @param
     * @return String[]
     */
    public String[] getArrayNumerosIncorrectos() {
        return numerosIncorrectos;
    }

    /**
     * Este método pretende asignar valores al array de números correctos.
     * @param
     * @return void
     */
    public void introducenNumerosCorrectos() {
        this.numerosCorrectos[0] = "0000";
        this.numerosCorrectos[1] = "1234";
        this.numerosCorrectos[2] = "5678";
        this.numerosCorrectos[3] = "9012";
        this.numerosCorrectos[4] = "0001";
        this.numerosCorrectos[5] = "0010";
        this.numerosCorrectos[6] = "0100";
        this.numerosCorrectos[7] = "1000";
        this.numerosCorrectos[8] = "1001";
        this.numerosCorrectos[9] = "1010";
    }

    /**
     * Este método pretende asignar valores al array de números incorrectos.
     * @param
     * @return void
     */
    public void introduceNumerosIncorrectos() {
        this.numerosIncorrectos[0] = "0";
        this.numerosIncorrectos[1] = "00";
        this.numerosIncorrectos[2] = "000";
        this.numerosIncorrectos[3] = "77a/";
        this.numerosIncorrectos[4] = "hola";
        this.numerosIncorrectos[5] = "*aa*";
        this.numerosIncorrectos[6] = "b";
        this.numerosIncorrectos[7] = "***";
        this.numerosIncorrectos[8] = "_/a/";
        this.numerosIncorrectos[9] = "";
    }
}