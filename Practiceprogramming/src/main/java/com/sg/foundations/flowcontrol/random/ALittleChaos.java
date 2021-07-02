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
public class ALittleChaos {
    
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        
        System.out.println("Random can make integers:" + randomizer.nextInt());
        System.out.println("Or a double:" + randomizer.nextDouble());
        System.out.println("Or even a boolean:" + randomizer.nextBoolean());
        
        int num = randomizer.nextInt(64);
        
        System.out.println("you can store a randomizer result:" + num);
        System.out.println("And use it over and over again: " + num + "," + num);
        
        System.out.println("Or Just keep generating new values");
        System.out.println("Here is bunch of numbers from 0 - 64:");
        
        System.out.print(randomizer.nextInt(65) + ",");
        System.out.print(randomizer.nextInt(65) + ",");
        System.out.print(randomizer.nextInt(65) + ",");
        System.out.print(randomizer.nextInt(65) + ",");
        System.out.print(randomizer.nextInt(65) +",");
        System.out.println(randomizer.nextInt(32) +35 );
        
        
        
        
    }
    
}
