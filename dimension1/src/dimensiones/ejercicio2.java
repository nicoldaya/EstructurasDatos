
package dimensiones;


public class ejercicio2 {
    public static void main(String[] args) {
  
      
        int[] arreglo = {5, 8, 2, 1, 3};
        int mayor = arreglo[0];

        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }

        System.out.println("El mayor elemento es: " + mayor);
    }
}
    

