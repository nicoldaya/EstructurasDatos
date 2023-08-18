 
package primero;


import java.util.Scanner;
import javax.swing.JOptionPane;
public class ejercicios {
    /*
    //leer un numero y mostrar su cuadraday repetir el proceso
    //hasta que se introduzca un numero negativo
    public static void main(String[] args) {
        Scanner entrada =new Scanner (System.in);
        int num,cuadrado;
         num=Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        
         while(num>=0){
             cuadrado=(int)Math.pow(num, 2);
             JOptionPane.showMessageDialog(null, "el numero"+num+" elevado al cuadrado es : " +cuadrado);
             
             
              num=Integer.parseInt(JOptionPane.showInputDialog("digite otro numero"));
        
             
         }
         
        
        
    }
*/
    /*
    //leer numeros hasta que se introduzca un 0
    //para cada uno indicar si es par o impar 
  
    int numero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
     while(numero!=0){
    if ( numero %2==0){
        System.out.println("el numero" +numero+"es par");
    }
    else{
        System.out.println("el numero" +numero+"es impar");
    }
}
*/
    /*
    public static void main(String[] args) {
        
    
    int numero, aleatorio,contador=0;
    aleatorio =(int)(Math.random()*100);
    do{
    numero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
    if(aleatorio>numero){
        System.out.println("digite un numero mayor");
    }else{
        System.out.println("digite un numero menor");
        
}
    contador ++;
}while(numero!= aleatorio);
System.out.println("\n adivinaste el numero en " +contador+" intentos");
}
}

*/
    /*
    
    public static void main(String[] args) {
        //escribir todos los numeros del 100 al 0 de 7 en 7
        for (int i = 100; i >=0 10; i-=7) {
        System.out.println(i);
            
        }
    }
    */
    /*
    //diseñar un programa que muestyre el producto de los 10 primeros numeros impares
    public static void main(String[] args) {
        long producto=1;
        for (int i = 1; i <=20; i+=2) {
            producto *=i;
       
        }
        System.out.println("el producto es " +producto );

    }
*/
    public static void main(String[] args) {
        //pedir 10 numeros y mostrar la media de los numeros positivos, la media de los negativos
        //y cantidad de ceros
    
        int numero, suma_pos=0,conteo_pos=0,suma_neg=0,conteo_neg=0,conteo_ceros=0;
        float media_pos,media_neg;
        
        for (int i = 1; i <= 10; i++) {
            numero=Integer.parseInt(JOptionPane.showInputDialog("digite un numero:"));
            if (numero==0){
                conteo_ceros++;
                
            }
            else if (numero>0){
                suma_pos +=numero;
                conteo_pos++;
                
            }
            else{
                suma_neg +=numero;
                conteo_neg++;
            }
            
        }
        if (conteo_pos ==0) {
            System.out.println("no se puede sacar las media de los positivos");
            
        }else{
            media_pos=(float)suma_pos/conteo_pos;
            System.out.println("la media de los numeros positivos es:" +media_pos);
        }
       if(conteo_neg==0) {
           System.out.println("no se puede sacar la media de los numeros negativos ");
       }else{
           media_neg=(float) suma_neg/conteo_neg;
           System.out.println("la media de los negativos es:" +media_neg);
       }
        System.out.println("la cantidad de ceros es:" +con);
    }
    }
  
    


    
    
    
    
    
    

