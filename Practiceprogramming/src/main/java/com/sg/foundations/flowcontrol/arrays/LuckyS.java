
package com.sg.foundations.flowcontrol.arrays;

import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * LuckyS, simulate a run depleting game until all your funds 
are all but gone.
*a) roll the two dice,
*if the sum equals 7, win $4, else lose $1
*b)amount of money the user is willing to lose.
*c)Tip: use random generator to simmulate  rolling of dice
*loop until  the funds are depleted
*count the number of rolls
*keep track of the rolls
*track the level of money
*d)number of rolls to deplete funds
*maximun amount of money held by the player.

 */

/**
 *
 * @author ragonba3
 */
public class LuckyS {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generator = new  Random();
        
        int die1,die2,dollars,count,maxDollars, countMax;
        
        System.out.println("How many dollars will you play? ");
        dollars = sc.nextInt();
        maxDollars = dollars;
        countMax = 0;
        count = 0;
        
        while(dollars > 0){
            count++;
            
            die1 = generator.nextInt(6)+ 1;
            die2 = generator.nextInt(6)+ 1;
            
            if (die1 + die2 == 7)
                dollars += 4;
            else
                dollars -= 1;
            
            if (dollars > maxDollars){
                maxDollars = dollars;
                countMax = count;
            }
            
        }
        System.out.println("You are broke after " + count + " rolls.\n" +
                "you should've quit after " + countMax + " rolls when you had $" +
                maxDollars + ".");
    }
    
}
