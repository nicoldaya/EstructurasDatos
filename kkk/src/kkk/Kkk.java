
package kkk;
import javax.swing.JOptionPane;
public class Kkk {

    
    public static void main(String[] args) {
int num=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
 if (num>0){
     if ((num>0)&&(num<=10)){
         
         JOptionPane.showMessageDialog(null,"le numero es de 1 cifra");}
     
     else if ((num>=10)&&(num<=99))
     {
         JOptionPane.showMessageDialog(null,"le numero es de 2 cifra");
     }
     else if ((num>=100)&&(num<=999)){
         JOptionPane.showMessageDialog(null,"le numero es de 3 cifra");
     }
     else if((num>=1000)&&(num<=9999)){
         JOptionPane.showMessageDialog(null,"le numero es de 4 cifra");
     }
     else if ((num>=10000)&&(num<=99999))
     {
         JOptionPane.showMessageDialog(null,"le numero es de 5 cifra");
     }
 }
         else  {
     
     JOptionPane.showMessageDialog(null, "el valor que ha ingresado es cero");}
        }
    }
    

