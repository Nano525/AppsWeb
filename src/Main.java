import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

System.out.println("-------MENU DE CALCULADORA-------\n");
System.out.println("1.Sumar");
System.out.println("2.Restar");
System.out.println("3.Multiplicar");
System.out.println("4.Dividir");
System.out.println("5.Salir\n");
System.out.println("Escoge una opcion");
int opcion = read.nextInt();

switch(opcion){
    case 1:
        System.out.println("----SUMAR----\n");
        Sumar adittion = new Sumar();
        System.out.println("Ingrese el valor del numero 1: ");
        adittion.setnumber1(read.nextDouble());
        System.out.println("Ingrese el valor del numero 2: ");
        adittion.setnumber2(read.nextDouble());
        System.out.println("resultado: " + adittion.obtenerResultado());
        break;
    case 2:
        System.out.println("----RESTAR----\n");
        Resta substraction = new Resta();
        System.out.println("Ingrese el valor del numero 1: ");
        substraction.setnumber1(read.nextDouble());
        System.out.println("Ingrese el valor del numero 2: ");
        substraction.setnumber2(read.nextDouble());
        System.out.println("resultado: " + substraction.obtenerResultado());

        break;
    case 3:
        System.out.println("----MULTIPLICAR----\n");
        Multiplicar multiplication = new Multiplicar();
        System.out.println("Ingrese el valor del numero 1: ");
        multiplication.setnumber1(read.nextDouble());
        System.out.println("Ingrese el valor del numero 2: ");
        multiplication.setnumber2(read.nextDouble());
        System.out.println("resultado: " + multiplication.obtenerResultado());

        break;
    case 4:
        System.out.println("----DIVIDIR----\n");
        Dividir divide = new Dividir();
        System.out.println("Ingrese el valor del numero 1: ");
        divide.setnumber1(read.nextDouble());
        System.out.println("Ingrese el valor del numero 2: ");
        divide.setnumber2(read.nextDouble());
        System.out.println("resultado: " + divide.obtenerResultado());
        break;
    case 5:
        System.out.println("SALIR....\n");
        
        break;
    default:
        System.out.println("Opcion no valida");
        break;

    }
}
}
