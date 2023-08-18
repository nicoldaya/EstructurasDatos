
package javaapplication57;

import java.util.Scanner;





public class JavaApplication57 {

   
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System. in);
        double [] numeros =new double[4];
        System.out.println("digite sus notas");
        for (int i = 0; i < 4 ;i++) {
        numeros[i]= entrada.nextDouble();
        }   
        int suma = 0;
    for (double numero : numeros) {
    suma += numero;
}
double promedio = (double) suma / numeros.length;
System.out.println("El promedio es: " + promedio);
    
    
    }
}
