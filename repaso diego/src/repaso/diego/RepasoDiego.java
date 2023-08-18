
package repaso.diego;

import javax.swing.JOptionPane;







public class RepasoDiego {

   
    public static void main(String[] args) {
  
int num1=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero para mirar si es par o impar"));
int resultado=Math.ceilMod(num1,2);
if(resultado==0)
{
    
    JOptionPane.showMessageDialog(null,"El numero "+num1+ " es par");
    
}
else
{
    JOptionPane.showMessageDialog(null,"El numero "+num1+" es impar ");


}       

        
        
        
        
        
        
        
        
        
        
    }
}
            