
package javaapplication25;

import javax.swing.JOptionPane;


public class JavaApplication25 {

    
    public static void main(String[] args) {
   int numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));

        if(numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, numero + " es par");
        } else {
            JOptionPane.showMessageDialog(null, numero + " es impar");
        }
       
    }
}
    
    

