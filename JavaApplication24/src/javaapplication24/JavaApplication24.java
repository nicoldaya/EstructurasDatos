
package javaapplication24;

import java.util.Scanner;


public class JavaApplication24 {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        System.out.println("digite el numero de estudiantes");
    int num= entrada.nextInt();
    if (num>=100){
    System.out.println( "debe pagar "+num*65+ " Euros");
   
    } else if ((num>=50)&&(num<=99)){
    System.out.println( "debe pagar "+num*70+ " Euros");
    }
    else if ((num>=30)&&(num<=49)){
    System.out.println( "debe pagar "+num*95+ " Euros");
    }
    else if (num<30){
    System.out.println( "debe pagar 4000 Euros");
    }
    }
    
    }



    
    
