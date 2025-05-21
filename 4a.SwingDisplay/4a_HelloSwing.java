/*4a.Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
Programming in Blue color plain font with font size of 32 using Jframe and Jlabel*/
package Lab4;
import javax.swing.*;
import java.awt.*;

public class 4a_HelloSwing {

    public static void main(String[] args) {
        // Create a new JFrame (window)
        JFrame frame = new JFrame("Swing Hello Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 150);
        frame.setLocationRelativeTo(null);  // Center the frame on screen

        // Create a JLabel with the desired text
        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", SwingConstants.CENTER);

        // Set font to Plain, size 32
        label.setFont(new Font("SansSerif", Font.PLAIN, 32));
        
        // Set text color to blue
        label.setForeground(Color.BLUE);

        // Add the label to the frame's content pane
        frame.getContentPane().add(label);

        // Make the frame visible
        frame.setVisible(true);
    }
}
