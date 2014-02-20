package edu.umkc.smbr5.cs349.project1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.*;

@SuppressWarnings("serial")
public class PhotoAlbum extends JFrame implements ActionListener {
    
    private int currentCount = 1;
    private int totalCount = 3;
    
    private JLabel mainLabel = new JLabel("Main label.");
    
    private JTextField currentTextField = new JTextField(String.valueOf(currentCount));
    private JLabel totalLabel = new JLabel("of " + totalCount);
    private JButton prevButton = new JButton("Previous");
    private JButton nextButton = new JButton("Next");

    public PhotoAlbum() {
        super("Photo Album");
        
        JPanel main = new JPanel();
        main.add(mainLabel);
        
        JPanel selector = new JPanel(new FlowLayout(FlowLayout.LEFT));
        selector.add(currentTextField);
        selector.add(totalLabel);
        selector.add(prevButton);
        selector.add(nextButton);
        
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(main, BorderLayout.CENTER);
        contentPane.add(selector, BorderLayout.SOUTH);
    }
    
    public static void main(String[] args) {
        JFrame frame = new PhotoAlbum();
        
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        
    }
}
