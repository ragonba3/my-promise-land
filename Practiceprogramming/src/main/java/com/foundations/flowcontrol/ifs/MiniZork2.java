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
public class MiniZork2 {


package com.foundations.flowcontrol.ifs;


    
    public static void main(String[] args) {
        
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("You are lining up - waiting for the bus,");
        System.out.println("Boarding from the front door.");
        System.out.println("There is a fee to pay.");
        System.out.println("Pay the fee, or get off the bus");
        
        String action = userInput.nextLine();{
        
        if (action.equals("pay the fee")){
        System.out.println("board the bus.");
        System.out.println("Do you have a mask?");
        System.out.println("get your mask or you forgot it?  ");
        action = userInput.nextLine();}
        
        if (action.equals("have a mask")){
            System.out.println("You know is unconfortable!.");
            System.out.println("take it off or settled with");
            action = userInput.nextLine();}
        
    else if (action.equals ("I forgot it")){
                System.out.println(" Sorry cannot board the bus, no mask no boarding, exit the bus through back door!!");}
            else if (action.equals("")){
                System.out.println("Remenber to call your manager");
            action = userInput.nextLine();}
            
            else if (action.equals ("take it off")){ 
        System.out.println("Sorry cannot board the bus, no mask no boarding, exit the bus through back door!");}
        
        if (action.equals("get off the bus")){
              System.out.println("Well you gonna be late for work, next bus coming in 30 minutes");
                System.out.println("Call your manager");}
        else if (action.equals("settled with")){
            
                System.out.println("Then you are going to have a productive day in the Gulag like Vasily Kovalyov");}            
                            
            
    
    
        
    }
    }  }
            
    
    
              

        
    

