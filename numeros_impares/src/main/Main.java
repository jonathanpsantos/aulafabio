
package main;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        int cont = 100;
        
        while(cont <= 200 ){
            
            if(cont % 2 !=0){
                System.out.println(cont);
            }
            
            cont++;
        }
        
    }
    
}
