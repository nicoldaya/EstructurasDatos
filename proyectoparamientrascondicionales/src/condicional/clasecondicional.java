
package condicional;

import javax.swing.JOptionPane;


public class clasecondicional {

public void adivina(){
    int dato=8;
int numero= Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
if (numero==dato){
JOptionPane.showMessageDialog(null, "lo adivinaste");

}
else if (numero>dato){
JOptionPane.showMessageDialog(null, "debe ser menor a 10");

}
else{
JOptionPane.showMessageDialog(null, "no es ese numero");

} 

    
}
}
