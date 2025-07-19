public class Conditional_Statements {
    public static void main(String[] args) {
        // 1 - selection or dicision making statements
        // if statements
        int x = 8;
        int y = 28;
        int z = 6;
        if (x >= 8)
            System.out.println("hello");

        // if-else
        if (y > 10 && y <= 20)
            System.out.println("bye");
        else
            System.out.println("hi");

        // if-else ladder
        if (x > y && x > z)
            System.out.println(x);
        else if (y > x && y > z)
            System.out.println(y);
        else
            System.out.println(z);

        // The Ternary condition
        // if expression 1 is true then
        // expression 2 is evaluated otherwise
        // expression 3 is evaluated
        int n = 5;
        int result = 0;
        if (n % 2 == 0)
            result = 10;
        else
            result = 20;

        System.out.println(result);
        // another way
        result = n % 2 == 0 ? 10 : 30; // ? means if true print what after ? if false print what after :
        System.out.println(result);

        // switch statement
        int Day = 8;
        switch (Day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Weekdays");
                break;
        }
        // 2 - Iteration Statements (Loops)
        // while loop
        int i = 1;
        while (i <= 4) {
            System.out.println("Hi" + i);
            i++;

        }

        int i1 = 1;
        while (i1 <= 4) {
            System.out.println("Hi" + i1);
            int j = 1;
            while (j <= 2) {
                System.out.println("Hello" + j);
                j++;
            }

            i1++;

        }
        System.out.println("Bye" + i);
        // Do while loop
        int i2 = 1;
        do {
            System.out.println("Hi" + i2);
            i++;
        } while (i <= 5);

        // For loop
        for (int i3 = 0; i3 <= 5; i3++) {
            System.out.println("Hi " + i3);
            for (int j1 = 1; j1 <= 5; j1++) {
                System.out.println("  " + (j1) + " - " + (j1 + 2));
            }
        }
        // loop in loop called nested loop
    }

}
