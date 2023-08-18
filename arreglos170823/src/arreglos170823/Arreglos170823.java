
package arreglos170823;


import java.util.Scanner;

public class Arreglos170823 {

//algoritmo que multiplica dos arreglo de tamaño 10, para  el final sumar todos los numeros resultantes 
    //el metodo principal de la clase Arreglos170823 se tendran las siguientes acciones:
    //importar el metodo principal 
    public static void main(String[] args) {
        //importar la clase Scanner
        Scanner sc =new Scanner (System.in);
        // declaro dos arreglos  a y b de tamaño 10
        int arregloa[]=new int[10];
                int arreglob[]=new int[10];
                //Imprimir un mensaje que me indique los elementos de arreglo a 
 System.out.println("\n ingrese los numeros del aregloa ");
 //inicio del ciclo for desde i=0 hasta 9 con incremento 1
        for (int i=0;i<10;i++) {
            //imprime mensaje del contador de numeros digitados
            System.out.println("numero"+(i+1));
            //solicita elemento i del arregloa
            arregloa[i]=sc.nextInt();
        }
                        //Imprimir un mensaje que me indique los elementos de arreglo b 
            System.out.println("\n ingrese los numeros del areglob ");
            //inicio del ciclo for desde i=0 hasta 9 con incremento 1
        for (int i=0;i<10;i++) {
                        //imprime mensaje del contador de numeros digitados
            System.out.println("numero"+(i+1));
            // //solicita elemento i del arreglob
            arreglob[i]=sc.nextInt();
        }
        //inicializar variable sumat en 0
        int sumat=0;
        //declaro arreglo mult de tamaño 10
        int mult[]=new int[10];
        //ciclo for 
        for (int i = 0; i < 10; i++) {
            //operacion que me guarde la multiplicacion de dos arreglos a y b 
          mult[i]=arregloa[i]*arreglob[i];
          //contador sumatoria de todos los numeros resultantes de la multiplicacion
          sumat +=mult[i];
          //imprimir el producto
            System.out.println("el producto es:"+mult[i]);
            
        }
        //imprimir sumatoria 
        System.out.println("la suma de todos los resultados es: "+sumat);
       
        
        }
    }
    

