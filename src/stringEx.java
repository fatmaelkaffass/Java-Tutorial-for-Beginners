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
    }
}