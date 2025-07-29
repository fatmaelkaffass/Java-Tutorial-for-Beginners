import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class collections_in_Java {
    public static void main(String[] args) {
        // we have a collection called List its benifits is duplications and
        // intersection order
        // List using ArrayList
        List<Integer> ArrOfNum = new ArrayList<Integer>();
        ArrOfNum.add(6);
        ArrOfNum.add(5);
        ArrOfNum.add(8);
        ArrOfNum.add(3);
        System.out.println(ArrOfNum);
        for (Integer n : ArrOfNum) {
            System.out.println(n * 2);
        }
        System.out.println(ArrOfNum.size());

        // List using LinkedList
        List<String> cities = new LinkedList<String>();
        cities.add("Cairo");
        cities.add("Giza");
        cities.add("Alexandria");
        cities.add("Minia");
        System.out.println("Cities are :" + cities);
        /*
         * for (String c : cities) {
         * System.out.println(c);
         * 
         * }
         */System.out.println(cities.isEmpty());
        // The Iterator interface is used to iterate over elements in a collection (like
        // List, Set, etc.)
        Iterator<String> it = cities.iterator();
        while (it.hasNext()) {
            String city = it.next();
            if (city.equals("Minia")) {// Compare individual element, not the list "cities"

                it.remove();
            }
        }
        System.out.println("Cities After Removing Minia: " + cities);
        // we have a collection called Set its benifits is No_duplications and
        // No_intersection order
        // Set using HashSet
        Set<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");// Duplicate ignored
        System.out.println(fruits);
        // Set using LinkedHashSet
        Set<String> countries = new LinkedHashSet<>();
        countries.add("Egypt");
        countries.add("UAS");
        countries.add("Feance");
        System.out.println(countries);

        // TreeSet (sorted)
        Set<Integer> sortedNumbers = new TreeSet<>();
        sortedNumbers.add(30);
        sortedNumbers.add(10);
        sortedNumbers.add(20);

        System.out.println("Sorted numbers: " + sortedNumbers);

        // we have a collection called Map it is a key-value pairs its benifits is
        // No_duplications for key
        // Map using HashMap get the keys sorted
        Map<Integer, String> StudentMap = new HashMap<>();
        StudentMap.put(101, "Fatma");
        StudentMap.put(105, "Manar");
        StudentMap.put(103, "menna");
        for (Map.Entry<Integer, String> entry : StudentMap.entrySet()) {
            System.out.println("ID : " + entry.getKey() + ", Name : " + entry.getValue());
        }

        // Map using TreeMap get the keys sorted
        Map<Integer, String> scors = new TreeMap<>();
        scors.put(90, "Math");
        scors.put(70, "Physics");
        scors.put(100, "Science");
        scors.put(50, "Language");
        for (Map.Entry<Integer, String> entryscore : scors.entrySet()) {
            System.out.println("Your Scors for " + entryscore.getValue() + " Subject is :" + entryscore.getKey());
        }
        // LinkedHashMap (insertion order)
        Map<String, Integer> scores = new LinkedHashMap<>();
        scores.put("Math", 90);
        scores.put("Science", 85);

        System.out.println("Scores: " + scores);

        // we have a collection called Queue it is a key-value pairs its benifits is
        // LinkedList as Queue
        Queue<String> tasks = new LinkedList<>();
        tasks.add("Clean");
        tasks.add("Study");
        tasks.add("Eat");
        tasks.add("Sleep");
        System.out.println("numer of tasks is: " + tasks.size());
        System.out.println("Next task: " + tasks.peek());// see first item
        System.out.println("Doing task: " + tasks.poll());// remove first
        System.out.println("Remainang tasks :" + tasks);
        // PriorityQueue (sorted order)
        Queue<Integer> numbers = new PriorityQueue<>();
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        System.out.println("PriorityQueue: " + numbers); // Not necessarily sorted visually
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements to the queue
        pq.add(50);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        // PriorityQueue will automatically sort the elements in natural order
        // (ascending)
        System.out.println("PriorityQueue: " + pq); // Might not look sorted, but it will always remove the smallest
                                                    // first

        // Peek at the smallest element (head of the queue)
        System.out.println("Peek: " + pq.peek()); // Output: 10

        // Poll elements (remove and return the head of the queue)
        System.out.println("Poll: " + pq.poll()); // Removes 10
        System.out.println("After poll: " + pq); // Now head is 20

        // Continue polling
        while (!pq.isEmpty()) {
            System.out.println("Next: " + pq.poll());

        }

        // What are Generic Utility Methods?
        // They are static generic methods that help perform common operations on
        // collections like sorting, reversing, shuffling, finding max/min, copying
        // elements, etc.
        List<String> Foods_Fruits = new ArrayList<>(Arrays.asList("Banana", "Apple", "Orange", "Mango"));
        System.out.println("Original:" + Foods_Fruits);
        // sort Alphabetically
        Collections.sort(Foods_Fruits);
        System.out.println("Sorted:" + Foods_Fruits);
        // Reverse the list
        Collections.reverse(Foods_Fruits);
        System.out.println("Reversed:" + Foods_Fruits);
        // Shuffle the list (Mix خلط)
        Collections.shuffle(Foods_Fruits);
        System.out.println("Shuffled: " + Foods_Fruits);
        // Max and Min
        System.out.println("Max: " + Collections.max(Foods_Fruits));// Alphabetically
        System.out.println("Min: " + Collections.min(Foods_Fruits));// Alphabetically

        // Frequency of 'Apple'
        System.out.println("Apple appears: " + Collections.frequency(Foods_Fruits, "Apple"));

        // Swap two elements
        Collections.swap(Foods_Fruits, 0, 1);
        System.out.println("After Swap: " + Foods_Fruits);
    }
}