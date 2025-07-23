
class Animal {
    boolean isAlive = true;
    int lives;
    String Sound;

    public Animal(boolean isAliveint, int lives, String Sound) {
        this.isAlive = isAlive;
        this.lives = lives;
        this.Sound = Sound;
    }

    public void Eat() {
        System.out.println("the animal is eating ");
    }

    public void move() {
        System.out.println("this animal is Running");
    }
}

class Dog extends Animal {
    String eyecolor;

    public Dog(boolean isAlive, int lives, String Sound, String eyecolor) {
        super(isAlive, lives, Sound);
        this.eyecolor = eyecolor;
    }

    public void EyeColor() {
        System.out.println("Dog eyecolor is " + this.eyecolor);
    }

    public void Live() {
        System.out.println("Dog lives for " + lives + "years");
    }

    public void sound() {
        System.out.println("And the Dog's sound is : " + Sound);

    }
}

class Cat extends Animal {
    String haircolor;

    public Cat(boolean isAlive, int lives, String Sound, String haircolor) {
        super(isAlive, lives, Sound);
        this.haircolor = haircolor;
    }

    public void HairColor() {
        System.out.println("Dog haircolor is " + this.haircolor);
    }

    public void Live() {
        System.out.println("Cat lives for " + lives + "years");
    }

    public void sound() {
        System.out.println("And the Cat's sound is : " + Sound);

    }
}

class Fish extends Animal {
    String texture;

    public Fish(boolean isAlive, int lives, String Sound, String texture) {
        super(isAlive, lives, Sound);
        this.texture = texture;
    }

    public void Texture() {
        System.out.println("Dog texture is " + this.texture);
    }

    public void Live() {
        System.out.println("fish lives for " + lives + "years");
    }

    public void sound() {
        System.out.println("And the fish's sound is : " + Sound);

    }

    @Override
    public void move() {
        System.out.println("this animal is swiming");
    }
}

public class Inheritance_And_Overriding {
    public static void main(String[] args) {
        // Method overriding = When a subclass provides its own
        // implementation of a method that is already defined.
        // Allows for code reusability and gives specific implementations.

        Dog dog = new Dog(true, 5, "how how", "brown");
        Cat cat = new Cat(true, 9, "mew mew", "white");
        Fish fish = new Fish(false, 0, "no sound", "hard");
        dog.Eat();
        dog.sound();
        dog.Live();
        dog.move();
        dog.EyeColor();

        cat.Eat();
        cat.sound();
        cat.Live();
        cat.move();
        cat.HairColor();

        fish.Eat();
        fish.sound();
        fish.Live();
        fish.move();
        fish.Texture();

    }
}
