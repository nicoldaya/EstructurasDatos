
package clase;

import javax.swing.JOptionPane;

public class operacionnicol {
    //atributos
    int numero1;
            int numero2;
           int suma;
           int resta;
           int multiplicacion;
           int division;
           //metodos 
           //metodo para pedirle al usuario que nos digite 2 numeros
           public  void leerNumeros(){
               numero1=Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
            
              numero2=Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
           }
  public void sumar(){
      suma=numero1+numero2;
     
  }         
  public void resta(){
      resta=numero1-numero2;
  }
  public void multiplicacion(){
      multiplicacion=numero1*numero2;
  }
  public void division(){
      division=numero1/numero2;
  }
  public void mostrarResultados(){
      System.out.println("la suma es: "+suma);
      System.out.println("la resta es:" +resta);
            System.out.println("la multiplicacion es:" +multiplicacion);
      System.out.println("la division es:" +division);

  }   
}
