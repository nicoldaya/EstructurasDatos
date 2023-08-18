
package javaapplication23;

import javax.swing.JOptionPane;


public class JavaApplication23 {

    public static void main(String[] args) {
    int num1= Integer.parseInt(JOptionPane.showInputDialog(null,"digite nota"));
    int num2 = Integer.parseInt(JOptionPane.showInputDialog(null,"digite edad"));
    String sexo=JOptionPane.showInputDialog(null,"digite sexo");
    if ((num1>=5)&&(num2>=18)){
    
    if (sexo.equalsIgnoreCase("F")){
      JOptionPane.showMessageDialog(null, "ACEPTADA");
    } 
    else {JOptionPane.showMessageDialog(null, "POSIBLE");
    }
    }else {JOptionPane.showMessageDialog(null, "NO ACEPTADA");
    }   }
    
}
