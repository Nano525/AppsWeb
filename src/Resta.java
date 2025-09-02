public class Resta {
    private boolean numero1;
    private boolean numero2;
    private boolean resultado;

    public Resta(boolean numero1, boolean numero2, boolean resultado) {
        this.numero1 = numero1;
    }

    public boolean isNumero1() {
        return numero1;
    }

    public void setNumero1(boolean numero1) {
        this.numero1 = numero1;
    }

    public boolean isResultado() {
        return resultado;
    }

    public void setResultado(boolean resultado) {
        this.resultado = resultado;
    }

    public boolean isNumero2() {
        return numero2;
    }

    public void setNumero2(boolean numero2) {
        this.numero2 = numero2;
    }
}
