
package javaapplication22;

import javax.swing.JOptionPane;

public class JavaApplication22 {

    public static void main(String[] args) {
    
        
        int numero;
numero=  Integer.parseInt(JOptionPane.showInputDialog("digite un numero" ));
        
        if (numero > 0)
        {
            JOptionPane.showMessageDialog(null,"el numero es positivo ");
            
        }
            else if (numero < 0){
        
            JOptionPane.showMessageDialog(null,"el numero es negativo ");
            }
         else
        {
            JOptionPane.showMessageDialog(null, " es igual a  0");
        }
        
        
        
        
    }
    
}
