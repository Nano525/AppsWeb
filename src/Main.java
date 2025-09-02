import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

System.out.println("-------MENU DE CALCULADORA-------\n");
System.out.println("1.Sumar");
System.out.println("2.Restar");
System.out.println("3.Multiplicar");
System.out.println("4.Dividir");
System.out.println("5.Salir\n");
System.out.println("Escoge una opcion");
int opcion = lectura.nextInt();

switch(opcion){
    case 1:
        suma sumar= new suma();
        System.out.println("----SUMAR----\n");
        System.out.println("Ingresa el primer número:\n");
        suma.setNum
        System.out.println("Ingresa el segundo número:\n");


        break;
    case 2:
        System.out.println("----RESTAR----\n");
        break;
    case 3:
        System.out.println("----MULTIPLICAR----\n");
        break;
    case 4:
        System.out.println("----DIVIDIR----\n");
        break;
    case 5:
        System.out.println("SALIR....\n");
        break;
    default:
        break;


    }
}
}
