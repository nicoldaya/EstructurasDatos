
package personas;

import javax.swing.JOptionPane;


public class atributosconstructores {
    String nombre;
    int edad;
    
    public atributosconstructores(String _nombre, int _edad ){
        nombre=_nombre;
        edad=_edad;
       
    }
   public void mostrarresultados(){
       JOptionPane.showMessageDialog(null, "tu nombre es: " +nombre+ "\ntu edad es: "  +edad);
   }
}
