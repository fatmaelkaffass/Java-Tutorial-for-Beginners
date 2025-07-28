
public class Exceptions {

    // Exception = An event that interrupts the normal flow of a program
    // (Dividing by zero, file not found, mismatch input type)
    // Surround any dangerous code with a try{} block
    // try{}, catch{}, finally{}

    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        int nums[] = new int[5];

        String str = null;

        // the solution of the error to handle the exception
        try {
            j = 18 / 0;

        } catch (ArithmeticException e) {
            System.out.println("Can't divide on zero" + e); // e here reffer to the type of the exception
        }
        try {
            System.out.println(str.length());
        } catch (Throwable e) {
            System.out.println("Somthind went wrong" + e);
        }

        try {
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit" + e);
        }

        System.out.println(j); // it will give an arithmetic exception cause wa can't divide on 0
        System.out.println("bye");

    }
}
