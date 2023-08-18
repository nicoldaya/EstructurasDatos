
package claseconstru;

import javax.swing.JOptionPane;

// principal de estudiante
public class mainestudiante {
public static void main(String[] args){
int num1= Integer.parseInt(JOptionPane.showInputDialog("digite su primera nota"));
int num2= Integer.parseInt(JOptionPane.showInputDialog("digite su primera nota"));
int num3= Integer.parseInt(JOptionPane.showInputDialog("digite su primera nota"));
int prome=(num1+num2+num3)/3;
estudiante op= new estudiante("julian " , 19 , " masculino ", prome);

op.mostrardatos();

}
}
