
package ejercicio6;

import javax.swing.JOptionPane;

public class aprenderAsumar {
 public static void main (String[]args){    
    int suma;
    int respuesta; 
    int limite=Integer.parseInt(JOptionPane.showInputDialog("ingrese el limite de sumas que queres realizar "));
    for(int i=1;i<=limite;i++){
int aleatoria = (int) (Math.random()*999);
int aleatoria2= (int) (Math.random()*999);
do{
suma= aleatoria+aleatoria2;
JOptionPane.showMessageDialog(null, "digite el resultado de la siguiente suma");
respuesta=Integer.parseInt(JOptionPane.showInputDialog(aleatoria+ " + "+aleatoria2 ));
if (respuesta==suma){
JOptionPane.showMessageDialog(null, "si sabes suma, ¡genial!");
}else{
JOptionPane.showMessageDialog(null, "ta mal");
}

}while(suma!=respuesta);

}
}}