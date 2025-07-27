interface prey {
    void flee();

}

interface predator {
    void hunt();
}

class Rabbit implements prey {

    @Override
    public void flee() {
        System.out.println("the rabbit is running away");

    }

}

class Shark implements prey, predator {

    @Override
    public void flee() {
        System.out.println("the fish is swimming away");

    }

    @Override
    public void hunt() {
        System.out.println("the fish is hunting");

    }

}

class Hawk implements predator {

    @Override
    public void hunt() {
        System.out.println("the hawk is hunting");

    }

}

public class interfaces_In_Java {

    // Interface = A blueprint for a class that specifies a set of abstract methods
    // that implementing classes MUST define.
    // Supports multiple inheritance-like behavior.

    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        Shark fish1 = new Shark();
        fish1.flee();
        fish1.hunt();
    }

}
