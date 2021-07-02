/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;
/* change it to randomizer.next (32) +35
after I tried randomizer.next (65) and worked!!
use 64 for Lotto ;-)
*/

/**
 *
 * @author ragonba3
 */
public class GuessMeMore {
    
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        
        
                
        int num = randomizer.nextInt(100);
        
        System.out.println("I've choosen number between -100 and 100.Bet you can't guess it!");
        System.out.println("your guess: ");
        System.out.print(randomizer.nextInt(100) + ",");
        System.out.println("Nice try, try i again");
        System.out.println("Your guess:");
        System.out.print(randomizer.nextInt(100)); 
        System.out.println("   Wow, nice guess! That was it!");
        
        
        
        
        
    }
    
}
