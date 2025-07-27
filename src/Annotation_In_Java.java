@FunctionalInterface // Annotation Ensures only one abstract method in the interface
interface Q { // Has 1 abstract method, making it functional
    void show();

}

interface R {
    void sit(int i);
}

public class Annotation_In_Java {
    public static void main(String[] args) {
        /**
         * Q q = new Q() {
         * public void show() {
         * System.out.println("in show");// Anonymous class: Inline implementation
         * without a named class
         * }
         * };
         * q.show();ss
         */
        // Instead of using anonymous class, you could also use a lambda like this:
        // Because functional interfaces are used in lambda expressions, streams, and
        // functional programming in Java.
        Q q = () -> System.out.println("In show");
        q.show();

        R r = (i) -> System.out.println("Sit in chair number: " + i);
        r.sit(60);

    }
}
