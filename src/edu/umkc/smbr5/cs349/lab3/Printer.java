/*
 * 
Part A

Implement the following class design. Think carefully about whether each method and 
variable should be static or non-static.

class Printer
    LinkedList<Integer> fifoPrintQueue;

    void add(String); // add a string to the print queue
    void printNext(); // print the item at the front of the queue
                      // Hint: use fifoPrintQueue.removeFirst()
    int totalInstances(); // returns the number of instances
                          // of this class that have been
                          // created
    String about(); // returns a constant string that describes
                    // this class. (Return any string of
                    // characters you like

 */

package edu.umkc.smbr5.cs349.lab3;

import java.util.LinkedList;

public class Printer {
    private LinkedList<String> fifoPrintQueue = new LinkedList<String>();
    
    private static int instanceCount = 0;
    
    public Printer() {
        instanceCount++;
    }
    
    protected void finalize() {
        instanceCount--;
    }
    
    public void add(String s) {
        fifoPrintQueue.add(s);
    }
    
    public void printNext() {
        fifoPrintQueue.removeFirst();
    }
    
    public static int totalInstances() {
        return instanceCount;
    }
    
    public static String about() {
        return "About Printer";
    }
}
