
package javaapplication21;

import javax.swing.JOptionPane;


public class JavaApplication21 {

    public static void main(String[] args) {
       
        /*
        int num1=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese un numero"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese un numero"));
        if (num1==num2){
               JOptionPane.showMessageDialog(null, "son iguales");
  }
        else {
    
        if (num1>num2){
            JOptionPane.showMessageDialog(null, "el numero mayor es:" +num1);
            
            }else{
            JOptionPane.showMessageDialog(null, "numero menor es:" +num2);
        }
            
       */
        
        /*
        double num1 =Double.parseDouble ( JOptionPane.showInputDialog(null, " ingresa un numero"));
        
        double num2  =Integer.parseInt (JOptionPane.showInputDialog(null, "ingresa un numero"));
         if (num2==0){
             JOptionPane.showMessageDialog(null, "error");
             
    
}
         else{
             JOptionPane.showMessageDialog(null, "la division de los dos numeros es:"  +num1/num2);
              
                  
            
}
*/
       String palabra=JOptionPane.showInputDialog(null,"ingrese el nombre de una fruta");
            
        if ((palabra.equalsIgnoreCase("manzana")) || (palabra.equalsIgnoreCase("naranja" ))||(palabra.equalsIgnoreCase("pera")))
        {
                String op=JOptionPane.showInputDialog(null,"1)Cocida      2)Cruda");
                if((op.equalsIgnoreCase("cocida"))||(op.equalsIgnoreCase("cruda")))
                        {
               if (op.equalsIgnoreCase("cocida")) 
            {
                JOptionPane.showMessageDialog(null,"la fruta "+palabra+"la prefieres "+op);
                
            }
                else
            {
                JOptionPane.showMessageDialog(null,"la fruta "+palabra+"la prefieres "+op);
                
            }
                }
               else{
                        JOptionPane.showMessageDialog(null,"la opcion no es valida");
                       }
            
        }
        else
        {
             JOptionPane.showMessageDialog(null,"la fruta no se reconoce");
        }
    }}
        
        
     

