
package javaapplication9;

import java.util.Scanner;

public class JavaApplication9 {

    public static void main(String[] args) {
      /*  
   Scanner entrada = new Scanner (System.in);
        System.out.println("digite un numero en grados ");
        double angulo = entrada.nextDouble();
        double anguloRadianes= Math.toRadians(angulo);
        
        System.out.println("el angulo en radianes es:" +anguloRadianes);
     
        
        double sin=Math.sin(anguloRadianes);
        double cos= Math.cos(anguloRadianes);
        double tan= Math.tan(anguloRadianes);
        
        System.out.println("el seno de " +angulo + "es:" +sin);
                System.out.println("el coseno de " +angulo + "es:" +cos);
                        System.out.println("el seno de " +angulo + "es:" +tan);

*/
        
      /*
      Scanner entrada= new Scanner (System.in);
              System.out.println("digite un numero ");
      int numero= entrada.nextInt();
        double raiz = Math.sqrt(numero);
        System.out.println("la raiz del numero entero es:"  +raiz);
        */
      /*
      int numero=10; 
              double raiz = Math.sqrt(numero);
              
            numero/= raiz;
           System.out.println("el resultado es:" +numero);
           
          */
      
      
      /*
      Scanner entrada= new Scanner (System.in);
        System.out.println("digite el lado del cuadrado");
        int lado= entrada.nextInt();
         double area= Math.pow (lado, lado);
         System.out.println("el area del cuadrado es:" +area );
*/
      //por consola
      Scanner entrada = new Scanner (System.in);
        System.out.println("ingrese el primer numero ");
      int numero1 = entrada.nextInt();
        System.out.println("ingrese el segundo numero ");
        int numero2= entrada.nextInt();
        
        int resto= numero1%numero2;
        int diferencia = Math.abs(numero1-numero2);
  
      String mensaje= (resto == 0) ? ("el primer numero es multiplo del segundo"): ("el primero numero No es multiplo del segundo");
        System.out.println("" +mensaje);
        
      
                
            
        
    }
    
}
