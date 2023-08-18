
package javaapplication73;

import java.util.Scanner;


public class JavaApplication73 {

   
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
            scanner.nextLine();
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
        
        
        double promedio=0;
       double redondeo=0;
        double promedioAsignatura = 0;
       
       
       int a=0;
        int b =0;
        int c =0;
        int d=0;
        int e=0;
        int f=0;
        
         System.out.println("\nRegistro de notas:");
        System.out.println("Estudiante\t Nota 1 (30%)\tNota 2 (30%)\tNota 3 (40%)\tPromedio   \tRedondeo");
        
        for (int i = 0; i < numEstudiantes; i++) {
            
             promedio = (notas1[i] * 0.30) + (notas2[i] * 0.30) + (notas3[i] * 0.40);
            promedio*=10;
            if ((promedio>=0.05)||(promedio<=4.05))
            {
                redondeo=Math.round(promedio);
            }
            else
            {
                redondeo=promedio;
            }
            
        System.out.println(nombres[i] +"\t\t"+ notas1[i] + "\t\t" + notas2[i] + "\t\t" + notas3[i] + "\t\t" + promedio +"\t\t"  +   redondeo);
    
        if ((redondeo==00.1)||(redondeo==00.2)||(redondeo==00.3)||(redondeo==00.4)||(redondeo==00.5)||(redondeo==00.6)||(redondeo==00.7)||(redondeo==00.8)||(redondeo==00.9))
            {
               a++; 
            }
        else  if ((redondeo==10.0)||(redondeo==11.0)||(redondeo==12.0)||(redondeo==13.0)||(redondeo==14.0)||(redondeo==15.0)||(redondeo==16.0)||(redondeo==17.0)||(redondeo==18.0)||(redondeo==19.0))
            {
               b++;
            }
             else if ((redondeo==20.0)||(redondeo==21.0)||(redondeo==22.0)||(redondeo==23.0)||(redondeo==24.0)||(redondeo==25.0)||(redondeo==26.0)||(redondeo==27.0)||(redondeo==28.0)||(redondeo==29.0))
            {
                c++;
            }
            else if ((redondeo==30.0)||(redondeo==31.0)||(redondeo==32.0)||(redondeo==33.0)||(redondeo==34.0)||(redondeo==35.0)||(redondeo==36.0)||(redondeo==37.0)||(redondeo==38.0)||(redondeo==39.0))
            {
                d++;
    
            }
            
            else if ((redondeo==40.0)||(redondeo==41.0)||(redondeo==42.0)||(redondeo==43.0)||(redondeo==44.0)||(redondeo==45.0)||(redondeo==46.0)||(redondeo==47.0)||(redondeo==48.0)||(redondeo==49.0))
            {
               e++;
            }
            else 
            {
               f++; 
            }
        }

        promedioAsignatura+=promedio;
    promedioAsignatura /= numEstudiantes;
        System.out.println(" \nPromedio de la asignatura: " +promedioAsignatura);
        
                         
                     
                     
                     System.out.println("\nRegistro de notas:");
        System.out.println("categorias de notas \t total de muestras ");
        System.out.println("0.0 a 0.9"+"\t\t"+a);
         System.out.println("1.0 a 1.9"+"\t\t"+b);
          System.out.println("2.0 a 2.9"+"\t\t"+c);
           System.out.println("3.0 a 3.9"+"\t\t"+d);
            System.out.println("4.0 a 4.9"+"\t\t"+e);
             System.out.println("   5.0   "+"\t\t"+f);
             
             
             double calificacionMinima = Double.MAX_VALUE;
        double calificacionMaxima = Double.MIN_VALUE;
        String nombreMinima = "";
        String nombreMaxima = "";

       

        for (int i = 0; i < numEstudiantes; i++)
        {
           
            if (redondeo < calificacionMinima) {
                calificacionMinima = redondeo;
                nombreMinima = nombres[i];
            }

            else  if (redondeo > calificacionMaxima) {
                calificacionMaxima = redondeo;
                nombreMaxima = nombres[i];
            } 
        }

        

        promedioAsignatura /= numEstudiantes;
        System.out.printf("%nPromedio de la asignatura: %.2f%n", promedioAsignatura);

        System.out.println("\nEstudiante(s) con la calificación más baja: ");
        System.out.println(nombreMinima + "Calificación: " + calificacionMinima);

        System.out.println("\nEstudiante(s) con la calificación más alta:");
        System.out.println(nombreMaxima+"calificacion"+calificacionMaxima);
        
        
    }
    
}
