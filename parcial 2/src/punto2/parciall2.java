
package punto2;

import java.util.Scanner;


public class parciall2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        System.out.println("ingrese la cantidad de numeros");   
            int cantidad=entrada.nextInt();
            int numeros[]=new int[cantidad];
            for (int i = 0; i < cantidad; i++) {
                System.out.println("ingrese el numero " +(i+1)+"");
                numeros[i]=entrada.nextInt();
               
        }
            int suma=0;
            for (int num:numeros) {
            suma+=num;
        }
            double promedio =(double)suma/cantidad;
            System.out.println("el promedio de los numeros es:"+promedio);
            
        
    }
    
}
