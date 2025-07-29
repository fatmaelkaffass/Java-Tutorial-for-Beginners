import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student1 implements Comparable<Student1> {
    String name;
    int age;

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // This tells Java how to compare one student to another
    @Override
    public int compareTo(Student1 o) {

        return this.age - o.age; // Sort by age
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

}

class SortByName implements Comparator<Student1> {
    public int compare(Student1 s1, Student1 s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class Comparable_VS_Comparator {
    public static void main(String[] args) {

        ArrayList<Student1> students = new ArrayList<>();
        students.add(new Student1("Fatma", 23));
        students.add(new Student1("Aliaa", 20));
        students.add(new Student1("Sara", 25));
        students.add(new Student1("Menna", 28));
        System.out.println("Before sorting: " + students);
        // Sort by age (Comparable)
        Collections.sort(students);
        System.out.println("Sorted by age: " + students);
        // Sort by name (Comparator)
        Collections.sort(students, new SortByName());
        System.out.println("Sorted by name: " + students);

    }
}
