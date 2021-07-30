/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleCalculator;

import java.util.Scanner;

/**
 *
 * @author ragonba3
 */
public class App {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, selection;
        System.out.println("Please enter any two digits: ");
        a=sc.nextInt();
        b=sc.nextInt();
        
        
        System.out.println("Enter your selection and press enter");
        System.out.println("1. ADDITION");
        System.out.println("2. SUBTRACTION");
        System.out.println("3. DIVISION");
        System.out.println("4. MULTIPLICATION");
        
        selection = sc.nextInt();
        while(selection >4){
      System.out.println("INVALID INPUT, PLEASE TRY AGAIN ");
      selection=sc.nextInt();
    }  
        SimpleCalculator SimpleCalculator = new SimpleCalculator();
        if(selection==1){
            c=SimpleCalculator.add(a, b);
            System.out.println("Your answer is: "+c);
        }else if(selection==2){
            c=SimpleCalculator.sub(a, b);
            System.out.println("Your answer is: "+c);
        }else if(selection==3){
            c=SimpleCalculator.div(a, b);
            System.out.println("Your answer is: "+c);
        }else if(selection==4){
            c=SimpleCalculator.multi(a, b);
            System.out.println("Your answer is: "+c);
                }   
            System.out.println("Press 0 to exit ");
            sc.nextInt();
        while(selection ==0){}
      System.out.println("Thank You ");
        
}
}