
package datos4;

// Diseñe un método que imprima los datos de una persona ingresados por teclado e indicar si es mayor o menor de edad.

import java.util.Scanner;


public class princi5 {
    Scanner informe=new Scanner(System.in);
    public void persona1(int edad){
        System.out.println("ingrese su edad");
        edad=informe.nextInt();
        if (edad>=18){
            System.out.println("eres mayor de edad");
        }else 
            System.out.println("eres menor de edad");
    }
    
    
    
}
