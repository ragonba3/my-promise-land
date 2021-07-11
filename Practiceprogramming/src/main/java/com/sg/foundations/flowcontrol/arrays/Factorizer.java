package com.sg.foundations.flowcontrol.arrays;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ragonba3
 */
public class Factorizer {

    public static void main(String[] args) {
        int i, Number, Sum = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("What number would you like to factor? ");
        Number = scan.nextInt();

        for (i = 1; i <= Number; i++) {
            if (Number % i == 0) {
                System.out.format("Factors of : " + "%d .",  Number );
                
                
        for (i = 1; i < Number; i++) {
            if (Number % i == 0) {
                Sum = Sum + i;
                System.out.format("%d",  i);
                    }
                }
                if (Sum == Number) {
                    System.out.format("\n %d is a perfect number.",i);
                } else {
                    System.out.format("\n %d is not a perfect Number",i);
                }
            }
        }
    }

}
