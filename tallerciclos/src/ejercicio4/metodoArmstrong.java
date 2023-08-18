
package ejercicio4;

import javax.swing.JOptionPane;


public class metodoArmstrong {
      public static void main(String[] args) {
   int num =Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un numero"));

      int sum = 0;
      int originalNum = num;
      int digits = String.valueOf(num).length();
      
      while (num > 0) {
         int remainder = num % 10;
         sum += Math.pow(remainder, digits);
         num /= 10;
      }

      if (sum == originalNum) {
         JOptionPane.showMessageDialog(null,originalNum + " es un número de Armstrong.");
      } else {
        JOptionPane.showMessageDialog(null,originalNum + " no es un número de Armstrong.");
      }
   }
}






