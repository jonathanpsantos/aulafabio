

package main;

import java.util.Scanner;

public class Main {

  
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        double valor1, valor2, valor3;  
        String nome;
        
        System.out.println("Digite a primeira nota");
        valor1 = grava.nextDouble();
        System.out.println("Digite a segunda nota");
        valor2 = grava.nextDouble();
        System.out.println("Digite a terceira nota");
        valor3 = grava.nextDouble();
     
       System.out.println("digite o nome do aluno");
       nome = grava.next();
        
        System.out.println(" O Aluno " + nome + " teve como medía a nota " +  (valor1 + valor2 + valor3)/3  );
    }
    
}
