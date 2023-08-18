
package clasesyobjetos;


public class coche {
    // CREACION DE ATRIBUTOS 
    String color;
    String marca;
     int km;
     
     
     // CREACION DE METODOS
     public static void main (String[] args)
     {
         coche coche1=new coche();
         coche1.color="blanco";
         coche1.km= 0;
         coche1.marca="KIA";
         
         
         System.out.println("el color del coche es:" + coche1.color );
         System.out.println("la marca del coche es:" +coche1.marca);
         System.out.println("el kilometraje del auto es:" +coche1.km);
         
         coche coche2=new coche();
         coche2.color="negro";
         coche2.km= 1000;
         coche2.marca="audi";
         
         
         System.out.println("\nel color del coche es:" + coche2.color );
         System.out.println("la marca del coche es:" +coche2.marca);
         System.out.println("el kilometraje del auto es:" +coche2.km);
         
     }
            
}
