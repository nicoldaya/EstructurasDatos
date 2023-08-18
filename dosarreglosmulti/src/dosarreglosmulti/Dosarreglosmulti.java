
package dosarreglosmulti;

import java.util.Scanner;

public class Dosarreglosmulti {
//creo mi clase Dosarreglosmulti
    //importo la calse principal
    public static void main(String[] args) {
   //importo Scanner para mas adelante pedir mis elementos
   Scanner sc = new Scanner(System.in);
   //declaro los dos arreglos ArregloA y ArregloB de tamaño 10
        int[] ArregloA= new int[10];
    int [] ArregloB= new int[10];
    //imprimo un mensaje   
    System.out.println("digite los 10 numeros del arreglo A"); 
    //creo un ciclo for desde i=0 hasta 9 con incremento 1
       for (int i = 0; i < 10; i++) {
        //imprimo un mensaje con un contador
           System.out.println("\nelemento "+(i+1));    
       //pide el elemento i del ArregloA
           ArregloA[i]=sc.nextInt();    
        }
        System.out.println("\ndigite un numero del arreglo B");
    
        for (int i = 0; i < 10; i++) {
        System.out.println("\nelemento "+(i+1));
        ArregloB[i]= sc.nextInt();
        }
        System.out.println("\nlos elementos del arreglo A: ");
        
        for (int i = 0; i < ArregloA.length; i++) {
           //muestro todos los numeros digitados por teclado del ArregloA
            System.out.println(""+ArregloA[i]); 
        }
        System.out.println("\nlos elementos del arreglo B: ");
        
        for (int i = 0; i < ArregloB.length; i++) {
          //muestro todos los numeros digitados por teclado del ArregloB
            System.out.println(""+ArregloB[i]);    
        }
    //creo un arreglo llamado multi con tamaño 10
        int [] multi = new int [10];
    //inicio un ciclo para multiplicar mi arreglo A y el B, digito por digito    
    for (int i = 0; i < 10; i++) {
        //guardo dicha operacion en la variable multi[i]
        multi[i]=ArregloA[i]*ArregloB[i];
        }
    //imprimo un mensaje para mas adelante mostrarlos
        System.out.println("     MULTIPLICACION DE AMBOS ARREGLOS");
    //inicializo una variable llamada suma en 0    
        int suma=0; 
    //inicio un ciclo for para posteriormente imprimir los resultados    
        for (int i = 0; i < 10; i++) {
             //hago la sumatoria de todos los numeros ya resultado de la multiplicacion entre A y B
            suma+= multi[i];
            //A continuacion imprimo el arreglo A, arreglo B y por ultimos su multiplicacion
            System.out.println("\t  "+ArregloA[i]+ " x "+ArregloB[i]+ " = "+multi[i]);
            
        }
        //imprimo la sumatoria de de los numeros multiplicados
        System.out.println("la suma de todos los numeros es: "+suma);
    }
 //MENCIONES HONORIFICAS: "\t" Es un salto al frente.
                    // "\n" Es un salto hacia abajo.
}
