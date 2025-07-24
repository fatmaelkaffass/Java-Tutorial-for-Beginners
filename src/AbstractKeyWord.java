abstract class Car {
    public abstract void drive();// abstract method : without body which is implemeten in the subcalss

    public abstract void fly();

    public void playMusic() {
        System.out.println("Play Music");
    }
}

class WagonR extends Car {

    @Override
    public void fly() {
        System.out.println("can fly..");
    }

    @Override
    public void drive() {
        System.out.println("Driving..");
    }
}

public class AbstractKeyWord {
    public static void main(String[] args) {
        // Car car = new Car() ; we cant craete an object from an abstract class
        Car car = new WagonR();
        car.drive();
        car.playMusic();
        car.fly();
    }
}
