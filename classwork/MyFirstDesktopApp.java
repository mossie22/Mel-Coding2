package classwork;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFirstDesktopApp {
  public static void main(String[] args) {
    // A JFrame is a window where we can design our UI
    JFrame frame = new JFrame("My app");
    frame.setSize(500, 500);
    frame.setLayout(null);

    // create a Button and a Label
    JButton helloButton = new JButton("Click Me!");
    JLabel outputLabel = new JLabel();
    JButton goodbyeButton = new JButton(" Don't Click Me!");
    JLabel outputLabel2 = new JLabel();

    // place and size for components
    // setBounds(x position, y position, width, height)
    helloButton.setBounds(100, 100, 300, 50);
    goodbyeButton.setBounds(100, 300, 300, 50);
    outputLabel.setBounds(100,200,400,50);
    outputLabel.setFont(new Font("Arial", Font.PLAIN, 32));
    outputLabel.setForeground(Color.BLUE);
    
    outputLabel2.setBounds(100,400,400,50);
    outputLabel2.setFont(new Font("Arial", Font.PLAIN, 32));
    outputLabel2.setForeground(Color.BLUE);
  
    // add components to JFrame f
    frame.add(helloButton);
    frame.add(outputLabel);
    frame.add(goodbyeButton);
    frame.add(outputLabel2);
    
    // add event listener for button click
    helloButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel.setText("Hello World!");
      }    });
    goodbyeButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        outputLabel2.setText("Goodbye World!");
      }    });
    
    // make the frame visible
    frame.setVisible(true);
  }
}
