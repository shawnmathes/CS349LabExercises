package edu.umkc.smbr5.cs349.project1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class PhotoAlbum extends JFrame {
    
    PhotoPanel photoPanel = new PhotoPanel();
    PagerPanel pagerPanel = new PagerPanel();
    
    public PhotoAlbum() {
        super("Photo Album");
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
       // Create the first menu.
        JMenu menu = new JMenu("File");
        menu.setMnemonic(KeyEvent.VK_F);
        menuBar.add(menu);

        // Create an item for the first menu
        JMenuItem exitMenuItem = new JMenuItem("Exit",KeyEvent.VK_X);
        exitMenuItem.addActionListener(new ActionListener () {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }});

        //menuItem.setMnemonic(KeyEvent.VK_X); // set in constructor
        menu.add(exitMenuItem);
        
        setLayout(new BorderLayout());
        add(photoPanel, BorderLayout.CENTER);
        add(pagerPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
    }
    
    public static void main(String[] args) {
        JFrame frame = new PhotoAlbum();
        frame.setVisible(true);
    }
}
