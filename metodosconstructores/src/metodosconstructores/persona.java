
package metodosconstructores;

public class persona {
  
 
    String nombre;
   String genero;
   double estatura; 
   //metodo constructor 
   public persona(String _nombre, String _genero,double _estatura){
       nombre=  _nombre;
       genero= _genero;
       estatura=_estatura;
       
               }
   public void mostrarDatos(){
       System.out.println("tu nombre es: " +nombre+ "\n tu genero es: " +genero+ " \n tu estatura es: "  +estatura);
   }
   
   

    
}
