package edu.umkc.smbr5.cs349.lab5;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PartA {

    /**
     * @param args
     */
    public static void main(String[] args) {
        JFrame frame = new DrawFrame();
        frame.setVisible(true);
    }
}

@SuppressWarnings("serial")
class DrawFrame extends JFrame {
    public DrawFrame() {
        setTitle("Java Graphics");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyCanvas drawingCanvas = new MyCanvas();
        add(drawingCanvas, BorderLayout.CENTER);
    }
}

@SuppressWarnings("serial")
class MyCanvas extends JPanel implements MouseMotionListener, MouseListener {

    private ArrayList<Line> history = new ArrayList<Line>();
    private int oldX, oldY;

    public MyCanvas() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int newX = e.getX();
        int newY = e.getY();

        Graphics g = getGraphics();
        g.drawLine( oldX,oldY, newX, newY );
        history.add(new Line(oldX, oldY, newX, newY));
        oldX = newX;
        oldY = newY;
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        oldX = e.getX();
        oldY = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Line line : history) {
            g.drawLine(line.X1, line.Y1, line.X2, line.Y2);
        }
    }
    
    class Line {
        public int X1, Y1, X2, Y2;
        public Line (int x1, int y1, int x2, int y2) {
            X1 = x1;
            Y1 = y1;
            X2 = x2;
            Y2 = y2;
        }
    }
}
