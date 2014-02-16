package edu.umkc.smbr5.cs349.lab2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Vector;


/*
 * Write a program that reads a series of integers (stop reading when input is the empty string) 
 * and stores them in a Vector or ArrayList. Justify your choice. Use generics in the declaration 
 * of your collection class (Vector or ArrayList) using the type String or Integer. Justify your 
 * choice. Sort the elements and print the results.
 * 
 */

public class PartC2 {
    public static void main(String[] args) throws IOException  {
        Vector<Integer> numbers = new Vector<Integer>();
        
        // Read a series of integers
        System.out.print("Enter a number (blank to end): ");
        Boolean end = false;
        do {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            String in = br.readLine();            
            
            try {
                int number = Integer.parseInt(in);
                numbers.add(number);
                System.out.print("Enter another number (blank to end): ");
            } catch (NumberFormatException nfex) {
                end = true;
            }
        } while (!end);
        if (numbers.size() == 0) {
            return;
        }
        
        // Sort
        Collections.sort(numbers);
        
        // Print
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println((i + 1) + ":  " + numbers.get(i));
        }
    }
}
