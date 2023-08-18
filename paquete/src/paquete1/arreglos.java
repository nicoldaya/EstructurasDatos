
package paquete1;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class arreglos {
    
    public static void main (String [] args){
        /*
        Scanner entrada= new Scanner (System. in);
        float [] numeros =new float[5];
        System.out.println("digite cada uno de los numeros");
        for (int i = 0; i < 5;i++) {
        System.out.print((i+1) +".digite cada uno");
        numeros[i]= entrada.nextFloat();
        }
        System.out.println("\nImprimir los numeros del arreglo");
        for (int i = 0; i < 5;i++) {
        System.out.print("" +numeros[i]);
        }
        }//main
         */
        int elementos;
        elementos= Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad"));
        String apodos[]= new String[elementos];
        JOptionPane.showMessageDialog(null, "digite cada uno de los apodos");
        for (int i = 0; i < elementos; i++) {
        JOptionPane.showMessageDialog(null, (i+1)+". digite cada uno");
         apodos[i]= JOptionPane.showInputDialog(apodos);
        }
            for (int i = 0; i <elementos; i++) {
        JOptionPane.showMessageDialog(null,"" + apodos[i]);
            }
        
    
    }
}
        
        
        
        

        
