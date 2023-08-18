
package metodosconstructores;


public class animal {
    String nombre;
    String color;
    double peso;
    int tamaño;
    int edad;
    String tipo;
    String alimentacion;
    //sobrecarga de metodos constructores

   
    

    public animal(String nombre, String color, double peso, int tamaño, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.peso = peso;
        this.tamaño = tamaño;
        this.edad = edad;
    }
     public animal(int edad, String alimentacion) {
        this.edad= edad;
        this.alimentacion = alimentacion;
    }
    
    public void comer(String nombre, int peso){
        System.out.println("el " +nombre+ "\n comio bastante por ende su peso es:" +peso);
        
    }
    public void comer(String raza){
        System.out.println(" el " +nombre+ " comio bastante por ende su es de: "+peso+ "su raza es:" +raza);
        
    }
}
