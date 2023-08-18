
 
package javaapplication6;

import java.util.Scanner;

public class JavaApplication6 {

    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner entrada= new Scanner ( System.in);
        System.out.println("ingrese un numero entero:");
       int num = entrada.nextInt();
        int absoluto = (int) Math.abs(num);
        num-=num;
        System.out.println("El valor absoluto es: "  + absoluto + " y su resta es: " +num);
    
    }
    
}
