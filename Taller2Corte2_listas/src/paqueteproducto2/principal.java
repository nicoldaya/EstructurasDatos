
package paqueteproducto2;

import PaqueteProducto.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class principal {

    public static void main(String[] args) {
        List<Producto> lisproducto=new ArrayList<>();
        do{
           int menu=Integer.parseInt(JOptionPane.showInputDialog("         ******LISTAS JAVA******"
               + "\nAPLICACION GESTIONAR PRODUCTOS\n"+"\n 1) AGREGAR PRODUCTOS "+"\n2) BUSCAR PRODUCTOS"+"\n3) CALCULAR EL VALOR TOTAL DEL INVENTARIO"
                                                     +"\n4) PARTICIPANTES "));
           
           switch (menu) {
            case 1:
                int agregarpro=Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NUMERO DE PRODUCTOS"));
                for (int j = 0; j < agregarpro; j++) {
                    String nombre1=JOptionPane.showInputDialog("Digite el nombre del producto");
                    int precio1=Integer.parseInt(JOptionPane.showInputDialog("Ingresar el precio del producto"));
                    int cantidad1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad "));
                    
                    Producto pro=new Producto(nombre1, j, cantidad1);
                    pro.setNombre(nombre1);
                    pro.setPrecio(precio1);
                    pro.setCantidadstock(cantidad1);
                    lisproducto.add(pro);
                 
             for (Producto pe: lisproducto) {
                 System.out.println("NNOMBRE: "+pe.getNombre());
                 System.out.println("PRECIO: "+pe.getPrecio());
                 System.out.println("CANTIDAD: "+pe.getCantidadstock());
             }    
            break;
                }
                break;
        
            case 2:
                   
         String producto1=JOptionPane.showInputDialog("INGRESAR EL PRODUCTO QUE QUIERES BUSCAR");
             boolean encontrado=false;
             for(Producto actual:lisproducto){
                       
                 if(actual.getNombre().equalsIgnoreCase(producto1)){
                     System.out.println("SE ENCONTRO EL PRODUCTO BUSCADO");
                     encontrado=true;
                     break;
                 }
                 
             }
                if (!encontrado) {
                    System.out.println("NO SE ENCONTRO EL PRODUCTO BUSCADO");
                    
                }break;
            case 3:
              double total =0;
                   
                    for (Producto per : lisproducto)
                    {
                        total+=per.getCantidadstock()*per.getPrecio();
                    
                    }
                    System.out.println("El valor total  es: "+total);
                    
                    break;  
            case 4:
                JOptionPane.showMessageDialog(null, "NICOL DAYANA ANACONA LOAIZA"+"\nJULIAN ANDRES LOPEZ");
           }
           
        }while (true);           
            
        
 
    }}
    

