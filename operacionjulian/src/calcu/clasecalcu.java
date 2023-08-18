package calcu;

import javax.swing.JOptionPane;

public class clasecalcu {

    int suma;
    int resta;
    int multiplicacion;
    double division;
    int op;

    public void sumar(int num1, int num2) {
        suma = num1 + num2;
    }

    public void resta(int num1, int num2) {
        resta = num1 - num2;

        if (num1 < num2) {
            JOptionPane.showMessageDialog(null, "Debe digitar un numero mayor");
        } 
    }
    public void multiplicacion(int num1, int num2) {
        multiplicacion = num1 * num2;
    }

    public void division(double num1, double num2) {
        division = num1 / num2;
        if (num2 == 0) {
            JOptionPane.showMessageDialog(null, "no se puede dividir");

        }
    }

    public void mostrarop() {
        op = Integer.parseInt(JOptionPane.showInputDialog(null, "1) suma " + " 2) resta " + " 4) multiplicacion " + " 5) division "));
        if (op == 1) {
            JOptionPane.showInternalMessageDialog(null, "la suma es: " + suma);
        }
        if (op == 2) {
            JOptionPane.showInternalMessageDialog(null, "la resta es: " + resta);
        }
        if (op == 3) {
            JOptionPane.showInternalMessageDialog(null, "la multiplicacion es: " + multiplicacion);
        }
        if (op == 4) {
            JOptionPane.showInternalMessageDialog(null, "la division es: " + division);
        }


        /*
public void mostrar(){
    System.out.println("la suma es: "+suma);
    System.out.println("la resta es: "+resta);
    System.out.println("la multiplicacion es: "+multiplicacion);
    System.out.println("la division es: "+division);
         */
    }
}
