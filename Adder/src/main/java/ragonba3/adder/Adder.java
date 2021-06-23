/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ragonba3.adder;
    
import java.util.Scanner;




/**
 *
 * @author ragonba3
 */
public class Adder {
    public static void main(String[] args){
        int sum = 0;
        int operand1 = 0;
        int operand2 = 0;
        
        Scanner sc = new Scanner(System.in);
        
        String stringOperand1 = "";
        String stringOperand2 = "";
        
        System.out.println("Please enter the first number to be added");
        stringOperand1 = sc.nextLine();
        
        System.out.println("Please enter the second number to be added");
        stringOperand2 = sc.nextLine();
        
        operand1 = Integer.parseInt(stringOperand1);
        operand2 = Integer.parseInt(stringOperand2);
        
        sum = operand1 + operand2;
        
        
        System.out.println("Sum is: " +sum);
    }        
        
    }
