
package javaapplication26;

import java.util.Scanner;


public class JavaApplication26 {


    public static void main(String[] args) {
        //Realiza un programa en java que calcule la aceptación de una solicitud en base a los siguientes parámetros: edad, nota y sexo.
//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//* Otros casos -> NO ACEPTADA

 Scanner entrada= new Scanner (System.in);
        System.out.println("ingrese \n la edad \n  nota \n  sexo");
        int edad = entrada.nextInt();
        int nota = entrada.nextInt();
        String sexo= entrada.next();    
        if ((nota>=5)&&(edad>=18)&&(sexo.equalsIgnoreCase("masculino "))){
            
            System.out.println(" es posible ");
            
        }else{
            if ((nota>=5)&&(edad>=18)&&(sexo.equalsIgnoreCase("femenino"))){
                System.out.println(" aceptada");
            }else{
                System.out.println("no aceptado ");
            }
        }
        }
        
     
    }
    

