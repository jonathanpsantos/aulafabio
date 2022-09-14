
package exer3;

import javax.swing.JOptionPane;


public class Exer3 {

    
    public static void main(String[] args) {
       String valor1 =  JOptionPane.showInputDialog(null, "Digite um valor  ");
        int v1 = Integer.parseInt(valor1);
        
        String valor2 =  JOptionPane.showInputDialog(null, "Digite outro valor . ");
        int v2 = Integer.parseInt(valor2);
        
        
        int res1 = (v1 + v2); 
        int res2 = (v1 - v2);
        int res3 = (v1 * v2);
        double res4 = (v1 / v2);
        
        JOptionPane.showMessageDialog(null, v1 + " + " + v2 + " = " + res1 + "\n " + v1 + " - " + v2 + " = " + res2 + "\n" + v1 + " X " + v2 + " = " + res3 + "\n" + v1 + " / " + v2 + " = " + res4 );
       // JOptionPane.showMessageDialog(null, v1 + " - " + v2 + " = " + res2 );
        //JOptionPane.showMessageDialog(null, v1 + " X " + v2 + " = " + res3 );
        //JOptionPane.showMessageDialog(null, v1 + " / " + v2 + " = " + res4 );
    }
    
}
