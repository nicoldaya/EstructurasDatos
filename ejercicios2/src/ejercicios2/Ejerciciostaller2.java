
package ejercicios2;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejerciciostaller2 {

   
    public static void main(String[] args) {
       
         
            Scanner entrada=new Scanner (System.in);
           int [] numero=new int [10];
           Random rand=new Random();
           for (int i = 0; i < numero.length; i++) {
            numero[i]=rand.nextInt(11);  
        }  
           JOptionPane.showMessageDialog(null,"numeros aleatorios generados");
           for (int num:numero){
               JOptionPane.showMessageDialog(null,"" +num);
           if(num==5){
               JOptionPane.showMessageDialog(null,"se encontro un 5");
               break;
           }    
           }       
  }    
}
