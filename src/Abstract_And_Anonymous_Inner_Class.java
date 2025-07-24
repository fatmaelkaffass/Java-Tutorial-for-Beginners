
abstract class A {// this is an abstract class
    public abstract void show();
}

public class Abstract_And_Anonymous_Inner_Class {
    public static void main(String[] args) {
        A a = new A() {// this is an anonymous in class
            public void show() {
                System.out.println("in a show");
            }
        };
        a.show();
        // we cant create an object from an abstract calss but we can use the anonymous
        // inner class which override all the methods in the abstract class

    }
}
