/*3b.5.Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()*/
package Lab3;
import java.util.Scanner;

public class 3b5_WhitespaceRemover {

    // User-defined function to remove all whitespace characters
    public static String removeWhitespace(String str) {
        if (str == null) {
            return null;
        }
        // \s matches all whitespace characters (space, tab, newline, etc.)
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string from user
        System.out.print("Enter a string with whitespace: ");
        String input = scanner.nextLine();

        // Remove whitespace using the function
        String noWhitespace = removeWhitespace(input);

        // Display result
        System.out.println("String without whitespace: '" + noWhitespace + "'");

        scanner.close();
    }
}

