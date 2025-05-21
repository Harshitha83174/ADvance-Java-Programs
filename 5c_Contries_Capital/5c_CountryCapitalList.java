/*5c.Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list.*/
package lab5;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class 5c_CountryCapitalList extends JFrame {

    private JList<String> countryList;
    private Map<String, String> countryCapitalMap;

    public CountryCapitalList() {
        setTitle("Country Capital List");
        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);  // Center window

        // Initialize countries and their capitals
        countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("USA", "Washington, D.C.");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("Vietnam", "Hanoi");
        countryCapitalMap.put("Canada", "Ottawa");
        countryCapitalMap.put("Denmark", "Copenhagen");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Great Britain", "London");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("Africa", "Pretoria (executive)");
        countryCapitalMap.put("Greenland", "Nuuk");
        countryCapitalMap.put("Singapore", "Singapore");

        // Create JList with country names
        String[] countries = countryCapitalMap.keySet().toArray(new String[0]);
        countryList = new JList<>(countries);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        // Add listener to display capitals on selection
        countryList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    java.util.List<String> selectedCountries = countryList.getSelectedValuesList();
                    System.out.println("Selected capitals:");
                    for (String country : selectedCountries) {
                        String capital = countryCapitalMap.get(country);
                        System.out.println(country + " -> " + capital);
                    }
                    System.out.println("---------------------");
                }
            }
        });

        // Put list in a scroll pane
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Add scroll pane to the frame
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CountryCapitalList frame = new CountryCapitalList();
            frame.setVisible(true);
        });
    }
}
