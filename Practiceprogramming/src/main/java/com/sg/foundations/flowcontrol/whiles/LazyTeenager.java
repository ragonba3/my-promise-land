/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author xolot
 */
public class LazyTeenager {
    
    public static void main(String[] args) {
                
        int cleanYourRm = 1;
        int wontCleanRm = 7;        
       while (cleanYourRm < wontCleanRm){
        System.out.println("Clean your room!!" + (cleanYourRm) +"");
        System.out.println("I'll clean it soon...");
        cleanYourRm ++;
       }
           System.out.println("" + (cleanYourRm) + "");
           System.out.println(" Sorry no more XBOX!!");
    }}
    

