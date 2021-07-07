
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ragonba3
 */
public class Factorizer {

    public static void main(String[] args) {
        
        int Number, i, Sum = 0;
        
        Scanner scan = new Scanner(System.in);
    
        System.out.println("Please enter any number: ");
        Number = scan.nextInt();
        
       for (i = 1; i<= Number; i++){
         if(Number % i == 0){
       //        System.out.format(" % d ",i);
         Sum =   Sum + i;    
    //    for (i=1; i < Number; i++){
    //        if(Number % i == 0){
                 
             
    //        }
       if (Sum == Number){
        System.out.format("\n%d is a perfect Number", Number);
        {System.out.format("\n% d is NOT a perfect Number", Number);
                        
                        }
            }
           }
//       }
    
    }
}}
