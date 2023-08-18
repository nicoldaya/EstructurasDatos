

package condicionals;

import java.util.Scanner;
import javax.swing.JOptionPane;

//recibir y entrada

public class Condicionals {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
      /*
        int numero;
        int dato=10;
        numero=  Integer.parseInt(JOptionPane.showInputDialog(dato));
        
        if (numero == dato)
        {
            JOptionPane.showInputDialog(null,"el numero es igual a 10");
            
        }  else
        {
            JOptionPane.showInputDialog(null, " el numero NO es igual a 10");
            
        }
            
       */
      
/*     
int numero;
int edad = 18;
numero=  Integer.parseInt(JOptionPane.showInputDialog("digite su edad" ));
        
        if (numero >= edad)
        {
            JOptionPane.showInputDialog(null,"es mayor de edad");
            
        }  else
        {
            JOptionPane.showInputDialog(null, " es menor de edad");
       
*/

//condicional doble
/*
int numero;
numero=  Integer.parseInt(JOptionPane.showInputDialog("digite un numero" ));
        
        if (numero > 0)
        {
            JOptionPane.showMessageDialog(null,"el numero es positivo ");
            
        }
            else if (numero < 0){
        
            JOptionPane.showMessageDialog(null,"el numero es negativo ");
            }
         else
        {
            JOptionPane.showMessageDialog(null, " es igual a  0");
        }
*/
// recibir una letra por teclado 
/*
char letra;
letra= JOptionPane.showInputDialog("letra" ).charAt(0);
        if (Character.isUpperCase(letra))
        {
                     JOptionPane.showMessageDialog(null, " es Mayuscula");  
 
        }
       else
        {
          JOptionPane.showMessageDialog(null, " es minuscula");  
        }
        
        */

        /*
        char letra;
        
letra= JOptionPane.showInputDialog("letra" ).charAt(0);
        if (letra == 'a' 'e' 'i' 'o' 'u')
        {
                     JOptionPane.showMessageDialog(null, " es vocal");  
 
        }
       else
        {
          JOptionPane.showMessageDialog(null, " es consonante");  
        }
        
       */
        /*
        Scanner entrada= new Scanner (System.in);
              System.out.println(" digite un numero del 1 al 3,segun el dia");
        int op = entrada.nextInt();
        switch (op){
            case 1: System.out.println("el dia es viernes");
            break;
            case 2: System.out.println("el dia es sabado ");
            break;
            case 3: System.out.println("el dia es domingo");
            break;
            default:
                System.out.println("es dia de semana");
                break;
                
              
                 
        }
        }
        */
        /*
        int horasT  ;
         float  salarioTotal;

horasT=  Integer.parseInt(JOptionPane.showInputDialog("digite las horas trabajadas" ));
        
        if (horasT <= 40)
        {
   
        salarioTotal=horasT*16;
            
            
        }  else
           
        {
        salarioTotal=(horasT*16)+((horasT-40)*20);
        }
            JOptionPane.showMessageDialog(null, " el salario total es: " + salarioTotal);
       
       */
        
        /*
          int numero  ;
          float descuento;
         

numero=  Integer.parseInt(JOptionPane.showInputDialog("digite el valor de su compra" ));
        
        if (numero >= 300)
        {
   
        descuento= (float) (numero-(numero*0.20));
        
        JOptionPane.showMessageDialog(null, " el descuento es: " + descuento);    
            
        }  else
           
        {
  
            JOptionPane.showMessageDialog(null, "mantiene el mismo valor " + numero);
       
      */
        /*
         int n1,n2,n3  ;
         n1=Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
    n2=Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
    n3=Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
   

        
        if ((n1> n2)&&(n2>n3))
        {
   
        JOptionPane.showMessageDialog(null, "el orden de mayor a menor es "+n1+" "+n2+" "+n3 );    
            
        }  else if ((n2> n1)&&(n1>n3)){
           JOptionPane.showMessageDialog(null, "el orden de mayor a menor es "+n2+" "+n1+" "+n3 ); 
        }
        
        else if ((n3> n1)&&(n1>n2)){
           JOptionPane.showMessageDialog(null, "el orden de mayor a menor es "+n3+" "+n1+" "+n2 ); 
        }
        {
            JOptionPane.showMessageDialog(null, "mantiene el mismo valor " );
        */
        
/*
    String op= JOptionPane.showInputDialog(null,"digite un numero" );
    int number =Integer.parseInt(op);
    
    if ((number>= 0)  &&(number<=99999 )){
    
    }if (number<10){
    JOptionPane.showMessageDialog(null, "las cifras son 1");
            
    }else if (number<100){         
    JOptionPane.showInternalMessageDialog(null, "las cifras son 2");
    
    }else if (number<1000){
    JOptionPane.showMessageDialog(null, "las cifras son 3");
    
    }else if (number<99999){
    JOptionPane.showMessageDialog(null, "las cifras son 4");
    }
    
        */

Scanner entrada = new Scanner ( System. in );
int dia, mes , año ;
        System.out.println("ingrese el dia \n ingrese el mes \n ingrese el año");
        dia = entrada.nextInt();
        mes = entrada.nextInt ();
        año= entrada.nextInt();
        
        if  ((dia<=1)&&(dia<=30))
        {
            if (mes>=1 && mes <=12)
            {
                if (año !=0){
                    System.out.println("la fecha es correcta");
                }
                else ( System.out.print("la fecha es incorrecta")
       
            
            }
            }
            
           }

} 
 
        
      
         
   
    

      
