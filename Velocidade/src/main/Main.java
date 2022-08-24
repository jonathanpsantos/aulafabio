
package main;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        double v1, v2,res;
        
        
        System.out.println("Qual a Velocidade permitida na via ? ");
        v1 = grava.nextDouble();
        
        System.out.println("Qual a Velocidade em que estava ? ");
        v2 = grava.nextDouble();
        
        res= v2-v1;
        
        
        if(res <=0){
            System.out.println("Você não foi multado.");
        
        
        }else if(res <=10){
            System.out.println("Você foi multado em R$80,00.");
            
        }else if(res < 39){
            
            System.out.println("Você foi multado em R$120,00.");
        }else {
            System.out.println("Você foi multado em R$200,00.");
        }
    }
        
    
}
