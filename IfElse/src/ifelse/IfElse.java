/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelse;

import java.util.Scanner;

/**
 *
 * @author edson
 */
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTRE COM SUA IDADE!");
        int idade = scan.nextInt();
        if (idade<=16){
            System.out.println("voto proibido");
        }
        else if(idade>=16 && idade<18){
            System.out.println("voto opcional");
            
        }
        else System.out.println("voto obrigatorio!");
           
        
        
            
        }
            
            
        
        
        
      
       
       
   
            
            
        
    
                
                
      
       
        // TODO code application logic here
    
    
}
