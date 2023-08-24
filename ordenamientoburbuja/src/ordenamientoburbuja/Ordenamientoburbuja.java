
package ordenamientoburbuja;

import java.util.Scanner;

public class Ordenamientoburbuja {

    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
       // int[]numeros={8,10,6,2,4};
        System.out.println("ingrese las ventas");
       int[]numeros=new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("datos "+(i+1));
           numeros[i]=sc.nextInt();
            
        }
      
        for (int i = 0; i < numeros.length-1; i++) {
            for (int j = 0; j <numeros.length-i-1; j++) {
                if (numeros[j]<numeros[j+1]) {
                    
                    int temp=numeros[j];
                    numeros[j]=numeros[j+1];
                     numeros[j+1]=temp;
                    
                }
            }
        }
        System.out.println("arreglo ordenado: ");
        for (int  numero:numeros) {
            System.out.println(numero+"");
//            elaborar un algoritmo que permita guardar las ventas en un negocio las que quiera
//            imprimir de forma ascedente las ventas no importa los datos de las ventas 
            
        }}}
        