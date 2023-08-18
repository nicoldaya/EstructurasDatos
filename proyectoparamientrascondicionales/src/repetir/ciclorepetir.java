
package repetir;

import javax.swing.JOptionPane;

public class ciclorepetir {

/*  
    public static void main (String[]args){
int i=1;
do{
    System.out.println(i);
    i++;
}while(i<=5);

} 
*/
//Realizar un juego para adivinar un numero. Para ello genera un numero aleatorio
//entre 0-100 y luego ir pidiendo numeros indicando "es mayor" o " es mnenor" sefun sea mayor o menor con respecto a N 
    //el proceso termina cuando el usuario acierta muestra en pantalla el numero de aciertos
 public static void main (String[]args){    
     int num,contador=0;
     int aleatorio;
int aleatoria = (int) (Math.random()*100);
do{
num=Integer.parseInt(JOptionPane.showInputDialog( "ingrese un numero"));
if (aleatoria>num){
   System.out. println("digite un numero mayor");
}else {
    System.out.println("digite un numero menor ");
    
}
contador++;

}while(num!=aleatoria);
     System.out.println("\ngenial!! adivinaste el numero en: " +contador+ " intentos");
     
 }
}