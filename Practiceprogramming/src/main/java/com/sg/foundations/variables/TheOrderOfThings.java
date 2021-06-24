/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

/**
 *
 * @author ragonba3
 */
public class TheOrderOfThings {
    
    public static void main(String[] args) {
        
    double number;
    String opinion, size, age, shape, color, origin, material, purpose;
    String noun;
    
    number = 5.0;
    opinion = "AWESOME";
    size = "teensy-weeny";
    age = "new";
    shape = "oblong";
    color = "yellow";
    origin = "Martian";
    material = "platinum";
    purpose = "good";
    
    noun = "dragons";
    
    //Using the + with strings doesn't add --it concanates! (stick them together)
    
    System.out.println(age +"" + number + "" + opinion + "" + purpose + "" + 
    noun + "" + shape + "" + origin + "" + size + " " + material + " " + color );
    } 
         
}
