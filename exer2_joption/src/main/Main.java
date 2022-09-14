
package main;

import javax.swing.JOptionPane;


public class Main {

    
    public static void main(String[] args) {
       String valor =  JOptionPane.showInputDialog(null, "Digite um valor para obter 10 % . ");
        double v1 = Double.parseDouble(valor);
        
        double porc = v1 * 0.1;
        
        JOptionPane.showMessageDialog(null,"10% de " + valor + " é " + porc );
        
        
    }
    
}
