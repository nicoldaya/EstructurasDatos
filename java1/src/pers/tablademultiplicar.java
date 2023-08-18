
package pers;

import java.util.Scanner;


public class tablademultiplicar {
    Scanner multi=new Scanner(System.in);
    public void datos (int num1){
        System.out.println("ingrese un numero");
        num1=multi.nextInt();
        for(int a=1;a<=12;a++){ 
 int resul=a*num1;  
System.out.println(" º "+ a + " x " +num1+ " = " +resul); 
 } 
    }
    
}
