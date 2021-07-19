/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicProgrammingConcepts;

import java.util.Scanner;

/**
 *
 * @author ragonba3
 */
public class healthyHearts {
    
    @SuppressWarnings("SuspiciousIndentAfterControlStatement")
    public static void main(String args[]) {
        
        double hrr,min,max,maxHr,MaximunHrate = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        System.out.println("Enter resting heart rate");
        int rhr=sc.nextInt();
        System.out.println("Enter low end heart rate");
        double minPer=sc.nextInt();
        System.out.println("Enter high end heart rate zone");
        double maxPer=sc.nextInt();
        
        
        if(age>50){
            MaximunHrate = (200-age);
            maxHr=220 -(0.50*age);
            hrr=(maxHr-rhr);
            min=(hrr*(minPer/100))+rhr;
            max=(hrr*(maxPer/100))+rhr;
            
            System.out.println("Target Heart Rate zone is between "+min+" to " +max+" beats per minute");
        }
        else
            if(age<85){
                MaximunHrate = (200-age);
                maxHr=220-(0.85*age);
                hrr=(maxHr-rhr);
                min=hrr*(minPer/100)+rhr;
                max=hrr*(maxPer/100)+rhr;
                System.out.println("Target heart rate zone is beween " +min+" to " +max);    
                
            }
            System.out.println("Maximun heart rate should be : " +MaximunHrate+ " beats per minute");   
            
        
    }
            
        
        
        
    }
    
