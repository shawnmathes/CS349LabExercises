package edu.umkc.smbr5.cs349.project1;

import java.awt.BorderLayout;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class PhotoAlbum extends JFrame {
    
    PhotoPanel photoPanel = new PhotoPanel();
    PagerPanel pagerPanel = new PagerPanel();
    
    public PhotoAlbum() {
        super("Photo Album");        
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
