
package main;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        double salario, salariof, trans, ref ;
        double imr = 0.07;
        
        System.out.println("Digite o valor de seu salario em R$. ");
        salario = grava.nextDouble();
        
       
        
             
        if(imr > 1200){
            
             trans = salario*0.02;
        salario = salario - trans;
        
        ref = salario*0.06;
        salario = salario-ref;
        
        imr = salario*0.07;
        salario = salario - imr;
                
        salariof = imr*0.15;
        salariof = imr-salariof;
            System.out.println("Seu salário bruto é: R$"  + salario);
        
            System.out.println("Seu salário com desconto do imposto de renda: R$"  + salariof);
        
            System.out.println("O Desconto do Vale-Transporte foi de : R$"+ trans);
            System.out.println("O Desconto do Vale-Refeição foi de : R$"+ ref);
            System.out.println("O Desconto do Imposto de Renda foi de : R$"+ imr);
            
            }else {
            System.out.println("Não houve Descontos.");
        }
            
            
        
       
         
    }
    
}
