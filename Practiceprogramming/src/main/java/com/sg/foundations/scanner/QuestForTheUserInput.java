/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author xolot
 */
public class QuestForTheUserInput {
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        
        String yourName;
        String yourQuest;
        double velocityOfSwallow;
        
        System.out.println("What is your Name??!");
        yourName = myScanner.nextLine();
        
        System.out.println("What is your Quest??");
        yourQuest = myScanner.nextLine ();
        
        System.out.println("What is airspeed velocity of an unladen swallow !?!");
        velocityOfSwallow = Double.parseDouble(yourQuest);
        System.out.println("How do you Know is :   " + velocityOfSwallow   +   yourName + ("?"));
        System.out.println("You didn't even know if the swallow was African or European!");
        System.out.println("Maybe skip answering things about birds ans istead go to your quest = " + yourQuest  +  ("."));      
        }
   
   
        }

   

