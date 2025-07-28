import java.util.ArrayList;
import java.util.List;

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {

    @Override
    void draw() {
        System.out.println("drawing rectangle");

    }

}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("drawing circle");
    }

}

public class Wildcards {
    static void drwaShapes(List<? extends Shape> lists) {// → A bounded wildcard, meaning the list can contain Shape,
                                                         // Rectangle, Circle, etc.
        for (Shape s : lists) {
            s.draw();// calling method of shape by child class instance
        }
    }

    public static void main(String[] args) {
        List<Rectangle> list1 = new ArrayList<Rectangle>();
        list1.add(new Rectangle());
        list1.add(new Rectangle());
        List<Circle> list2 = new ArrayList<Circle>();
        list2.add(new Circle());

        System.out.println("Drawing Rectangles:");
        drwaShapes(list1);

        System.out.println("\nDrawing Circles:");
        drwaShapes(list2);
    }
}
