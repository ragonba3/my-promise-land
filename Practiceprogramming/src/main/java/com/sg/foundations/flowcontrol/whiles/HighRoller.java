/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 *
 * @author xolot
 */
public class HighRoller {
    public static void main(String[] args) {
        
        Random diceRoller = new Random();
        
        int rollResult = diceRoller.nextInt(8) +1;
        
        System.out.println("TIME TO ROOOOLL THE DICE");
        System.out.println("I rolled a " + rollResult);
        
        if (rollResult == 1){
            System.out.println("You rolled a critical failure");
            
        }
        
    }
    
}
