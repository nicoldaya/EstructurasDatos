
package calcu;

import javax.swing.JOptionPane;


public class mainuwu {
 public static void main(String[]args){
     
 int n1 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
 int n2= Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
 
 clasecalcu op = new clasecalcu();
 op.sumar(n1, n2);
 op.resta(n1, n2);
 op.multiplicacion(n1, n2);
 op.division(n1, n2);
 op.mostrarop();
 }   
}
