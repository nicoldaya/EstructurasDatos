
package javaapplication11;
import java.util.Scanner;
public class JavaApplication11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: sumaar\n 2: restar");
        int op = sc.nextInt();
        switch(op){
            case 1:
                System.out.println("ingrese los dos numeros");
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                int suma = n1 + n2;
                System.out.println("la suma es "+suma);
                break;
            case 2:
                System.out.println("ingrese los dos numeros");
                int n3 = sc.nextInt();
                int n4 = sc.nextInt();
                int resta = n3 - n4;
                System.out.println("la resta es "+resta);
                break;
            default:
                System.out.println("ingreso una opcion incorrecta");
             
        }
    }
    
}
