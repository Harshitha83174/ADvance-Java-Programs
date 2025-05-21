/*Develop a java program for performing various string operations with different string
handling functions directed as follows:
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String Concatenation,
String Splitting, StringBuilder Demo, String Formatting , Validate Email with contains( ) and
startsWith() and endsWith()*/
package Lab3;
public class 3a_StringOperationsDemo {
    public static void main(String[] args) {
        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        System.out.println("str1 equals str2? " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase 'hello'? " + str1.equalsIgnoreCase("hello"));

        // 4. String Searching
        String str3 = "Java is a powerful programming language";
        System.out.println("Does str3 contain 'powerful'? " + str3.contains("powerful"));
        System.out.println("Index of 'programming' in str3: " + str3.indexOf("programming"));

        // 5. Substring Operations
        System.out.println("Substring from index 8: " + str3.substring(8));
        System.out.println("Substring from index 8 to 17: " + str3.substring(8, 17));

        // 6. String Modification
        String modified = str3.replace("Java", "Python");
        System.out.println("Modified string: " + modified);

        // 7. Whitespace Handling
        String strWithSpaces = "   Trim this string   ";
        System.out.println("Original with spaces: '" + strWithSpaces + "'");
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'");

        // 8. String Concatenation
        String concatenated = str1 + " " + str2;
        System.out.println("Concatenated string: " + concatenated);

        // 9. String Splitting
        String sentence = "Apple,Banana,Orange,Grapes";
        String[] fruits = sentence.split(",");
        System.out.println("Splitted fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.insert(4, " Language");
        sb.replace(0, 4, "Python");
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int age = 22;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted string: " + formatted);

        // 12. Email Validation using contains(), startsWith(), endsWith()
        String email = "student@aiet.edu";
        boolean isValid = email.contains("@") && email.startsWith("student") && email.endsWith(".edu");

        System.out.println("Email: " + email);
        if (isValid) {
            System.out.println("✅ Valid Email Format");
        } else {
            System.out.println("❌ Invalid Email Format");
        }
    }
}

