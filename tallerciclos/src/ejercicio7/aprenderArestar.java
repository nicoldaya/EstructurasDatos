
package ejercicio7;

public class aprenderArestar {
public static void main(String[] args) {
System.out.println("Tabla de Resta\n");
    
        for(int i = 9; i >= 0; i--) {
            for(int j = 0; j <= 9; j++) {
                if(i >= j) {
                    int resultado = i - j;
                    System.out.println(i + " - " + j + "\t" + resultado);
                }
            }
        }
    }
}









