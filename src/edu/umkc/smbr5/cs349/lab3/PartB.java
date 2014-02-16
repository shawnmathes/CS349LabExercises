/*
Write a routine f() that throws a checked exception 1/3 of the time, an unchecked exception 1/3 of 
the time and no exceptions 1/3 of the time.

Hint:
Random ran = new Random();
ran.nextInt(3); // will return 0, 1 or 2 with equal probability

Call the routine 100 times and print a count of how many times a checked exception was thrown, 
how many times an unchecked exception was thrown and how many times no exception at all was thrown. 
Example output:

f() was called 100 times. 34 times it threw a checked exception; 33 times it threw an unchecked 
exception and 33 times no exception at all was thrown.

 */
package edu.umkc.smbr5.cs349.lab3;

import java.util.Random;

public class PartB {

    /**
     * @param args
     */
    public static void main(String[] args) {
        final int cycle = 100;
        int checkedExceptionCount = 0;
        int uncheckedExceptionCount = 0;
        int noExceptionCount = 0;
        
        for (int i = 0; i < cycle; i++) {
            try {
                f();
                noExceptionCount++;
            } catch (Exception e) {
                checkedExceptionCount++;
            } catch (Error e) {
                uncheckedExceptionCount++;
            }
        }
        
        System.out.println(
                "f() was called " + cycle + " times. " +  
                checkedExceptionCount + " times it threw a checked exception; " +
                uncheckedExceptionCount + " times it threw an unchecked exception and " + 
                noExceptionCount + " times no exception at all was thrown.");
    }
    
    private static void f() throws Exception {
        Random ran = new Random();
        int p = ran.nextInt(3);
        
        switch (p) {
        case 0:
            // a checked exception 1/3 of the time
            throw new Exception();
        case 1:
            // an unchecked exception 1/3 of the time
            throw new Error();
        case 2:
            // no exceptions 1/3 of the time
            return;
        }
    }

}
