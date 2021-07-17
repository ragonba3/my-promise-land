/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicProgrammingConcepts;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ragonba3
 */
public class RockPaperScissors {

    public static void main(String[] args) {
        
 String stringNumRounds, stringChoice;
        int rock = 0;
        int paper = 1;
        int scissors = 2;
        int ties = 0;
        int numRounds = 0;
        int wins = 0;
        int losses = 0;
        int choice = 0;

        Scanner myScanner = new Scanner(System.in);

        Random randomizer = new Random();
        //int randNum = randomizer.nextInt(2);

        System.out.println("Want to rumble with me?");
        System.out.println("Rock, Paper or Scissors!!!");
        System.out.println("How many rounds do you want to play?");
        stringNumRounds = myScanner.nextLine();
        numRounds = Integer.parseInt(stringNumRounds);

        if (numRounds < 1 || numRounds > 10) {
            System.out.println("<Error>");
            System.out.println("<Run Program again>");
            System.out.println("You can only choose between 1-10 rounds");

        } else {
            
            while(numRounds >0 && numRounds < 11){

        for (int i = 0; i < numRounds && i < 11; i++) {

            int randNum = randomizer.nextInt(2);

            System.out.println("So what's is gonna be...? choose rock, paper, or scissors?");
            stringChoice = myScanner.nextLine();

            if (stringChoice.equalsIgnoreCase("Rock")) {
                choice = rock;

                if (choice == randNum) {
                    ties++;

                } else if (randNum == paper) {
                    losses++;

                } else if (randNum == scissors) {
                    wins++;
                }
                
                        chooseWinner(wins, losses);
                        

            } else if (stringChoice.equalsIgnoreCase("Paper")) {
                choice = paper;

                if (choice == randNum) {
                    ties++;

                } else if (randNum == scissors) {
                    losses++;

                } else if (randNum == rock) {
                    wins++;
                }
                
                        chooseWinner(wins, losses);


            } else if (stringChoice.equalsIgnoreCase("Scissors")) {
                choice = scissors;

                if (choice == randNum) {
                    ties++;

                } else if (randNum == rock) {
                    losses++;

                } else if (randNum == scissors) {
                    wins++;
                } 
                
                     chooseWinner(wins, losses);

                
            } else {
                     System.out.println("System Error try ");
                     i--;
            
            }  
        }
         System.out.println("You won " + wins + " ");
                System.out.println("You lost " + losses + "");
                System.out.println("You tie " + ties + " ");

                if (wins > losses) {
                    System.out.println("You are the winner!!");
                    wins = 0;
                    losses = 0;
                    ties = 0;
                } else if (wins < losses) {
                    System.out.println("Sorry you lost");
                    wins = 0;
                    losses = 0;
                    ties = 0;
                } else if (wins == losses) {
                    System.out.println("It's tie");
                    wins = 0;
                    ties = 0;
                    losses = 0;
                }
                
                
            System.out.println("Wanna rrrumble again?");
            System.out.println("If so, how many times? \n Only 1 to 10 rounds \n(Enter 0 to exit)");
            stringNumRounds = myScanner.nextLine();
            numRounds = Integer.parseInt(stringNumRounds);
         System.out.println("Thanks for rumbling!!!");
      }
    }
  }

    public static void chooseWinner(int wins, int losses) {
        if (wins > losses) {
            System.out.println("You won this Round");
        } else if (wins < losses) {
            System.out.println("You lost this Rounds");
        } else {
            System.out.println("It's a tie");
        }
    }
}       
    

