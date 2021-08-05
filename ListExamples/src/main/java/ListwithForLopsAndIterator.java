
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ragonba3
 */
public class ListwithForLopsAndIterator {
    
    public static void main(String[] args) {
        //create an ArrayList of String objetcs
        List<String> stringList = new ArrayList<>();
        
        //add String object to our lis
        stringList.add("My First string: ");
        
        //add another String object to our list
        stringList.add("My Second string: ");
        
        //add another String object to our list
        stringList.add("My Third string: ");
        
        //add another String object tou list
        stringList.add("My Fourth string: ");
        
        System.out.println("List size: " + stringList.size());
        
        for (String currentString : stringList){
            System.out.println(currentString);
        }
        
        Iterator<String> iterator = stringList.iterator();
        
        while(iterator.hasNext()){
            String currentString =iterator.next();
            System.out.println(currentString);
        }
    }
    
}
