
package PaqueteProducto;

public class Producto {
   private String nombre;
   private int precio;
   private int cantidadstock;

    public Producto(String nombre, int precio, int cantidadstock) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadstock = cantidadstock;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidadstock(int cantidadstock) {
        this.cantidadstock = cantidadstock;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidadstock() {
        return cantidadstock;
    }

  
   
   
   
   
    
}
