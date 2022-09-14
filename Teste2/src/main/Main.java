
package main;

import javax.swing.JOptionPane;


public class Main {

    
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do aluno ");
        
        String valor =  JOptionPane.showInputDialog(null, "Digite a nota do Primeiro bimestre ");
        double v1 = Double.parseDouble(valor);
        
        String valor1 = JOptionPane.showInputDialog(null, "Digite a nota do Segundo bimestre ");
        double v2 = Double.parseDouble(valor1);
        
        
        String valor2 = JOptionPane.showInputDialog(null, "Digite a nota do Terceiro bimestre ");
        double v3 = Double.parseDouble(valor2);
        
        double res = ((v1+v2+v3)/3);
        
        JOptionPane.showMessageDialog(null, "O aluno " + nome + "teve como media a nota " + res);
    }
    
}
