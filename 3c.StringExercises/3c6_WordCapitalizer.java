/*3c.6.Write a Java Program for Capitalizing the first letter of each word. using user defined function
capitalizeWords()*/
package Lab3;
import java.util.Scanner;

public class 3c6_WordCapitalizer {

    // User-defined function to capitalize the first letter of each word
    public static String capitalizeWords(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        // Split the string into words using whitespace
        String[] words = str.trim().split("\\s+");
        StringBuilder capitalized = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                // Capitalize first letter and add the rest of the word
                capitalized.append(Character.toUpperCase(word.charAt(0)))
                           .append(word.substring(1).toLowerCase())
                           .append(" ");
            }
        }

        // Trim the final result to remove trailing space
        return capitalized.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Capitalize each word
        String result = capitalizeWords(input);

        // Output
        System.out.println("Capitalized: " + result);

        scanner.close();
    }
}

