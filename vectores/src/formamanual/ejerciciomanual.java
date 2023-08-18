
package formamanual;

import javax.swing.JOptionPane;



public class ejerciciomanual {

    public static void main(String [] args){
 //int numeros[]= new int [2];
 //String datos[]= new String[2];
 //numeros[0]=23;
 //numeros[1]=65;
 //numeros[2]=87;
 //datos[0]="julian";
 //datos[1]="nicol";
 
 /*   
 System.out.println(datos[0]); 
         System.out.println(datos[1]); 
 System.out.println(numeros[0]);
    System.out.println(numeros[1]);
    System.out.println(numeros[2]);
}
*/
//for(int i=0; i<2; i++){
 //System.out.println(datos[i]);
/*
//llenar un arreglo-teclado
int elementos;
elementos= Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de elementos"));
//CREAR EL ARREGLO
char[]letras= new char[elementos];
//SOLICITAR LOS ELEMENTOS
System.out.println("digite los elementos del arreglo");
//CICLO FOR-PARA RECORRER 
for (int i = 0; i < elementos; i++) {
//dentro del ciclo-> se solicitan los datos
System.out.println((i+1)+". digite un caracter");
//GUARDAR EN EL ARREGLO
letras[i]= JOptionPane.showInputDialog(letras).charAt(0);
}//FOR
//IMPRESION
System.out.println("\nlos elementos del arreglo son: "+elementos);
        for (int i = 0; i < elementos; i++) {
            //System.out.println(letras[i]);
            System.out.println(letras[i]+" ");
        }
    */
            
 //SOLICITAR AL USUARIO LA CANTIDAD DE NUMEROS QUE DESEA INGRESAR 
 //Y CALCULAR EL PROMEDIO DE ELLOS
Scanner entrada= new Scanner(System.in);
int numeros;
numeros= Integer.parseInt(JOptionPane.showInputDialog("digite su nota"));
int[]num= new int[numeros];
        System.out.println("digite las notas");
        for (int i = 0; i <numeros; i++) {
            System.out.println((i+1)+"digite una nota");
        numeros[i]= JOptionPane.showInputDialog(numeros).dato(0);
    }System.out.println("\nlos elementos del arreglo son: "+elementos);
  for (int i = 0; i <numeros; i++) {
            //System.out.println(letras[i]);
            System.out.println(numeros[i]+" ");
        
        }    
        }
}
   
    
    
    
  
   