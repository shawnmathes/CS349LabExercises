package edu.umkc.smbr5.cs349.project1;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class PhotoPanel extends JPanel {
    
    JLabel descriptionLabel = new JLabel("Description:");
    JTextField descriptionTextField = new JTextField();
    JLabel dateLabel = new JLabel("Date:");
    JTextField dateTextField = new JTextField();
    
    public PhotoPanel() {
        super();
        
        descriptionTextField.setText("This person is thinking...I still might land this!");
        dateTextField.setText("8/15/2013");
        
        add(descriptionLabel);
        add(descriptionTextField);
        add(dateLabel);
        add(dateTextField);
    }
}
