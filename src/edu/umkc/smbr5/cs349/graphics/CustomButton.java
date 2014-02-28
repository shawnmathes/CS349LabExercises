package edu.umkc.smbr5.cs349.graphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class CustomButton extends JButton {

    public CustomButton(String label) {
        super(label);
    }

    public void paintComponent(Graphics g) {
        // Draw the button as it normally would look
        super.paintComponent(g);

        // Add some graffiti
        g.drawString("Buttons are bad!",5,14);
    }

    // Main entry point
    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom Button");

        JButton customButton = new CustomButton("Press Here");

        Container contentPane = frame.getContentPane();
        contentPane.add(customButton);

        // pack() will resize the frame to its preferred size
        // which is calculated by adding up the preferred size
        // of the components within the frame.
        frame.pack();
       // show() will make the frame visible
        frame.show();
    }
}