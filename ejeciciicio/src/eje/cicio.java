
package eje;

import javax.swing.JOptionPane;


public class cicio {
double radio;
String circulo;
String cuadrado;
String triangulo;
int altura;
int base;
int lado;
int lado1;
double calcular;
        
public void calcularadio(){
    radio= Double.parseDouble(JOptionPane.showInputDialog("digitar radio"));
   calcular= Math.PI * Math.pow(radio, 2);
   JOptionPane.showMessageDialog(null,"" +calcular);
}
public void calculatriangulo(){
   base=Integer.parseInt(JOptionPane.showInputDialog("digitar la base"));
   altura=Integer.parseInt(JOptionPane.showInputDialog("digitar la altura"));
   calcular=(base*altura)/2;
   JOptionPane.showMessageDialog(null,""+calcular );
}
public void calcularcuadrado(){
    lado=Integer.parseInt(JOptionPane.showInputDialog("digitar el lado"));
    lado1=Integer.parseInt(JOptionPane.showInputDialog("digitar el lado1"));
    calcular=lado*lado1;
    JOptionPane.showMessageDialog(null, "" +calcular);
    
}
}
  