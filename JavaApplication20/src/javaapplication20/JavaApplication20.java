
package javaapplication20;

import javax.swing.JOptionPane;


public class JavaApplication20 {

    public static void main(String[] args) {
  
        
        JOptionPane.showMessageDialog(null,"Escoja su destino");
    
        int num1=Integer.parseInt(JOptionPane.showInputDialog("1)América del Norte/n  2)América Central  3)América del Sur 4)Europa  5) Asia " ));
        
        if ( num1 ==1)
        {
        JOptionPane.showMessageDialog(null,"El costo america del norte es de $24.000 por K.G");
        double kg = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio de tu paquete"));
            if ((kg<=5)&&(kg>=1))
            {
                double total=(kg*24.00);
                JOptionPane.showMessageDialog(null,"El costo a pagar por"+kg+ "de quilos es de  "+ total);    
            }
            else{
            
            JOptionPane.showMessageDialog(null,"Tu paquete no pudo ser enviado por las  politicas de privacidad de la empresa"); 
            
            }
        } 
        else
        {
          if ( num1 ==2)
        {
        JOptionPane.showMessageDialog(null,"El costo america central es de $20.000 por K.G");
        double kg = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el precio de tu paquete"));
            if ((kg<=5)&&(kg>=1))
            {
                double total=(kg*24.00);
                JOptionPane.showMessageDialog(null,"El costo a pagar por"+kg+ "de quilos es de  "+ total);    
            }
            else{
            
            JOptionPane.showMessageDialog(null,"Tu paquete no pudo ser enviado por las  politicas de privacidad de la empresa"); 
            
            }
        }       
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
            
            
            
        }
    }
    
  
    

