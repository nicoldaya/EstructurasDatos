
package ejercicio2;

import javax.swing.JOptionPane;


public class secuenciaulam {
public static void main(String[]args){
    
     int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número n: "));
     int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número n donde quiere inciar: "));
      
             
      JOptionPane.showMessageDialog(null,"Los primeros " + n + " números de la sucesión de Ulam son:");
      JOptionPane.showMessageDialog(null, num + " ");

      while (n >=1) {
         if (num % 2 == 0) {
            num /= 2;
         } else {
            num = (num*3) + 1;
         }
         JOptionPane.showMessageDialog(null, num + " ");
         n--;
      }
   }




    
    
    
    
    
}
