/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ragonba3.simplefileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author ragonba3
 */
public class SimpleFileIO {
    
    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter(new FileWriter("outFile.txt"));
        
        out.println("this a line in my file...");
        out.println("this is a line in my file..");
        out.println("this a third line in my file");
        out.flush();
        out.close();
        
        Scanner sc = new Scanner( new BufferedReader(new FileReader("outFile.txt ")));
        
        while (sc.hasNext()){
            String currentLine =sc.nextLine();
            System.out.println(currentLine);
        }
    
        System.out.println("That's all content in the file.");
    }
    
    
}
