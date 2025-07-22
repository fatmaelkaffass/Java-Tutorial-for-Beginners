class Mobile {
    // when i make the Type Static it apply on every type in the class as shown
    static String Type;
    String Brand;
    int Price;

    public void Show() {
        System.out.println(Type + " : " + Brand + " : " + Price);
    }

    public static void Show1() {
        System.out.println("In Static Method");
    }

    public static void Show1(Mobile obj) {// we cant put non-static var in a static method but we can handle it by
                                          // making a parameter of the class and mention it in the sys.out
        System.out.println(Type + " : " + obj.Brand + " : " + obj.Price);
    }
}

public class static_objects_or_vars {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.Type = " Smart phone ";
        obj1.Brand = " Apple ";
        obj1.Price = 1800;

        Mobile obj2 = new Mobile();
        obj2.Type = " Smart phone ";
        obj2.Brand = " Samsung ";
        obj2.Price = 1000;

        obj1.Type = " phone ";

        obj1.Show();
        obj2.Show();

        Mobile.Show1();// we can call a static method without creating an object of a class
        Mobile.Show1(obj2);
    }
}
