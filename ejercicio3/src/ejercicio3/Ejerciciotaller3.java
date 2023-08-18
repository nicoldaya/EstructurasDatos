
package ejercicio3;

import javax.swing.JOptionPane;


public class Ejerciciotaller3 {

   
    public static void main(String[] args) {
   
        char[]letrica=new char[7];
        for (int i = 0; i < letrica.length; i++) {
            JOptionPane.showMessageDialog(null, "digite una letra");
       letrica[i]=JOptionPane.showInputDialog("Digite la letra").charAt(0);
        }
       
            for (char vocales:letrica) {
              
                    
                if (vocales== 'a' || vocales == 'e' || vocales == 'i' || vocales == 'o' || vocales == 'u') {
                JOptionPane.showMessageDialog(null, "la letra "+vocales+" digitada es una vocal");
                }else{ 
                JOptionPane.showMessageDialog(null, "la letra "+vocales+" digitada NO es una vocal");
                }
              if (vocales>=0){
                JOptionPane.showMessageDialog(null, " Has digitado un numero, vuelve a intentarlo");
                 
              }
              
            }
      
        }
    }
    

