abstract class A {
    int a;

    public void show() {
        System.out.println("in show");
    }

    abstract public void Music();// anonymous class لازم تكون موجودة علشان تكتبيها في

    class B {

        public void config() {
            System.out.println("in config");
        }
    }
}

public class Inner_Class {
    public static void main(String[] args) {
        A a = new A() {// an anonymous class
            public void Music() {
                System.out.println("play music .. ");
            }
        };
        a.Music();
        a.show();
        A.B b = a.new B();
        b.config();

    }
}
