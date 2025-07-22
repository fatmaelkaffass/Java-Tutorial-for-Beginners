class calculator {

    public int add(int n1, int n2) {
        int result = n1 + n2;

        System.out.println("The value of Addition is = " + result);
        return 0;

    }

}

public class classes {

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        // we should make an object of the class
        calculator clac = new calculator();
        int result = clac.add(4, 5);// we can write inside the add(num1,num2) also and it will work
        // int result = num1 + num2;
        // System.out.println(result);
    }

}
