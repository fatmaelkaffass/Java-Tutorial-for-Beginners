class market {
    public void playMusic() {
        System.out.println("playing Music ...");
    }

    public String getMeAPen(int cost) {
        if (cost >= 10)
            return "pen";
        else
            return "nothing";
    }
}

class calculator { // in this class i will show the overloading of a method
                   // we can create more than one method with the same name but have different
                   // number of parameters
                   // or different datatype of the return datatype
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public double add(int n1, int n2, double n3) {
        return n1 + n2 + n3;
    }
}

public class methods_and_ovrloading_of_methods {

    public static void main(String[] args) {
        market mark = new market();
        mark.playMusic();
        String str = mark.getMeAPen(8);
        System.out.println(str);

        calculator calc = new calculator();
        int num1 = calc.add(1, 02);
        double num2 = calc.add(1, 2, 2.5);
        int num3 = calc.add(1, 2, 3);
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }
}
