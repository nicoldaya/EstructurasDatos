
package javaapplication15;

import java.util.Scanner;


public class JavaApplication15 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada= new Scanner(System.in);
        System.out.println(" ingrese su edad");
   
        int edad= entrada. nextInt();
        
            if (edad>=18){
                System.out.println("es mayor de edad ");
                
            }
                
            if ((edad.equalsIgnoreCase("opcion1")){
                    
                System.out.println("¿tienes carnet de conducir o no?");
                int op= entrada. nextInt();
                System.out.println(" opcion 1. si.");
                int opcion1= entrada.nextInt();
                System.out.println("puedes conducir");
                System.out.println("opcion 2. no ");
                int opcion2= entrada.nextInt();
                System.out.println("no puedes conducir");
                
                
               
            }else{
                System.out.println("es menor de edad");
            }
            
    
               
        
        
        
        
    }     
    
}
