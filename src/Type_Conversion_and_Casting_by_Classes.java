class A {
    public void show1() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show2() {
        System.out.println("in B show");
    }

}

public class Type_Conversion_and_Casting_by_Classes {
    public static void main(String[] args) {
        int age = 30;
        System.out.println(age);
        System.out.println(3 + 5);
        // type conversion and casting

        // 1-Upcasting : called implicit(widening)which automatically hapend
        int num = 100;
        long bignum = num;
        System.out.println(bignum);

        // 2-Downcasting : called explicit(narrowing)manually from large to small
        double pi = 3.14159;
        int approxpi = (int) pi;// syntax is : (TargetType)value
        System.out.println(approxpi);

        // all above (in main) is a simple of the idea, now we will discus more complex
        // example by classes
        A a = new A();
        a.show1();
        A a1 = new B();// Upcasting: from B to A (allowed implicitly)
        a1.show1();
        // a1.show2(); // غير مسموح لأن المرجع من النوع A
        B b1 = (B) a1;
        b1.show2();// Downcasting: from A to B (allowed with explicit cast)
                   // الآن تقدر توصل لـ show2()
        B b = new B();
        b.show1();// both eshow1 and show2 cause B is inherited from B so it has all its
                  // properities
        b.show2();

    }
}
