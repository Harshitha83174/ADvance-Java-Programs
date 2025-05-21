/*3c.7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/
package Lab3;
import java.util.Scanner;

public class 3c7_StringTruncator {

    // User-defined function to truncate a string and add ellipsis
    public static String truncate(String str, int maxLength) {
        if (str == null || maxLength < 0) {
            return "";
        }

        if (str.length() <= maxLength) {
            return str;
        } else if (maxLength <= 3) {
            // If maxLength is very small, return only ellipsis up to maxLength
            return "...".substring(0, maxLength);
        } else {
            // Truncate and add ellipsis
            return str.substring(0, maxLength - 3) + "...";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Enter max length to truncate to: ");
        int maxLength = scanner.nextInt();

        // Call truncate function
        String result = truncate(input, maxLength);

        // Output the result
        System.out.println("Truncated string: " + result);

        scanner.close();
    }
}
