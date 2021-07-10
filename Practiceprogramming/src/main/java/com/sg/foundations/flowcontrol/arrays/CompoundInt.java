package com.sg.foundations.flowcontrol.arrays;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ragonba3
 */
public class CompoundInt {
    
    public static void main(String[] args) {
        
    
    
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("How much you want to invest?: ");
    double principal = userInput.nextDouble();

    
    System.out.println("What is the aual rate?: ");
    double rate = userInput.nextDouble();

    System.out.println("How many years are investing? : ");
    double time = userInput.nextDouble();

    System.out.println("The annual rate : ");
    int number = userInput.nextInt();

    double interest = principal * (Math.pow((1 + rate/100), (time * number))) - principal;
    
    double cinterest= principal + interest;
    
    System.out.println("Began with $: " + principal);
    System.out.println("Interest earned $: " + interest);
   // System.out.println("Time Duration in years: " + time);
   // System.out.println("Number of Time interest Compounded: " + number);
    
    System.out.println("Ended the year with $: " + cinterest );

    
    
  }
}
    

