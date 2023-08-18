
package datos;

import java.util.Scanner;
import javax.swing.JOptionPane;




   // metodos
 /*
     public void datos(String nombre,String apellido,int edad){
    JOptionPane.showMessageDialog(null, "su nombre es: "+nombre);
    JOptionPane.showMessageDialog(null, "su apellido es: "+apellido);
    JOptionPane.showMessageDialog(null, "su edad es: "+edad); 
     }
    }






*/

public class metododatos {
   // metodos
   Scanner informe = new Scanner(System.in);
     public void datos(String nombre,String apellido,int edad){
    
         System.out.println("su nombre es:");
         nombre=informe.next();
         System.out.println("su apellido es:" );
         apellido=informe.next();
         System.out.println("su edad es:"  );
         edad=informe.nextInt();
     System.out.println("Los datos del usuario son "+nombre+" "+apellido+" y su edad es "+edad); 
     }
}
           



