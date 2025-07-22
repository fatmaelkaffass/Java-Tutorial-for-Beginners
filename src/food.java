import java.util.Scanner;

public class food {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // create a new object called scanner to get the inputs from the
                                                  // user
        String[] foods = new String[5];// create a new empty array with aspecific num of indexes
        for (int fo = 0; fo < foods.length; fo++) {
            System.out.println("Enter a Food: ");
            foods[fo] = scanner.nextLine();
        }
        System.out.println("You entered:");
        for (String food : foods)// new style of for loop
        {
            System.out.print(food + " ");
        }
        scanner.close();
    }
}
