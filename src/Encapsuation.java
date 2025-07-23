class Human {
    // private int age = 11;
    // private String name = "menna";

    private int age;
    private String name;

    // constructors : is aspecial method which have the same name of the class we
    // use it to initializa objets and can set up initial values
    public Human() // default constructor without parameters
    {
        age = 12;
        name = "jana";
    }

    public Human(int a, String n) // parameterized constructor
    {
        this.age = a;
        this.name = n;
    }

    // after giving the values we need to make getters
    public int getAge() {
        return age;
    }

    // what if we did not initialize the values of age and name ? we create a
    // setters
    public void setAge(int a) {
        this.age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }
    // we can create setters & getters automaticaly by press on the right click then
    // choose Source Action then Generate Getters and Setters

}

public class Encapsuation {

    public static void main(String[] args) {
        Human obj = new Human();
        // when we make it private in the class Human the main class cant
        // see it so we can put the values in the class human itself in case we dont
        // want
        // anyone have the access of changing thier values
        // obj.age = 11;
        // obj.name = "menna";

        obj.setAge(18);
        obj.setName("Manar");
        System.out.println(obj.getName() + " : " + obj.getAge());
        Human obj1 = new Human(); // object of the default constractor
        System.out.println(obj1.getName() + " : " + obj1.getAge());
        Human obj2 = new Human(43, "mother");
        System.out.println(obj2.getName() + " : " + obj2.getAge());

    }

}
