import java.util.StringTokenizer;

public class stringEx {
    public static void main(String[] args) {
        String str = "Hello, Java!";

        // Length of the string
        System.out.println("Length: " + str.length());

        // Substring
        System.out.println("Substring: " + str.substring(7, 11)); // "Java"

        // Replacing part of the string
        System.out.println("Replaced: " + str.replace("Java", "World"));

        // Convert to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // Check if string contains a substring
        System.out.println("Contains 'Hello'? " + str.contains("Hello"));

        // Equals comparison
        String str2 = "hello, java!";
        System.out.println("Equals ignoring case: " + str.equalsIgnoreCase(str2));

        // get a specific index
        System.out.println("The Second Character is : " + str.charAt(1));
        // _______________________________________________
        // StringBuffer Example
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println("After append: " + sb);

        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        sb.delete(5, 6);
        System.out.println("After delete: " + sb);

        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);

        // _______________________________________________
        // StringBuilder Example
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" Java");
        System.out.println("After append: " + sb1);

        sb1.reverse();
        System.out.println("Reversed: " + sb1);

        sb1.deleteCharAt(0);
        System.out.println("After deleteCharAt: " + sb1);

        sb1.insert(0, "Hi");
        System.out.println("After insert: " + sb1);
        // _______________________________________________
        // Tokenize based on comma
        String data = "Java,Python,C++,JavaScript";

        StringTokenizer tokenizer = new StringTokenizer(data, ",");

        while (tokenizer.hasMoreTokens()) {
            System.out.println("Token: " + tokenizer.nextToken());
        }
    }
}