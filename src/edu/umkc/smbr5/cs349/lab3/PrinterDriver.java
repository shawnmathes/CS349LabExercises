package edu.umkc.smbr5.cs349.lab3;

public class PrinterDriver {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Printer p1 = new Printer();
        Printer p2 = new Printer();

        p1.add("value to print");
        p1.add("Another value");
        p1. printNext();

        p2.add("Another value");
        p2.printNext();
        
        // Print about and instances
        System.out.println("About: " + Printer.about());
        System.out.println("Total Instances: " + Printer.totalInstances());
    }

}
