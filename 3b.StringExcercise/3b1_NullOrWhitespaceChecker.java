/*Write a Java Program for Checking if a given string is null or contains only whitespace using user
defined function isNullOrEmpty().*/
package Lab3;
import java.util.Scanner;

public class 3b1_NullOrWhitespaceChecker {

    // User-defined function to check if string is null, empty or whitespace-only
    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the user-defined function
        if (isNullOrEmpty(input)) {
            System.out.println("The string is either null, empty, or contains only whitespace.");
        } else {
            System.out.println("The string is valid: '" + input + "'");
        }

        scanner.close();
    }
}
