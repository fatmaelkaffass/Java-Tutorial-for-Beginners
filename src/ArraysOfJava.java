import java.util.Arrays;
import java.util.Scanner;

class Students {
    int ID;
    String Name;
    double Marks;
}

public class ArraysOfJava {
    // class of students related to the part of arrays of objects

    public static void main(String[] args) {

        String[] friut = { "apple", "orange", "banana", "coconut" };
        int numOfFriuts = friut.length;// to grt thr length of an array
        System.out.println("the number of friuts is = " + numOfFriuts);
        System.out.println(friut[0]);// to print a specific element in the array
        Arrays.sort(friut);// to sort the elements alphabitically
        for (int f = 0; f < numOfFriuts; f++) {
            System.out.println(friut[f]);// to print all elements
        }
        Arrays.fill(friut, "pineapple");// to fill all element by new value
        for (int f = 0; f < numOfFriuts; f++) {
            System.out.println(friut[f] + " ");// to print all elements
        }
        // _____________________________________________
        // another eaxample:
        int nums[] = { 3, 7, 2, 4 };
        nums[1] = 6;
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        for (int i = 0; i < 4; i++) {
            System.out.println(nums[i]);
        }
        // _____________________________________________
        // Enter USER Input into an Array :
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
        System.out.println();
        scanner.close();
        // _____________________________________________
        // Multi Dimensional Array

        int nums1[][] = new int[3][4];

        for (int i1 = 0; i1 < 3; i1++) {

            for (int j = 0; j < 4; j++) {
                System.out.print(nums1[i1][j] + " ");
            }
            System.out.println();

        }
        // _____________________________________________
        // Jagged Array & 3D Array
        int nums3[][] = new int[3][];

        nums3[0] = new int[3];
        nums3[1] = new int[4];
        nums3[2] = new int[2];
        // or we can use the next formula
        // unt nums3[][][] = new int[3][4][2];
        for (int i3 = 0; i3 < nums3.length; i3++) {
            for (int j3 = 0; j3 < nums3[i3].length; j3++) {
                nums3[i3][j3] = (int) (Math.random() * 10);
            }
        }
        for (int n[] : nums3) {
            for (int m : n) {
                System.out.print(m + " "); // print on same line note the we use print not prinln
            }
            System.out.println(); // go to next line after each row
        }
        // _____________________________________________
        // Array of Objects
        Students student1 = new Students();// Create student objects
        student1.ID = 1;
        student1.Name = "Fatma";
        student1.Marks = 100;

        Students student2 = new Students();
        student2.ID = 2;
        student2.Name = "Rahma";
        student2.Marks = 90;

        Students student3 = new Students();
        student3.ID = 3;
        student3.Name = "Marwa";
        student3.Marks = 80;
        Students students[] = new Students[3];// Initialize array of students
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for (Students s : students)// Loop through array and print details
        {

            System.out.println(s.ID + " : " + s.Name + " : " + s.Marks);

        }
        System.out.println();

    }

}
