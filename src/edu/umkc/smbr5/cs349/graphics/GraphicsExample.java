package edu.umkc.smbr5.cs349.graphics;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class GraphicsExample {
    // Main entry point
    public static void main(String[] args) {
        JFrame frame = new DrawFrame();
        // The window size is set in the constructor for DrawFrame
        frame.setVisible(true);
    }
}

class DrawFrame extends JFrame {
    public DrawFrame() {
        setTitle("Java Graphics");
        setSize(600, 400);

        addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Components that will appear on a JFrame
        // are added to the content pane.
        Container contentPane = getContentPane();

        MyCanvas drawingCanvas = new MyCanvas();
        contentPane.add(drawingCanvas, BorderLayout.CENTER);
    }
}

    // A JPanel is a component you can draw on.
    // Our panel is listening for mouse events
    class MyCanvas extends JPanel implements MouseListener {

        private int x,y;

        public MyCanvas() {
            addMouseListener(this);
        }

        // --------------------------------------------------------
        // There are 5 methods in the MouseListener (click, double click, etc)
        // interface.
        public void mousePressed(MouseEvent evt) {
            x = evt.getX();
            y = evt.getY();
            Graphics g = getGraphics();
            g.drawOval(x, y, 70, 70);
        }

        // We don't process these events but must declare the methods
        // here because we are obliged to implement all methods in
        // the interface.
        public void mouseReleased(MouseEvent evt) {
        }
        public void mouseClicked(MouseEvent evt) {
        }
        
        public void mouseEntered(MouseEvent evt) {
        }
        
        public void mouseExited(MouseEvent evt) {
        }
        
        // This method is responsible for painting the component.
        public void paintComponent(Graphics g) {
            // This will repaint the background
            // Java uses double buffering by default so the following call
            // repaints the off screen buffer.
            super.paintComponent(g);

            // Draw the last oval recorded
            g.drawOval(x, y, 70, 70);


            Graphics2D g2d = (Graphics2D)g;

            BasicStroke bs = new BasicStroke (20.0F, BasicStroke.CAP_ROUND, 
                BasicStroke.JOIN_BEVEL);
            g2d.setStroke(bs);

            g.drawLine(50, 50, 250, 50);

        }
    }
