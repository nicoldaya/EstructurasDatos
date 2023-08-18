
package datosfamiliares;

import javax.swing.JOptionPane;

public class datos {
    //atributos
    String nombrem;
    int edadm;
    String nombrep;
    int edadp;
    public void nombre()
{
nombrem=JOptionPane.showInputDialog(null,"ingrese el nombre de su madre ");
nombrep=JOptionPane.showInputDialog(null,"ingrese el nombre de su padre ");

}
    public void edad()
    {
        edadm=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la edad de su madre "));
        edadp=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la edad de su padre "));

    }
    public void mostrar()
    {
       JOptionPane.showMessageDialog(null,"la edad de su madre es"+edadm+"y la edad de su padre es"+edadp);
         JOptionPane.showMessageDialog(null,"el nommbre de su madre es"+nombrem+"y el nombre de su padre es"+nombrep);

    }
}

