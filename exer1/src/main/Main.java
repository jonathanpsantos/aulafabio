
package main;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        int op, idade;
        
        System.out.println("Selecione a opção \n1 mensagem \n2 valor \n3 idade \n4 Saindo ");
                op = grava.nextInt();
                
                if(op ==1){
                    System.out.println("Boa noite");
                    
                }else if (op==2){
                    System.out.println("digite um valor");
                    valor = grava.nextDouble();
                    porc = valor*0.10
                            
                }else if (op ==3){
                    System.out.println("Digite sua idade ");
                    idade = grava.nextInt();
                    
                     

                    
                }else if (op==4){
                    System.out.println("Saindo do sistema");
                    
                    
                }else{
                    
                    System.out.println("Saindo do sistema");

                }
                
        
        
        
        
    }
    
}
