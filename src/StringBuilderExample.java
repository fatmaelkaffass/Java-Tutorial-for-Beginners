public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        System.out.println("After append: " + sb);

        sb.reverse();
        System.out.println("Reversed: " + sb);

        sb.deleteCharAt(0);
        System.out.println("After deleteCharAt: " + sb);

        sb.insert(0, "Hi");
        System.out.println("After insert: " + sb);
    }
}