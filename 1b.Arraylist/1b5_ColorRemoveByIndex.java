/*Write a java program for getting different colors through ArrayList interface and delete nth
element from the ArrayList object by using remove by index*/

package Lab1;
import java.util.ArrayList;
import java.util.Scanner;

public class 1b5_ColorRemoveByIndex {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original color list: " + colors);

        // Get input from user: n-th element to remove
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position (n) of the element to remove (1-based index): ");
        int n = scanner.nextInt();

        // Convert to 0-based index
        int index = n - 1;

        // Check if index is valid
        if (index >= 0 && index < colors.size()) {
            String removed = colors.remove(index);
            System.out.println("Removed element at position " + n + ": " + removed);
        } else {
            System.out.println("Invalid position! List size is: " + colors.size());
        }

        // Display updated list
        System.out.println("Updated color list: " + colors);

        scanner.close();
    }
}

