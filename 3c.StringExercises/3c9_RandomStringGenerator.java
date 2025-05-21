/*3c.9.Write a Java Program for Creating a random string of a specified length using user defined
function generateRandomString()*/
package Lab3;
import java.util.Random;
import java.util.Scanner;

public class 3c9_RandomStringGenerator {

    private static final String CHAR_POOL = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    // User-defined function to generate a random string of given length
    public static String generateRandomString(int length) {
        if (length <= 0) {
            return "";
        }

        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHAR_POOL.length());
            sb.append(CHAR_POOL.charAt(index));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input length from user
        System.out.print("Enter the desired length of the random string: ");
        int length = scanner.nextInt();

        // Generate random string
        String randomStr = generateRandomString(length);

        // Output
        System.out.println("Random String: " + randomStr);

        scanner.close();
    }
}
