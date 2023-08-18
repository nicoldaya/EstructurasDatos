
package javaapplication7;

import java.util.Scanner;


public class empleados {

    
    public static void main(String[] args) {
    Scanner entrada= new Scanner (System.in);
    int horas,salariobase,extra;
    int n=2;
        System.out.println("ingrese el salario base, las horas normales y las horas extra");
   salariobase= entrada.nextInt();
   horas = entrada.nextInt();
   extra= entrada.nextInt();
    salariobase*=horas;
    extra*=n;      
    salariobase*=extra;
    
            System.out.println("su total con horas extra es: "+salariobase);

        
    }
    
    
    
}
