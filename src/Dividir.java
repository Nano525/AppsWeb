public class Dividir {
    private double num1;
    private double num2;

    public Dividir(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Dividir(){

    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double obtenerResultado(){
        if(validar()){
            return num1 / num2;
        }
        return 0;
    }

    public boolean validar(){
        if(num2==0){
            System.out.println("Numero Invalido, no es posible una operacion entre 0");
            return false;
        }
        return true;
    }
}
