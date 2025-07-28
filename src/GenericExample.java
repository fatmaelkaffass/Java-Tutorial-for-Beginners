class pair<T> {
    private T first;
    private T second;

    public pair() {
        first = null;
        second = null;
    }

    public pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

}

public class GenericExample {
    // "Generic" = "General" type" → you can write code once, and use it for many
    // data types (like Integer, String, etc.).
    public static pair<String> minmax(String[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        String min = a[0];
        String max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0)
                min = a[i];
            if (max.compareTo(a[i]) < 0)
                max = a[i];
        }
        return new pair<>(min, max);

    }

    public static void main(String[] args) {
        String[] words = { "mary", "had", "a", "little", "lamb" };
        pair<String> mm = GenericExample.minmax(words);
        System.out.println("Min = " + mm.getFirst());
        System.out.println("Max = " + mm.getSecond());
    }

}
