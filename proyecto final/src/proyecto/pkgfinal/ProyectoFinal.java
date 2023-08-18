
package proyecto.pkgfinal;

import java.text.DecimalFormat;
import java.util.Scanner;


public class ProyectoFinal {

    
    public static void main(String[] args) {
     



    
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de estudiantes (entre 4 y 10): ");
        int numEstudiantes = scanner.nextInt();
        
        // Validar que el número de estudiantes esté dentro del rango permitido
        if (numEstudiantes < 1 || numEstudiantes > 11) {
            System.out.println("El numero de estudiantes debe estar entre 4 y 10.");
            return;
        }
        
        // Arrays para almacenar los datos de los estudiantes
        String[] nombres = new String[numEstudiantes];
        int[] id = new int[numEstudiantes];
        double[] notas1 = new double[numEstudiantes];
        double[] notas2 = new double[numEstudiantes];
        double[] notas3 = new double[numEstudiantes];
        
        // Registro de calificaciones de cada estudiante
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("\nRegistro del estudiante " + (i + 1));
            System.out.print("Nombre: ");
            scanner.nextLine(); // Limpiar el buffer del scanner antes de leer el nombre
            nombres[i] = scanner.nextLine();
          
            
            System.out.print("Id/Cc: ");
            id[i] = scanner.nextInt();
            System.out.print("Nota 1: ");
            notas1[i] = scanner.nextDouble();
            System.out.print("Nota 2: ");
            notas2[i] = scanner.nextDouble();
            System.out.print("Nota 3: ");
            notas3[i] = scanner.nextDouble();
        }
        
        // Generación del reporte de notas
        
        DecimalFormat df = new DecimalFormat("#0.0");
        
        System.out.println("\nRegistro de notas:");
        System.out.println("Estudiante\t Nota 1 (30%)\tNota 2 (30%)\tNota 3 (40%)\tPromedio   \tRedondeo");
        
        double promedioAsignatura = 0;
    
         int a=0;
        int b =0;
        int c =0;
        int d=0;
        int e=0;
        int f=0;
        
        for (int i = 0; i < numEstudiantes; i++) {
            
            double promedio = (notas1[i] * 0.30) + (notas2[i] * 0.30) + (notas3[i] * 0.40);
            promedio*=10;
            String redondeo = (promedio>= 0.05) ?df.format(Math.round(promedio ) ) : df.format(promedio);
           
            System.out.println(nombres[i] +"\t\t"+ notas1[i] + "\t\t" + notas2[i] + "\t\t" + notas3[i] + "\t\t" + promedio +"\t\t"  +   redondeo);
            
            promedioAsignatura += promedio;
            if ((promedio>=0.0)||(promedio<=0.9))
            {
               a++; 
            }
            else if ((promedio>=1.0)||(promedio<=1.9))
            {
               b++;
            }
            else if ((promedio>=2.0)||(promedio<=2.9))
            {
                c++;
            }
            else if ((promedio>=3.0)||(promedio<=3.9))
            {
                d++;
            }
            else if ((promedio>=4.0)||(promedio<=4.9))
            {
               e++;
            }
            else
            {
               f++; 
            }
        }
        
        promedioAsignatura /= numEstudiantes;
        System.out.println(" \nPromedio de la asignatura: " + df.format(promedioAsignatura));
           System.out.println(a+" son los estudiantes que tienen promedio entre 0.0 y 0.9");
         System.out.println(b+" son los estudiantes que tienen promedio entre 1.0 y 1.9");
            System.out.println(c+" son los estudiantes que tienen promedio entre 2.0 y 2.9");
               System.out.println(d+" son los estudiantes que tienen promedio entre 3.0 y 3.9");
                  System.out.println(e+" son los estudiantes que tienen promedio entre 4.0 y 4.9");
                     System.out.println(f+" son los estudiantes que tienen promedio entre 5.0");
                     
    }}