/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xolot
 */
public class factorizer2 {
    
    public static void main(String[] args) {
    
        int number = 100;
        System.out.print("Factor of " + number + "are: ");
        for (int i = 1; i <= number;  ++ i){
            
            if (number % i == 0){
                System.out.print( i + " ");
                
            }
            
        
        }
    }
    





}
