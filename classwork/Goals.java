import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Goals {
  public static void main(String[] args) {
    // A JFrame is a window where we can design our UI
    JFrame frame = new JFrame("My app");
    frame.setSize(900, 600);
    frame.setLayout(null);

    // create a Labels, Button, and TextField
    JLabel goalLabel = new JLabel();
    JTextField goalField = new JTextField(15);
    JLabel actualLabel = new JLabel();
    JTextField actualField = new JTextField(15);
    JButton inputButton = new JButton("submit");
    JLabel outputLabel = new JLabel();

    // place and size for components
    goalLabel.setBounds(100,50,300,50);
    goalLabel.setFont(new Font("Arial", Font.PLAIN, 12)); 
    goalLabel.setForeground(Color.BLACK); 
    goalLabel.setText("Type your goal amount below then press 'enter':"); 

    goalField.setBounds(100, 100, 150, 50);

    actualLabel.setBounds(500,50,300,50);
    actualLabel.setFont(new Font("Arial", Font.PLAIN, 12)); 
    actualLabel.setForeground(Color.BLACK); 
    actualLabel.setText("Type your actual amount below then press 'enter':"); 

    actualField.setBounds(500, 100, 150, 50);

    inputButton.setBounds(150, 200, 400, 50);

    outputLabel.setBounds(100,400,450,50);
    outputLabel.setFont(new Font("Arial", Font.PLAIN, 18)); 
    outputLabel.setForeground(Color.RED); 
    
    // add components to JFrame f
    frame.add(goalLabel);
    frame.add(goalField);
    frame.add(actualLabel);
    frame.add(actualField);
    frame.add(inputButton);
    frame.add(outputLabel);
    
    inputButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        double goalAmount = Double.parseDouble(goalField.getText());
        double actualAmount = Double.parseDouble(actualField.getText());
        // ADD CODE HERE
        boolean overGoal = goalAmount < actualAmount;
        boolean exactGoal = goalAmount == actualAmount;
        boolean underGoal = goalAmount > actualAmount;

        outputLabel.setText("Over: " + overGoal + "   " + "Exact: " + exactGoal + "   " + "Under: " + underGoal);
        

      }    });

    // make the frame visible
    frame.setVisible(true);
  }
}
