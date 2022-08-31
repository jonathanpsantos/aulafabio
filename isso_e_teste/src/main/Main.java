/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author manager
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner grava = new Scanner(System.in);
        
        int cont = 0;
        System.out.println("Informe quantas vezes você deseja ver a frase ");
        cont = grava.nextInt();
        
        while(cont > 0){            
            System.out.println("Isso è um teste.");
            cont--;
        }
        
    }
    
}
