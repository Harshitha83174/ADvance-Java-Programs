/*1c.4.Write a Java program to display elements and their positions in a linked list ( using
l_listobj.get(p) )*/
package Lab1;
import java.util.LinkedList;

public class 1c4_LinkedListElementPositions {
    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colorList = new LinkedList<>();

        // Add colors to the list
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Blue");
        colorList.add("Yellow");
        colorList.add("Black");

        // Display elements and their positions
        System.out.println("Elements and their positions in the LinkedList:");
        for (int i = 0; i < colorList.size(); i++) {
            System.out.println("Position " + i + ": " + colorList.get(i));
        }
    }
}
