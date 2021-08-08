/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ragonba3.studentroster;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ragonba3
 */
public class studentRosterIO {
    
    public static void main(String[] args)throws Exception {
        try (PrintWriter out = new PrintWriter(new FileWriter("studenRoster.txt"))) {
            out.println("0001::John::Doe::Java-August 2014");
            out.println("002::Sally::Smith::Java-April 2014");
            out.println("003::Jonh::Jones::.Net-Han 2014");
            out.flush();
        }
        
        Scanner sc = new Scanner( new BufferedReader(new FileReader("studentRoster.txt ")));
    
        while (sc.hasNext()){
            String currentLine =sc.nextLine();
            System.out.println(currentLine);
    }
    
    
    
    
}
}
