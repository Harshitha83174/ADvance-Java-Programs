/*3c.8.Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()*/
package Lab3;
import java.util.Scanner;

public class 3c8_NumericChecker {

    // User-defined function to check if a string is numeric
    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        // Use regular expression to match only digits
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string to check if it's numeric: ");
        String input = scanner.nextLine();

        // Check using isNumeric function
        if (isNumeric(input)) {
            System.out.println("✅ The string contains only numeric characters.");
        } else {
            System.out.println("❌ The string does NOT contain only numeric characters.");
        }

        scanner.close();
    }
}
