
package metodosconretorno;

import java.util.Scanner;



public class datosprincipales {

    public static void main(String[] args) {
  Scanner sc=new Scanner (System.in);
  System.out.println("ingrese su nombre y  ");
  String nam=sc.nextLine();
   System.out.println("ingrese  su apellido ");
  String apellido=sc.nextLine();
        System.out.println("ingrese su cedula ");
        int Id=sc.nextInt();
        System.out.println("ingrese fecha de nacimiento");
        int a=sc.nextInt();int b=sc.nextInt();int c=sc.nextInt();
        System.out.println("ingrese su direccion");
        int direc=sc.nextInt();
        
  
        operacion2 op=new operacion2();
       op.nombreyapellidos(nam, apellido);
       op.cedula(Id);
       op.fechaNacimiento(a);
     op.cedula(Id);
     op.celular(a);
     op.direccion(direc);
      
 
        
    }
    
}
