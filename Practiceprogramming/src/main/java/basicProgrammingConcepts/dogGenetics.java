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
public class dogGenetics {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rng = new Random();
    
    String dogName ;
    int startPercent = 100;
    int breedPercent = 0;
    
        System.out.println("What is your dog's name? ");
        dogName = sc.nextLine();
        
        String[] breeds ={": St. Bernard",": Chihuahua", ": Dramatic RedNosed Asian Pug",": Commom cur",": King Doberman"};
        System.out.println("Well I have this highly reliable report on  " + dogName +"'s prestigious background right here!");
                
        for(int i = 0; i < 5; i++){
            String breed = "";
            breed = breeds[i];
            if(i!= 4){
            breedPercent = rng.nextInt(startPercent);
            startPercent -= breedPercent;
        }else {breedPercent = startPercent;
                
        }
            System.out.println(breedPercent + "%" + breed );
        }
        System.out.println("\n Wow, that's QUITE the dog");        


    
    }
    
    
    
}
