/*Write a Java program to iterate through all elements in a linked list starting at the
specified position ( 2nd) using iterator ( hint : Iterator iteratorobj = listobj.listIterator(1))*/
package Lab1;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class 1c1_LinkedListIteratorFromSecond {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");

        // Display full list
        System.out.println("Full color list: " + colors);

        // Start iteration from 2nd element (index 1)
        System.out.println("Iterating from 2nd element:");
        Iterator<String> iterator = colors.listIterator(1);  // index 1 = 2nd element

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
