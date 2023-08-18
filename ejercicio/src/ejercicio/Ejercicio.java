
package ejercicio;
import java.util.Scanner;

public class Ejercicio {

   
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("ingrese un numero ");
    int num=sc.nextInt();
        if ((num>0)&&(num<=10)){
        
     System.out.println("le numero es de 1 cifra");}
        
        else if ((num>=10)&&(num<=99))
        {
            System.out.println("el numero es de 2 cifras");
        }
        else if ((num>=100)&&(num<=999)){
            System.out.println("el numero es de 3 cifras ");
        }
        else if((num>=1000)&&(num<=9999)){
            System.out.println("el numero es de 4 cifras  ");
        }
        else if ((num>=10000)&&(num<=99999))
        {
            System.out.println("el numeroes de 5 cifras 2092");
        }
    }
    
}
