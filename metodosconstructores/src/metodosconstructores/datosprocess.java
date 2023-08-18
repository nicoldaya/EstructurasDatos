
package metodosconstructores;


public class datosprocess {
    public static void main (String [] args){
    persona op= new persona("lucas" , "masculino", 1.63);
     op.mostrarDatos();
    animal ani=new animal(20,"criollo");
    
    ani.comer("elefante", 30);
    
    
}
}