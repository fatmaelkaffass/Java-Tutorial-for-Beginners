import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Ducking_Example_by_BufferReader {
    // This method "ducks" the exception using 'throws' (passes it to caller)
    String getName() throws IOException {
        // Create a reader to get input from the user
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter your name : ");
        return reader.readLine(); // This line can throw IOException
    }

}

class Ducking_Example_by_ScannerInput {
    int getAge() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your age");
        int age = scanner.nextByte();
        return age;
    }
}

class TryWithResourceExample {
    // This class demonstrates try-with-resources using Scanner
    // It’s a special type of try block in Java that automatically closes resources
    // (like files, input streams, scanners, etc.) after you're done using them —
    // even if an exception happens.
    // This helps you avoid memory leaks and forgetfulness—Java will clean up for
    // you!
    void getCity() {
        // Scanner is auto-closed after try block

        try (Scanner scanner1 = new Scanner(System.in)) {
            System.out.print("Enter your city: ");
            String city = scanner1.nextLine();
            System.out.println("You live in " + city);
        }

        catch (Exception e) {
            System.out.println("Error reading city: " + e.getMessage());
        }

    }
}

public class Eception_By_Ducking {
    public static void main(String[] args) {
        try {
            Ducking_Example_by_BufferReader example = new Ducking_Example_by_BufferReader();
            String e = example.getName();
            System.out.println("hello, " + e + "!");

        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());

        }
        Ducking_Example_by_ScannerInput input = new Ducking_Example_by_ScannerInput();
        int age = input.getAge();
        System.out.println("your age is " + age + " years old. ");

        TryWithResourceExample tryRes = new TryWithResourceExample();
        tryRes.getCity();
        System.out.println("Done! All input examples executed.");

    }
}
