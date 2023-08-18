
package poo_clasesyobjetos2;




public class POO_clasesyobjetos2 {
//objeto
   
    public static void main(String[] args) {
       
     Auto Auto1=new Auto();
     //generar losjeto valores del objeto
     Auto1.marca=" FERRARI";
     Auto1.modelo=2000;
     Auto1.color="blanco";
     Auto1.velocidad=300;
     
     //imprimir los valores del o
        System.out.println("la marca del auto es: " +Auto1.marca);
     System.out.println("la marca del auto es: " +Auto1.modelo);
     System.out.println("la marca del auto es: " +Auto1.color);
     System.out.println("la marca del auto es: " +Auto1.velocidad);
     //invocacion de metodo arrancarAutos
     Auto1.arrancarcla();
     Auto1.frenar();
     Auto1.turbo();
     
    
             
        
    }
    
}
