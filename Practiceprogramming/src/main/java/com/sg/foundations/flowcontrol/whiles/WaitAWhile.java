/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

/**
 *changing timeNow to 11 is the same as commenting out timeNow++
 * @author ragonba3
 */
public class WaitAWhile {
    
    public static void main(String[] args) {
        
    int timeNow =5;
    int bedTime = 10;
    
    while (timeNow < bedTime){
        System.out.println("It's only " + timeNow + " o'clock");
        System.out.println("I think I'll stay up just a liiiiittle longuer...");
        timeNow++;
        
    }
        System.out.println("Oh It's " + timeNow + "o'clock");
        System.out.println("guess I should go to bed..");
        
    }
    
}
