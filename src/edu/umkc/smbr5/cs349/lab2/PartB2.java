package edu.umkc.smbr5.cs349.lab2;
// Fix and explain the error in the following program.
public class PartB2 {
    public static void main(String[] args) {
        StringBuffer[] stringBuffers = new StringBuffer[10];

        for (int i = 0; i < stringBuffers.length; i ++) {
            // Requires to create a new object for each element
            stringBuffers[i] = new StringBuffer();
            
            stringBuffers[i].append("StringBuffer at index " + i);
        }
    }
}
