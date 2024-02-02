
abstract class Shape {
    public abstract void draw();
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle...");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a circle...");
    }
}

class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a triangle...");
    }
}

public class plymorph {
    public static void main(String[] args) {
        Shape[] shapes = { new Rectangle(), new Circle(), new Triangle() };

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
