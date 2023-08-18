
package javaapplication27;

import javax.swing.JOptionPane;


public class JavaApplication27 {

    
    public static void main(String[] args) {
   
        
        int servicio= Integer.parseInt(JOptionPane.showInputDialog("ingrese una opcion \n 1)particular   \n 2) publico \n 3)Motocicleta"));
        int valuo= Integer.parseInt(JOptionPane.showInputDialog("ingresa el valuo o cilindraje del vehiculo"));
        if(servicio==3){
        if (servicio==2){
        if (servicio==1){
     if (valuo<=39051000){
         
         JOptionPane.showMessageDialog(null,"el impuesto a pagar es: "+valuo*0.15);}
     
     else if ((valuo>39051000)&&(valuo<87866000))
     {
         JOptionPane.showMessageDialog(null,"el impuesto a pagar es: "+valuo*0.25);
     }
     else if (valuo>=87866000){
         JOptionPane.showMessageDialog(null,"el impuesto a pagar es: " + valuo*0.35);
     }
     
     
     }
    
        
       
        }if (valuo>=200){
         
         JOptionPane.showMessageDialog(null,"el impuesto a pagar es: "+valuo*0.05);} 
        
        
        }if (valuo<=125){
            
         JOptionPane.showMessageDialog(null, "no aplica tarifa");
        }else  {
                JOptionPane.showMessageDialog(null,"el impuesto a pagar es: "+valuo*0.15);
        }
        
        
        
                
}
    }
    
        


    

