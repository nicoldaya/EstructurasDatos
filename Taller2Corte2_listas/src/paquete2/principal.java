
package paquete2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import paquete1.Persona;


public class principal {

    
    public static void main(String[] args) {
       List<Persona> lispersona=new ArrayList<>();
       
        do{
       int agregar=0;  
       
       int menu=Integer.parseInt(JOptionPane.showInputDialog("         ******LISTAS JAVA******"
               + "\nAPLICACION GESTIONAR PERSONAS\n"+"\n 1) AGREGAR NUEVA PERSONA"+"\n2) MOSTRAR LISTA PERSONAS"+"\n3) BUSCAR PERSONA POR NOMBRE"
                                                     +"\n4) PROMEDIO DE EDAD PERSONAS"+"\n5)PARTICIPANTES"));
       
        switch (menu) {
            case 1:
                agregar=Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NUMERO DE PERSONAS"));
                for (int j = 0; j < agregar; j++) {
                    String nombre1=JOptionPane.showInputDialog("Digite el nombre de la persona");
                    int edad1=Integer.parseInt(JOptionPane.showInputDialog("Ingresar la edad de la persona"));
                    String genero1=JOptionPane.showInputDialog("Ingrese el genero ");
                    
                    Persona per=new Persona(nombre1, edad1, genero1);
                    per.setNombre(nombre1);
                    per.setEdad(edad1);
                    per.setGenero(genero1);
                       lispersona.add(per); 
                }
                break;
           
            case 2:
                System.out.println("MOSTRAR LISTA DE CONTACTO INGRESADAS ANTERIORMENTE");
             for (Persona pe: lispersona) {
                 System.out.println("Nombre: "+pe.getNombre());
                 System.out.println("Edad: "+pe.getEdad());
                 System.out.println("Genero: "+pe.getGenero());
             }    
            break;
            
            case 3:     
           
         String nombre2=JOptionPane.showInputDialog("INGRESAR LA PERSONA QUE QUIERES BUSCAR");
             boolean encontrado=false;
             for(Persona actual:lispersona){
                       
                 if(actual.getNombre().equalsIgnoreCase(nombre2)){
                     System.out.println("SE ENCONTRO EL NOMBRE BUSCADO");
                     encontrado=true;
                     break;
                 }
                 
             }
                if (!encontrado) {
                    System.out.println("NO SE ENCONTRO EL NOMBRE BUSCADO");
                    
                }break;
            case 4:
                int promedio=0;
                int suma=0;
                int contador=0;
                for (Persona pro : lispersona) {
                suma+=pro.getEdad();
                contador++;
                promedio= suma/contador;
                        } 
                System.out.println("EL PROMEDIO DE LAS EDADES DIGITADAS ES DE: "+promedio); 
                
            break;
            case 5:
                JOptionPane.showMessageDialog(null, "NICOL DAYANA ANACONA LOAIZA"+"\nJULIAN ANDRES LOPEZ");
        }
}while(true);
}}