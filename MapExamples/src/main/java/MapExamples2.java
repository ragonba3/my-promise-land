
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ragonba3
 */
public class MapExamples2 {
    
    public static void main(String[] args) {
        Map<String, Integer> populations = new HashMap<>();
    
        populations.put("USA", 313000000);
        
        populations.put("Canada", 34000000);
        
        populations.put("United Kingdom", 63000000);
        
        populations.put("Japan", 127000000);
        
        System.out.println("Map size is: "+ populations.size());
        
        Collection<Integer>populationValues = populations.values();
        
        for(Integer currentPopulation : populationValues){
            System.out.println(currentPopulation);
        }
    }
}
    
