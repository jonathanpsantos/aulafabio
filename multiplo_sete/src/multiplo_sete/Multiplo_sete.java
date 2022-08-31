
package multiplo_sete;

import java.util.Scanner;


public class Multiplo_sete {

    
    public static void main(String[] args) {
        Scanner grava = new Scanner(System.in);
        
        int cont = 0;
        
        while(cont < 200){
            if(cont % 7 == 0){
            System.out.println(cont);
            }
            
            cont++;
        }
        
    }
    
}
