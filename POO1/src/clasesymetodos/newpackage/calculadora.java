
package clasesymetodos.newpackage;


import javax.swing.JOptionPane;



public class calculadora {
    int num1,num2,suma,resta,multiplicacion;
    public static void SolicitarNumeros()
    {
        int num1 = Integer.parseInt( JOptionPane.showInputDialog(null, "ingrese un numero"));
        int num2 = Integer.parseInt( JOptionPane.showInputDialog(null, "ingrese un numero"));
    }
       public void sumar(){
           suma=num1+num2;
       }
            public void resta(){
                resta= num1-num2;
            }
         public void multiplicacion(){
             multiplicacion=num1*num2;
         }
          public void Imprimir(){
              JOptionPane.showMessageDialog(null,"el resultado de la suma es:" +suma);
             JOptionPane.showMessageDialog(null, "el resultado de la suma es:" +resta);
              JOptionPane.showMessageDialog(null,"el resultado de la suma es:" +multiplicacion);
          
          }
         }
       
   

    

