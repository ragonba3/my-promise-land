/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundation.flowcontrol.fors;

/**
 *
 * @author ragonba3
 */
public class ForAndTwentyBlackbirds {
    
    public static void main(String[] args) {
        int birdsInPie = 0;
        //changing for values the number changes
        for (int i = 1; i < 24; i++) {
            System.out.println("Blackbird #" + i + " goes in to pie");
            birdsInPie++;
        }
            System.out.println("There are " + birdsInPie + " birds in there!");
            System.out.println("Quite the pie full!");
        }
    }
    

