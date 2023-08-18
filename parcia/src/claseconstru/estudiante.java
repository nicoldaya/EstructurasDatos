
package claseconstru;

import javax.swing.JOptionPane;

//estudiante con atributos 
public class estudiante {
String nombre;
int edad;
String sexo;
int prome;
int n1;
int n2;
int n3;
public estudiante(String nombre, int edad, String sexo, int prome) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.prome = prome;
  
  
}
  
public estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

public void mostrardatos(){
JOptionPane.showMessageDialog(null, "tu nombres es" +this.nombre+"\nsu genero es: "+this.sexo+"\nsu edad es: "+this.edad+"\ntu promedio de notas "+this.prome);
}
   }

