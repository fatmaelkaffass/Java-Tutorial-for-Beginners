class Person {
    // variables
    String f_name;
    String l_name;

    // parameterized constructor
    public Person(String f_name, String l_name) {
        this.f_name = f_name;
        this.l_name = l_name;
    }

    public void ShowName() {
        System.out.println(this.f_name + " " + this.l_name);
    }

}

class Person_Student extends Person {
    double gpa;

    public Person_Student(String f_name, String l_name, double gpa) {
        super(f_name, l_name);
        this.gpa = gpa;
    }

    public void ShowGPA() {
        System.out.println(this.f_name + "'s GPA is : " + this.gpa);
    }
}

class Person_Employee extends Person {
    int salary;

    public Person_Employee(String f_name, String l_name, int salary) {
        super(f_name, l_name);
        this.salary = salary;
    }

    public void Showsalary() {
        System.out.println(this.f_name + "'s Salary is : " + this.salary);
    }
}

public class Super_keyWord {
    // super = Refers to the parent class
    // Used in constructors and method overriding
    // Calls the parent constructor to initialize attributes
    public static void main(String[] args) {
        Person person = new Person("Tom", "Riddle");
        person.ShowName();
        Person_Student student = new Person_Student("Harry", "Potter", 3.25);
        student.ShowGPA();
        Person_Employee Employee = new Person_Employee("Rubeus", "Hagrid", 5000);
        Employee.Showsalary();
    }

}
