/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioarreglos2023;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicioarreglos2023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Crear arreglos de tamaño 5
        int[] arregloA = new int[10];
        int [] arregloB = new int[10];

        // Pedir al usuario que ingrese los valores para el primer arreglo
        System.out.println("Ingrese los valores para el primer arreglo:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            arregloA[i] = scanner.nextInt();
        }

        // Pedir al usuario que ingrese los valores para el segundo arreglo
        System.out.println("Ingrese los valores para el segundo arreglo:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            array2[i] = scanner.nextInt();
        }

        // Multiplicar los elementos correspondientes de los arreglos
        double[] resultado = new double[5];
        for (int i = 0; i < 5; i++) {
            resultado[i] = array1[i] * array2[i];
        }

        // Mostrar los resultados
        System.out.println("Arreglo 1:");
        for (double value : array1) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Arreglo 2:");
        for (double value : array2) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Resultado de la multiplicación:");
        for (double value : resultado) {
            System.out.print(value + " ");
        }
    }
}  
    
    

