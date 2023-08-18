/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication71;


import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class JavaApplication71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
                Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de estudiantes (entre 4 y 10): ");
        int numEstudiantes = scanner.nextInt();
        
        // Validar que el número de estudiantes esté dentro del rango permitido
        if (numEstudiantes < 2 || numEstudiantes > 10) {
            System.out.println("La cantidad de estudiantes debe estar entre 4 y 10.");
            return;
        }
        
        // Arrays para almacenar los datos de los estudiantes
        String[] nombres = new String[numEstudiantes];
        int[] identificaciones = new int[numEstudiantes];
        double[] notas1 = new double[numEstudiantes];
        double[] notas2 = new double[numEstudiantes];
        double[] notas3 = new double[numEstudiantes];
        
        // Registro de calificaciones de cada estudiante
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("\nRegistro del estudiante " + (i + 1));
            System.out.print("Nombre: ");
            scanner.nextLine(); // Limpiar el buffer del scanner antes de leer el nombre
            nombres[i] = scanner.nextLine();
            System.out.print("Identificación: ");
            identificaciones[i] = scanner.nextInt();
            System.out.print("Nota 1: ");
            notas1[i] = scanner.nextDouble();
            System.out.print("Nota 2: ");
            notas2[i] = scanner.nextDouble();
            System.out.print("Nota 3: ");
            notas3[i] = scanner.nextDouble();
        }
        
        // Generación del reporte de notas
        DecimalFormat df = new DecimalFormat("#0.00");
        
        System.out.println("\nReporte de notas:");
        System.out.println("Estudiante\tNota 1 (30%)\tNota 2 (30%)\tNota 3 (40%)\tPromedio\tRedondeo");
        
        double promedioAsignatura = 0;
        for (int i = 0; i < numEstudiantes; i++) {
            double promedio = (notas1[i] * 0.3) + (notas2[i] * 0.3) + (notas3[i] * 0.4);
            String redondeo = (promedio >= 2.95) ? df.format(Math.round(promedio * 10) / 10.0) : df.format(promedio);
            
            System.out.println(nombres[i] + "\t\t" + notas1[i] + "\t\t" + notas2[i] + "\t\t" + notas3[i] + "\t\t" +
                    df.format(promedio) + "\t\t" + redondeo);
            
            promedioAsignatura += promedio;
        }
        
        promedioAsignatura /= numEstudiantes;
        System.out.println("\nPromedio de la asignatura: " + df.format(promedioAsignatura));
*/
        
      Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de estudiantes (entre 4 y 10): ");
        int numEstudiantes = scanner.nextInt();
        
        // Validar que el número de estudiantes esté dentro del rango permitido
        if (numEstudiantes < 2 || numEstudiantes > 10) {
            System.out.println("La cantidad de estudiantes debe estar entre 4 y 10.");
            return;
        }
        
        // Arrays para almacenar los datos de los estudiantes
        String[] nombres = new String[numEstudiantes];
        int[] identificaciones = new int[numEstudiantes];
        double[] notas1 = new double[numEstudiantes];
        double[] notas2 = new double[numEstudiantes];
        double[] notas3 = new double[numEstudiantes];
        
        // Registro de calificaciones de cada estudiante
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("\nRegistro del estudiante " + (i + 1));
            System.out.print("Nombre: ");
            scanner.nextLine(); // Limpiar el buffer del scanner antes de leer el nombre
            nombres[i] = scanner.nextLine();
            System.out.print("Identificación: ");
            identificaciones[i] = scanner.nextInt();
            System.out.print("Nota 1: ");
            notas1[i] = scanner.nextDouble();
            System.out.print("Nota 2: ");
            notas2[i] = scanner.nextDouble();
            System.out.print("Nota 3: ");
            notas3[i] = scanner.nextDouble();
        }
        
        // Generación del reporte de notas
        System.out.println("\nReporte de notas:");
        System.out.println("Estudiante\tNota 1 (30%)\tNota 2 (30%)\tNota 3 (40%)\tPromedio\tRedondeo");
        
        double promedioAsignatura = 0;
        for (int i = 0; i < numEstudiantes; i++) {
            double promedio = (notas1[i] * 0.3) + (notas2[i] * 0.3) + (notas3[i] * 0.4);
            double promedioRedondeado = Math.round(promedio * 10) / 10.0;
            
            System.out.printf("%s\t\t%.1f\t\t%.1f\t\t%.1f\t\t%.2f\t\t%.1f%n",
                    nombres[i], notas1[i], notas2[i], notas3[i], promedio, promedioRedondeado);
            
            promedioAsignatura += promedio;
        }
        
        promedioAsignatura /= numEstudiantes;
        System.out.printf("%nPromedio de la asignatura: %.2f%n", promedioAsignatura);       
        
    }
}
    
    

