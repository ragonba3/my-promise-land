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
public class PanDemicBus {
    
    
    public static void main(String[] args) {        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("You are lining up - waiting for the bus");
        System.out.println("Boarding the bus through the front door");
        System.out.println("There is a fee to pay");
        System.out.println("pay the fee or wait for the next bus");
        
        String action = userInput.nextLine();    
    if (action.equals("pay the fee")){
        System.out.println("board the bus.");
        System.out.println("Do you have a mask?");
        System.out.println("get your mask or you forgot it?");
        action = userInput.nextLine();}
    
    if (action.equals("have a mask")){
        System.out.println("You know it's an unconfortable neccesity");
        System.out.println("take it off or settled with?");
        action = userInput.nextLine();}
    if (action.equals("I forgot it")){
    
        System.out.println("sorry cannot board the bus, no mask no boarding");
        }else if(action.equals("settled with")){
            System.out.println("Then have a productive day at Gulag, just like Vasily Kovalyov");
    
        action = userInput.nextLine();}
            
        if (action.equals("take it off")){
            System.out.println("sorry mask are a most get off the bus");
        }else if (action.equals("wait for the next bus")){}
        System.out.println("Next one coming in fifteen minutes");
  

    }}
    
                    
                    
                    


        
        
            
        
        
    
    
                
    

