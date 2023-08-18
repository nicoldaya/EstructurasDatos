
package ejercicios;

import java.util.Arrays;
import java.util.Scanner;


public class num1 {
    public static void main(String []args){
Scanner entrada= new Scanner    (System.in); 

       
        int[] num =new int [10];
System.out.println("ingrese los numeros");
        for (int i = 0; i < 10; i++) {
       num[i]=entrada.nextInt();         
             
  }
       System.out.println("los numeros del arreglo son: "+Arrays.toString(num));  
}
}
    