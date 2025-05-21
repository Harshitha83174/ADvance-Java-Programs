/*2a. Develop a java program for performing various string operations with different string
handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String
Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith()*/

package Lab2;
public class 2a_StringOperationsDemo {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 of str1: " + str1.charAt(1));

        // 3. String Comparison
        System.out.println("str1 equals 'hello'? " + str1.equals("hello"));           // case-sensitive
        System.out.println("str1 equalsIgnoreCase 'hello'? " + str1.equalsIgnoreCase("hello"));

        // 4. String Searching
        String str3 = "Welcome to Java programming!";
        System.out.println("Index of 'Java' in str3: " + str3.indexOf("Java"));
        System.out.println("Contains 'programming'? " + str3.contains("programming"));

        // 5. Substring Operations
        System.out.println("Substring from index 11: " + str3.substring(11));
        System.out.println("Substring from 11 to 15: " + str3.substring(11, 15));

        // 6. String Modification
        String replaced = str3.replace("Java", "Python");
        System.out.println("After replacement: " + replaced);

        // 7. Whitespace Handling
        String str4 = "   Trim this string   ";
        System.out.println("Original: '" + str4 + "'");
        System.out.println("Trimmed: '" + str4.trim() + "'");

        // 8. String Concatenation
        String concat = str1 + " " + str2;
        System.out.println("Concatenated string: " + concat);

        // 9. String Splitting
        String fruits = "Apple,Banana,Orange";
        String[] fruitArray = fruits.split(",");
        System.out.println("Fruits:");
        for (String fruit : fruitArray) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(6, 11, " Java");
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        int age = 25;
        String name = "Alice";
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted string: " + formatted);

        // 12. Email Validation using contains(), startsWith(), endsWith()
        String email = "student@example.com";
        if (email.contains("@") && email.startsWith("student") && email.endsWith(".com")) {
            System.out.println("Valid email format!");
        } else {
            System.out.println("Invalid email format!");
        }
    }
}
