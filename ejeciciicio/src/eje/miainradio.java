
package eje;

import javax.swing.JOptionPane;


public class miainradio {
public static void main (String[] args){
cicio  op = new cicio();
    String figura = JOptionPane.showInputDialog("Ingrese la figura para calcular su área (circulo, cuadrado o triangulo):");

    if (figura.equalsIgnoreCase("circulo")) {
        op.calcularadio();
        
    }else if (figura.equalsIgnoreCase("triangulo")){
            op.calculatriangulo();
            }else if (figura.equalsIgnoreCase("cuadrado")){
            op.calcularcuadrado();
    }else {
        JOptionPane.showMessageDialog(null, "opcion incorrecta");
    }        
        
   
}}
