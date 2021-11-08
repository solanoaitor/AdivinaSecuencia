package tests;

public class MockRevisarNumeros {

    private String numerosCorrectos[];
    private String numerosIncorrectos[];

    public MockRevisarNumeros() {
        this.numerosCorrectos = new String[3];
        this.numerosIncorrectos = new String[10];
    }

    public void introducenNumerosCorrectos() {
        this.numerosCorrectos[0] = "1234";
        this.numerosCorrectos[1] = "5678";
        this.numerosCorrectos[2] = "9012";
    }

    public void introduceNumerosIncorrectos() {
        this.numerosIncorrectos[0] = "098";
        this.numerosIncorrectos[1] = "09876";
        this.numerosIncorrectos[2] = "y123";
        this.numerosIncorrectos[3] = "567/";
        this.numerosIncorrectos[4] = "qwert";
        this.numerosIncorrectos[5] = "qwe";
        this.numerosIncorrectos[6] = "qwerty";
        this.numerosIncorrectos[7] = "poi*";
        this.numerosIncorrectos[8] = "*mnb";
        this.numerosIncorrectos[9] = "";
    }

    public String[] getArrayNumerosCorrectos() {
        return numerosCorrectos;
    }

    public String[] getArrayNumerosIncorrectos() {
        return numerosIncorrectos;
    }
}
