
package main;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        double valor1, valor2;
        
        System.out.println("Digite dois valores");
        valor1 = grava.nextDouble();
        valor2 = grava.nextDouble();

        
        System.out.println( valor1 +  " + "  + valor2 +  " = " + (valor1+valor2) );
        System.out.println( valor1 +  " - "  + valor2 +  " = " + (valor1-valor2) );
        System.out.println( valor1 +  " * "  + valor2 +  " = " + (valor1*valor2) );
        System.out.println( valor1 +  " / "  + valor2 +  " = " + (valor1/valor2) );

        
    }
    
}
