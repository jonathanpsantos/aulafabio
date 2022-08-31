
package main;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
       Scanner grava = new Scanner(System.in);
       
       int cont = 0 ;
       
       while ( cont <100){
           if(cont % 3 == 0){
           System.out.println(cont);
           
           }
           cont++; 
           
       }
       
    }
    
}
