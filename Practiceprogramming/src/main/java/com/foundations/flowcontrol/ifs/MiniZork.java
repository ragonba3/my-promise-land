/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author ragonba3
 */
public class MiniZork {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("You are standing in a open field westof a white house,");
        System.out.println("With a voarded front door,");
        System.out.println("There is a small mailbox here.");
        System.out.println("Go to the house, or open the mailbox");
        
        String action = userInput.nextLine();
        
        
        if (action.equals("open the mailbox")){
        System.out.println("You open the mailbox.");
        System.out.println("It's really dark in there.");
        System.out.println("Look inside or stick you hand in?  ");
        action = userInput.nextLine();
        
        if (action.equals("look inside")){
            System.out.println("");
        }
        
            
        
    }
        
        
    }
}
