
package ejerciciosfor;




import javax.swing.JOptionPane;


public class Ejerciciostaller {
    
 
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"escriba 5 nombres");
        
    String nombres[]=new String[5];
        for (int i = 0; i < nombres.length; i++) {
            
            nombres[i]=JOptionPane.showInputDialog("digite el nombre");
        }
        JOptionPane.showMessageDialog(null,"los nombres que digito son:");
        for (String nombre:nombres) {
            JOptionPane.showMessageDialog(null,  nombre);    
        }
        
   }
 
    }   


