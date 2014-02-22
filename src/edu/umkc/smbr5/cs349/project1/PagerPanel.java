package edu.umkc.smbr5.cs349.project1;

import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class PagerPanel extends JPanel {
    private int selectedItemIndex = 1;
    private int itemCount = 3;
    
    private JTextField currentTextField = new JTextField();
    private JLabel totalLabel = new JLabel();
    private JButton prevButton = new JButton("Previous");
    private JButton nextButton = new JButton("Next");
    
    /**
     * @return the number of items
     */
    public int getItemCount() {
        return itemCount;
    }
    
    /**
     * @return the index number for the selected item
     */
    public int getSelectedItemIndex() {
        return selectedItemIndex;
    }
    
    /**
     * @param selectedItemIndex the selected item index to set
     */
    public void setSelectedItemIndex(int selectedItemIndex) {
        if (selectedItemIndex < 1 || selectedItemIndex > getItemCount()) {
            throw new IllegalArgumentException("selectedItemIndex is out of range.");
        }
        
        this.selectedItemIndex = selectedItemIndex;
        updateDisplay();
    }
    
    public PagerPanel () {
        super();
        setLayout(new FlowLayout(FlowLayout.LEFT));
        
        prevButton.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSelectedItemIndex(getSelectedItemIndex() - 1);
            }
        });
        
        nextButton.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSelectedItemIndex(getSelectedItemIndex() + 1);
            }
        });
        
        currentTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                char key = e.getKeyChar();
                if (key == KeyEvent.VK_ENTER) {
                    try {
                        int value = Integer.parseInt(currentTextField.getText());
                        setSelectedItemIndex(value);
                    } catch (NumberFormatException nfex) {
                        updateDisplay();
                    } catch (IllegalArgumentException iaex) {
                        updateDisplay();
                    }
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {
                
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
            }
        });
        
        add(currentTextField);
        add(totalLabel);
        add(prevButton);
        add(nextButton);
        
        updateDisplay();
    }
    
    private void updateDisplay() {
        currentTextField.setText(String.valueOf(getSelectedItemIndex()));
        totalLabel.setText("of " + getItemCount());
        prevButton.setEnabled(getSelectedItemIndex() > 1);
        nextButton.setEnabled(getSelectedItemIndex() < getItemCount());
    }
}
