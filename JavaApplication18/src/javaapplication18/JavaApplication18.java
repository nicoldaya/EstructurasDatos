
package javaapplication18;

import java.util.Scanner;

public class JavaApplication18 {

   
    public static void main(String[] args) {
       
        
        // Calcular el area de un circulo, pidiendo el radio de este.
        
        Scanner entrada=new Scanner (System.in);
        double a,r;
        System.out.println("introduce el radio de un circulo");
        r=entrada.nextDouble();
        a=Math.PI*(r*r);
        System.out.println("el area de una circunferencia de radio "+r+  " es: "+a);
        
        
    }
    
}
