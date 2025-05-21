/*4b.Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
pressed” depending upon the Jbutton either Srilanka or India is pressed by implementing the
event handling mechanism with addActionListener( ).*/

package Lab4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class 4b_CountryButtonDemo extends JFrame implements ActionListener {

    private JButton btnSrilanka;
    private JButton btnIndia;
    private JLabel messageLabel;

    public CountryButtonDemo() {
        setTitle("Country Button Demo");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Center the frame

        // Create buttons
        btnSrilanka = new JButton("Srilanka");
        btnIndia = new JButton("India");

        // Create label to show messages
        messageLabel = new JLabel("Press a button", SwingConstants.CENTER);
        messageLabel.setFont(new Font("SansSerif", Font.PLAIN, 16));

        // Add ActionListeners
        btnSrilanka.addActionListener(this);
        btnIndia.addActionListener(this);

        // Layout setup
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnSrilanka);
        buttonPanel.add(btnIndia);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(buttonPanel, BorderLayout.CENTER);
        getContentPane().add(messageLabel, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Identify which button was pressed and update label
        if (e.getSource() == btnSrilanka) {
            messageLabel.setText("Srilanka is pressed");
        } else if (e.getSource() == btnIndia) {
            messageLabel.setText("India is pressed");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CountryButtonDemo frame = new CountryButtonDemo();
            frame.setVisible(true);
        });
    }
}
