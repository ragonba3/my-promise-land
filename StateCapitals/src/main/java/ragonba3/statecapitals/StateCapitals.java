package ragonba3.statecapitals;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ragonba3
 */
public class StateCapitals {
    
    public static void main(String[] args) {
    
    Map<String, String> stateCapitals = new HashMap<>();
    
   
			stateCapitals.put("Alabama", "Montgomery");
                        stateCapitals.put("Alaska", "Juneau");
                        stateCapitals.put("Arizona", "Phoenix");
                        stateCapitals.put("Arkansas", "Little Rock");
                        stateCapitals.put("California", "Sacramento");
                        stateCapitals.put("Colorado", "Denver"); 
                        stateCapitals.put("Connecticut", "Hartford"); 
			stateCapitals.put("Delaware", "Dover");
                        stateCapitals.put("Florida", "Tallahassee"); 
			stateCapitals.put("Georgia", "Atlanta");
                        stateCapitals.put("Hawaii", "Honolulu"); 
                        stateCapitals.put("Idaho", "Boise");
			stateCapitals.put("Illinois", "Springfield"); 
                        stateCapitals.put("Indiana", "Indianapolis");
			stateCapitals.put("Iowa Des", "Moines"); 
                        stateCapitals.put("Kansas", "Topeka"); 
                        stateCapitals.put("Kentucky","Frankfort"); 
			stateCapitals.put("Louisiana", "Baton Rouge"); 
                        stateCapitals.put("Maine", "Augusta"); 
			stateCapitals.put("Maryland", "Annapolis"); 
                        stateCapitals.put("Massachusetts", "Boston"); 
			stateCapitals.put("Michigan", "Lansing"); 
                        stateCapitals.put("Minnesota", "Saint Paul"); 
			stateCapitals.put("Mississippi", "Jackson"); 
                        stateCapitals.put("Missouri", "Jefferson City"); 
			stateCapitals.put("Montana", "Helena"); 
                        stateCapitals.put("Nebraska", "Lincoln"); 
			stateCapitals.put("Nevada", "Carson City"); 
                        stateCapitals.put("New Hampshire", "Concord"); 
			stateCapitals.put("New Jersey", "Trenton"); 
                        stateCapitals.put("New Mexico", "Santa Fe"); 
			stateCapitals.put("New York", "Albany"); 
                        stateCapitals.put("North Carolina", "Raleigh"); 
			stateCapitals.put("North Dakota", "Bismarck");
                        stateCapitals.put("Ohio", "Columbus");
			stateCapitals.put("Oklahoma", "Oklahoma City");
                        stateCapitals.put("Oregon", "Salem"); 
			stateCapitals.put("Pennsylvania", "Harrisburg"); 
                        stateCapitals.put("Rhode Island", "Providence"); 
			stateCapitals.put("South Carolina", "Columbia"); 
                        stateCapitals.put("South Dakota", "Pierre"); 
			stateCapitals.put("Tennessee", "Nashville"); 
                        stateCapitals.put("Texas", "Austin"); 
			stateCapitals.put("Utah", "Salt Lake City"); 
                        stateCapitals.put("Vermont", "Montpelier"); 
			stateCapitals.put("Virginia", "Richmond"); 
                        stateCapitals.put("Washington", "Olympia"); 
			stateCapitals.put("West Virginia", "Charleston");
                        stateCapitals.put("Wisconsin", "Madison"); 
			stateCapitals.put("Wyoming", "Cheyenne");
                        
                        
                        
                        Set<String> keys = stateCapitals.keySet();
                        for(String k : keys){
                            System.out.println("States and Capitals Pairs: "+k+", "+stateCapitals.get(k));}
                        
                        Set <String> keys = stateCapitals.keySet()
                        for(String k : keys){        
                        System.out.println("State: "+k);}
                       
                        
                        Collection<String>stateCapitalValue = stateCapitals.values();
                        for(String CurrentState : stateCapitalValue){
                            System.out.println("Capitals "+CurrentState); 
                        
                        }
                        //System.out.println("State and Capitals "+ stateCapitals.get(keys) );
                        
    }
    
    
    }
    

