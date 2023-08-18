
package ejercicio;

import java.util.Random;
import java.util.Scanner;
import javax.xml.stream.util.EventReaderDelegate;



public class arreglosmedia {
    
    public static void main(String[] args) {
//solicitar la cantidad de numeros 
//uno a uno y promediarlos
/*
Scanner entrada=new Scanner (System.in);
float prom=0;
float suma=0;
         //solicitar el tamaño del vector por teclado
           1)  System.out.println("ingrese un numero");
              int num=entrada.nextInt();

         
             double dimension []=new double[num];
// se usa un for para llenar el vector
        2)
for (int i = 0; i < dimension.length; i++) {
            System.out.println("ingrese el numero " +(i+1));
            dimension[i]=entrada.nextDouble();
            
        }
            for (double elementos:dimension) {
                suma +=elementos;
                
            
        }
            prom=suma/num;
            System.out.println("el promedio" +prom);
           
            
       */     
            /*
         System.out.println("ingrese la cantidad de numeros");   
            int cantidad=entrada.nextInt();
            int numeros[]=new int[cantidad];
            for (int i = 0; i < cantidad; i++) {
                System.out.println("ingrese el numero " +(i+1)+"");
                numeros[i]=entrada.nextInt();
               
        }
            int suma=0;
            for (int num:numeros) {
            suma+=num;
        }
            double promedio =(double)suma/cantidad;
            System.out.println("el promedio de los numeros es:"+promedio);
            
            */
            
            
            Scanner entrada=new Scanner (System.in);
           int [] numeros=new int [10];
           //crear un random
           Random rand=new Random();
           //llenar el array con numeros aleatorios 0 y 10
           for (int i = 0; i < numeros.length; i++) {
            numeros[i]=rand.nextInt(51);
          
        }
           //imprimir los numeros del array
           System.out.println("numeros aleatorios generados");
           for (int numero:numeros){
               System.out.println("" +numero);
               
           }
           System.out.println("");
            
            //serie fibonachi 
            
            
              
            
    }
}
        
        
        
         


 
 
  
  
