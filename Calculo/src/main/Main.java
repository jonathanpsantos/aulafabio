package main;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
       
        Scanner grava = new Scanner(System.in);
               
        double valor1 ;
        double proc = 0.1;
        
        System.out.println("Digite um valor para obter a 10% do valor ");
        valor1 = grava.nextDouble();
        
        System.out.println("10% de " + valor1 + " é: " + proc*valor1  );
        
    }
    
}
