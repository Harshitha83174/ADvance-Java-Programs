/*1c.2.Write a Java program to iterate a linked list in reverse order (using
objlist.descendingIterator())*/

package Lab1;

import java.util.LinkedList;
import java.util.Iterator;

public class 1c2_LinkedListReverseIteration {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        // Display original list
        System.out.println("Original color list: " + colors);

        // Reverse iteration using descendingIterator()
        System.out.println("Iterating in reverse order:");
        Iterator<String> reverseIterator = colors.descendingIterator();

        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}
