/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ragonba3.statecapitals2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author ragonba3
 */
public class stateCapitals2 {
    
    public static void main(String[] args) throws FileNotFoundException {
    Map<String, String> stateCapitals2 = new HashMap<>();
    
   Scanner sc = new Scanner( new BufferedReader(new FileReader("stateCapitals2.txt ")));
        
        while (sc.hasNextLine()){
            String currentLine =sc.nextLine();
            System.out.println("50 States and Capitlas are loaded:" +"\n"+currentLine);
        } 
    

    Collection<String> keys = stateCapitals2.values();
    for (String CurrentState : stateCapitals2values){
        System.out.println("50 States and Capitals are loaded: "+", "+CurrentState)}    

}
}