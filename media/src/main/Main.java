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
        Scanner grava = new Scanner(System.in);
        
        
        int valor=1, acumula, cont=0;
        double media = 0 ;
        while(valor != 0){
        
        System.out.println("DIgite a idade ou 0 para sair");
        valor = grava.nextInt();
        acumula = acumula = valor ;
        cont++;
        
        
    }
        
        media = acumula / cont;
        
        System.out.println();
        
        
    }
    
}
