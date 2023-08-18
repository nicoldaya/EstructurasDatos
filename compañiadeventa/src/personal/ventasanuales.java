
package personal;

import javax.swing.JOptionPane;

public class ventasanuales {
   
    //compañia de venta de motos
    int n1;
    int moto;
    int salarioSin;
    int precio;
    
    
    
    public void calcularsalario(){
        n1=Integer.parseInt(JOptionPane.showInputDialog("cuantas motos vendiste"));
        salarioSin=1000+(150*n1);
    }
    public void conmision(){
        moto=Integer.parseInt(JOptionPane.showInputDialog("que precio tiene las motos?"  ));
        precio=(int) ((salarioSin*0.5)+(salarioSin));
        
    }
   public void imprimir(){
       JOptionPane.showMessageDialog(null,"tu salario sin conmision es: "+salarioSin);
       JOptionPane.showMessageDialog(null,"tu salario con comision es: " +precio);
   } 
}
