/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicProgrammingConcepts;


/**
 *
 * @author ragonba3
 */
public class summativeSum {
      
    public static void main(String args[]) {
     int [][]array = new int[3][];
        
     
    array [0] = new int[] {1, 90, -33, -55, 67, -16, 28, -55, 15};
    array[1] =  new int[] {999, -60, -77, 14, 160, 301};
    array[2] = new int[] {10, 20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180, 190,200,-99};
    
    int printSum  = 0; 
    for(int i = 0; i < array.length; i++ ){
    for (int j=0; j< array[i].length; j++)
    
    printSum += array[i][j];
        
    
        System.out.println("Array  # " + i +" sum = " +printSum );
        System.out.println();
    
    
        
    }
    
    
}
}
    