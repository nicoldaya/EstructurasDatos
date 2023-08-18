
package pareseimpares;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class arreglos {
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in);
        int pares=0;
        int impares=0;
        int elementos;
        elementos   = Integer.parseInt(JOptionPane.showInputDialog("digite un numero "));
       int[]numeros =new  int[elementos];
       JOptionPane.showMessageDialog(null, "digite los numeros del arreglo");
        
       for (int i = 0; i < elementos; i++) {
           JOptionPane.showMessageDialog(null,(i+1)+".Digite un numero");
             numeros[i]= entrada.nextInt();  
        }//for
        for (int i = 0; i < elementos; i++) {
             if (numeros[i] % 2==0){
         pares++;
                
                 
        }else{
 impares++;

             }
  
        }
        JOptionPane.showMessageDialog(null, "la cantidad de numeros pares es: "+pares+" y la cantidad de numeros de impares es: "+impares);
                
    }
}


    
    
    