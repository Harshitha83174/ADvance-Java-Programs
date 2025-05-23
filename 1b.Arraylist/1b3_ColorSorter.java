/*Write a java program for getting different colors through ArrayList interface and sort them
using Collections.sort( ArrayListObj)*/
package Lab1;

import java.util.ArrayList;
import java.util.Collections;

public class 1b3_ColorSorter {
    public static void main(String[] args) {
        // Create an ArrayList of colors
        ArrayList<String> colors = new ArrayList<>();

        // Add colors to the list
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original color list: " + colors);

        // Sort the colors
        Collections.sort(colors);

        // Display sorted list
        System.out.println("Sorted color list: " + colors);
    }
}
