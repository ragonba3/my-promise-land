
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
        
    
     // create an object of Scanner class
    Scanner userInput = new Scanner(System.in);

    // take input from users
    
    System.out.println("Enter the principal: ");
    double principal = userInput.nextDouble();

    
    System.out.println("Enter the rate: ");
    double rate = userInput.nextDouble();

    System.out.println("Enter the time: ");
    double time = userInput.nextDouble();

    System.out.println("Enter number of times interest is compounded: ");
    int number = userInput.nextInt();

    double interest = principal * (Math.pow((1 + rate/100), (time * number))) - principal;

    System.out.println("Principal: " + principal);
    System.out.println("Interest Rate: " + rate);
    System.out.println("Time Duration: " + time);
    System.out.println("Number of Time interest Compounded: " + number);
    System.out.println("Compound Interest : " + interest);

    
  }
}
    

