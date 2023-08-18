
package mientras;

import java.util.Scanner;

public class clasemientras {
    /*
    public static void main(String []args){
    int i=1;
    
    while(i<=10){
        System.out.println(i);
        i++;
        
    }
    }
    */
    /*
    public static void main(String [] args){
        Scanner entrada= new Scanner(System.in);
        System.out.println(" ingrese un numero ");
        int num;
        num= entrada.nextInt();
        int i = 1;
        
        
        while(i<=num){
            System.out.println(i);
            i++;
        }
        
    }*/
    
    
    
    //leer un numero y mostrar su cuadrado,repetir el proceso hasta que se digite un numero negativo
    public static void main(String [] args){
        int num;
        int i;
        int cuadrado;
        Scanner entrada=  new Scanner (System.in);
    System.out.println("ingrese un numero ");
    
    num=entrada.nextInt();
    while(num>=0){
        cuadrado=(int)Math.pow(num,2);
            System.out.println("el " +num+ "elevado a la 2 es "+cuadrado);
            
            System.out.println("digite un numero");
            
    }    
    }
      
}
    

