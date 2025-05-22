/*5d.Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan*/
package lab5;
import javax.swing.*;
import java.awt.*;

public class 5d_CMYTabbedPaneDemo extends JFrame {

    public CMYTabbedPaneDemo() {
        setTitle("CMY Tabbed Pane Demo");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window

        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels for each color
        JPanel cyanPanel = createColorPanel(Color.CYAN, "CYAN");
        JPanel magentaPanel = createColorPanel(Color.MAGENTA, "MAGENTA");
        JPanel yellowPanel = createColorPanel(Color.YELLOW, "YELLOW");

        // Add tabs with panels
        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Add the tabbed pane to the frame
        add(tabbedPane);
    }

    private JPanel createColorPanel(Color color, String colorName) {
        JPanel panel = new JPanel();
        panel.setBackground(color);

        JLabel label = new JLabel(colorName, SwingConstants.CENTER);
        label.setFont(new Font("SansSerif", Font.BOLD, 24));

        // Set contrasting font color for visibility
        if (color.equals(Color.YELLOW)) {
            label.setForeground(Color.BLACK);
        } else {
            label.setForeground(Color.WHITE);
        }

        panel.setLayout(new BorderLayout());
        panel.add(label, BorderLayout.CENTER);

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CMYTabbedPaneDemo frame = new CMYTabbedPaneDemo();
            frame.setVisible(true);
        });
    }
}
