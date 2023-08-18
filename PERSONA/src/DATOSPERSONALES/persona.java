

package DATOSPERSONALES;

import javax.swing.JOptionPane;



public class persona {
    
    // ATRIBUTOS
    String nombre;
    String genero;
   int edad;
    
   
   public void saludar(){
         persona persona1=new persona();
         persona1.nombre="nicol";
   JOptionPane.showMessageDialog(null, "hola,que tal "  +persona1.nombre);
   }
  public void datosp(){
      persona persona1=new persona();
         persona1.genero= "femenino";
        persona1.edad=18;
        
        JOptionPane.showMessageDialog(null, "tu edad es  "  +persona1.edad+"y tu genero es"+persona1.genero);
     
        
      }   
  
}
 
  
            

