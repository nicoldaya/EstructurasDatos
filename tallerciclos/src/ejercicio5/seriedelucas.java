
package ejercicio5;
import javax.swing.JOptionPane;
public class seriedelucas {
    public static void main(String[]args){
    int n=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el numero limite"));
    int h=2;
    int t=1;
    int y ;
    for(int i=0;i<=n;i++)
    {
        System.out.println(h);
        y=h+t;
        h=t;
        t=y;
        
    }
}
}
