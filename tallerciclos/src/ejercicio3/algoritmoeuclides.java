
package ejercicio3;

import javax.swing.JOptionPane;

public class algoritmoeuclides {
    public static void main(String[]args){
        int num = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero"));
    JOptionPane.showMessageDialog(null, "el maximo comun divisor es "+obtener(num,num2));
    }

static int obtener(int num, int num2){
    if (num2==0){
     return num;   
    }else{
    return obtener(num2,num%num2);
    
    }  
}}
    
    
    
   
