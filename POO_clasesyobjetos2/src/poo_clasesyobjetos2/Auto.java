
package poo_clasesyobjetos2;
//clase

import java.util.Scanner;


public class Auto {
    //crear variables de la clase 
    String marca;
    int modelo;
    String color;
    int velocidad;

    
    Scanner entrada=new Scanner (System.in);
    
    
    //crear metodo arracar autos 
    public void arrancarcla(){
        System.out.println("el auto ha arrancado");
           
    }
    public void frenar(){
        System.out.println("el auto ha frenado");
    }
   
    public void turbo(){
        System.out.println("ingrese la velocidad");
        velocidad =entrada.nextInt();
        
        if(velocidad >=220){
            System.out.println("el turbo se ha activado");
            
        }else{
            System.out.println(" el turbo no se activo");
        }
    }
}
