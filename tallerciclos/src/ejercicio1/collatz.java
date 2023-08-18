
package ejercicio1;

import javax.swing.JOptionPane;
public class collatz {
    
    public static void main(String[]args)
    {
        int contador=0;
    int num=Integer.parseInt(JOptionPane.showInputDialog("por favor ingrese un numero"));
    
   if(num>=1){
       while(num!=1)
            
   
    {
       if (num%2==0)
       {
        num/=2;
        JOptionPane.showMessageDialog(null, num+" ");   
           
       }
       else
       {
          num=(num*3)+1;
          JOptionPane.showMessageDialog(null, num+" ");  
            
       }
        contador++;
        
   
    }
        
       JOptionPane.showMessageDialog(null, "Pasos necesarios para llegar a 1 :  " + contador);
        
   }
   else{
       JOptionPane.showMessageDialog(null,"los collatz no se pueden hacer con numero negativo" );
   }
       
    
    
        
   
    
    
    
    
    
    
    
}
}
