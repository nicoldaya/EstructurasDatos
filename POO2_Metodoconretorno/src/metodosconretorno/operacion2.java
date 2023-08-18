
package metodosconretorno;

import java.util.Scanner;




public class operacion2 {
    //crear metodo saludar
  
    
    public String saludar(String nombre){
       String saludo=("hola ");
       
         System.out.println(saludo);
         
       return saludo;
    }
  
    public String nombreyapellidos (String nam,String apellido){
        
           System.out.println(nam);
           System.out.println(apellido);
       
       return nam;
      
    }
    public int cedula(int Id){
        System.out.println(Id);
        return Id;
    }
    public int fechaNacimiento(int a){
        System.out.println(a);
        return a;
        
    }
    public int direccion (int dirc){
        System.out.println(dirc);
        return dirc;
    }
    public int celular(int cell){
        System.out.println(cell);
        return cell;
    }
    
}
