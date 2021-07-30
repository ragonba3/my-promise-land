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
public class RocaPapelTijeras {
                
    public static String generateComputerChoice(Random random) {
        int wordNumber;
        wordNumber = random.nextInt(3)+ 1;
        String computerWordChoice = "";
        
        if(wordNumber ==1){
            computerWordChoice = "rock";
        } else if( wordNumber == 2){
            computerWordChoice = "paper";
        }    else if (wordNumber == 3){
                   computerWordChoice ="scissors";
                    }
            System.out.println(" The computer has made its choice");
            return computerWordChoice;
        }
            public static void showMenu( ){
                System.out.println("Options to choose from\n1. rock\n2. paper\n3.scissors");
            }
            
            public static String getUserChoice(Scanner scanner){
                String userWordChoice;
                
                System.out.println("User , please make your choice: ");
                userWordChoice = scanner.nextLine();
                
                return userWordChoice;
            }
            
            public static String chooseWinner(String computerChoice,  String userChoice) {
                String player = "No player";
                String customMessage ="";
                String finalMessage;
                        
                String rockCustomMessage = "The Rock breaks scissors to win";
                String scissorsCustomMessage = "Scissors cuts Paper to win";
                String paperCustomMessage = "Paper wraps Rock to win";
                
                if(computerChoice.equals("rock")&& userChoice.equals("scissors")){
                player = "Computer";
                customMessage = rockCustomMessage;
            }else if(userChoice.equals("rock")&& userChoice.equals ("scissors")){
                player ="You";
                customMessage = rockCustomMessage;
                
            }
            if(computerChoice.equals("scissors")&& userChoice.equals("paper")){
                player = "Computer";
                customMessage = scissorsCustomMessage;
            }else if(userChoice.equals("scissor")&& computerChoice.equals("paper")){
                    player = "you";
                    customMessage = scissorsCustomMessage;
            }
            if(computerChoice.equals("paper")&& computerChoice.equals("rock")){
                player = "Computer";
                customMessage = paperCustomMessage;
            }else if(userChoice.equals("paper")&& computerChoice.equals("rock")){
                player = "you";
                customMessage = paperCustomMessage;
            }
             
            finalMessage = player + " won (" + customMessage + ")";
            
            if (finalMessage.equals("No player won")){
                finalMessage = "No player won";
                return finalMessage;
            }else{
            return finalMessage;
            
            }
            
            }          
              public static void main(String[] args) {
            
                Random random = new Random();
                Scanner scanner = new Scanner (System.in);
                String computerChoice;
                String userChoice;
                String winner;
                
                showMenu();
                computerChoice = generateComputerChoice(random);
                userChoice = getUserChoice(scanner);
                winner = chooseWinner(computerChoice, userChoice);
                 
                System.out.println("You chose " + userChoice + "\nComputer chose: " + computerChoice);
                System.out.println(winner);
                
                while( winner.equals("No Player won"))
                System.out.println("You both chose same thing, Please play again.");
                 showMenu();
                  computerChoice = generateComputerChoice(random);
                  userChoice = getUserChoice (scanner);
                  winner = chooseWinner(computerChoice, userChoice);
                  System.out.println("You chose" + userChoice + "\nComputer chose " + computerChoice);
                  System.out.println(winner);
                          
                }
              }
    


                  
                
                
                
                
        
  
        


