import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data = "Java,Python,C++,JavaScript";

        // Tokenize based on comma
        StringTokenizer tokenizer = new StringTokenizer(data, ",");

        while (tokenizer.hasMoreTokens()) {
            System.out.println("Token: " + tokenizer.nextToken());
        }
    }
}
