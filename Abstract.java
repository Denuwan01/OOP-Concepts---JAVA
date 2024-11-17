// Abstract class Shape
abstract class Shape {
    String color;

    // Constructor
    Shape(String color) {
        this.color = color;
    }

    // Abstract method to compute area
    abstract double area();

    // Concrete method to display color
    void displayColor() {
        System.out.println("Color: " + color);
    }
}

// Rectangle class extends Shape
class Rectangle extends Shape {
    double width;
    double height;

    // Constructor
    Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    // Implementation of the area method
    @Override
    double area() {
        return width * height;
    }
}

// Circle class extends Shape
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // Implementation of the area method
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        // Create a Rectangle object
        Shape rectangle = new Rectangle("Red", 10, 5);
        rectangle.displayColor();
        System.out.println("Area of rectangle: " + rectangle.area());

        // Create a Circle object
        Shape circle = new Circle("Blue", 7);
        circle.displayColor();
        System.out.println("Area of circle: " + circle.area());
    }
}
