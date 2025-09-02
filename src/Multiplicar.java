public class Multiplicar {
    private double number1;
    private double number2;

    public Multiplicar(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Multiplicar(){

    }

    public double getnumber1() {
        return number1;
    }

    public void setnumber1(double number1) {
        this.number1 = number1;
    }

    public double getnumber2() {
        return number2;
    }

    public void setnumber2(double number2) {
        this.number2 = number2;
    }

    public double obtenerResultado(){
        return number1 * number2;
    }


}
