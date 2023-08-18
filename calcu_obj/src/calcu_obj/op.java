
package calcu_obj;

import java.util.Scanner;


public class op {
      int num1;
        int num2;
        int suma;
        int resta;
        int sumar;
        int mult;
        int div;
        Scanner entrada=new Scanner (System.in);
        
        public void leernumeros(){
            System.out.println("ingrese dos numeros");
            num1=entrada.nextInt();
            num2=entrada.nextInt();
        }
        public void sumar(){
            suma=num1+num2;
            
        }
        public void resta(){
            resta=num1-num2;
            
        }
        public void mult(){
            mult=num1*num2;
            
        }
        public void div(){
            div = num1/num2;
        }
        public void mostrardatos(){
            System.out.println("la suma: " +suma);
            System.out.println("la resta: "+resta);
            System.out.println("la division: "+div);
            System.out.println("la multiplicacion: " +mult);
        }
}
