import java.util.Scanner;

class Shape {
    void calculateArea() {
        System.out.println("Area calculation not defined for this shape.");
    }
}

class Circle extends Shape {
    float radius;

    Circle(float radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        float area = 3.14f * radius * radius;
        System.out.println("Area of Circle with radius: " + radius + " is: " + area);
    }
}

class Triangle extends Shape {
    float base;
    float height;

    Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    void calculateArea() {
        float area = 0.5f * base * height;
        System.out.println("Area of Triangle with base: " + base + " and height: " + height + " is: " + area);
    }
}

class Rectangle extends Shape {
    int width;
    int length;

    Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    void calculateArea() {
        int area = width * length;
        System.out.println("Area of Rectangle with width: " + width + " and length: " + length + " is: " + area);
    }
}

class Trapezium extends Shape {
    float length1;
    float length2;
    float height;

    Trapezium(float length1, float length2, float height) {
        this.length1 = length1;
        this.length2 = length2;
        this.height = height;
    }

    @Override
    void calculateArea() {
        float area = ((length1 + length2) / 2) * height;
        System.out.println("Area of Trapezium with lengths " + length1 + " and " + length2 + " and height: " + height + " is: " + area);
    }
}

public class area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Base of the Triangle");
        float baseOfTriangle = sc.nextFloat();
        System.out.println("Enter the Height of the Triangle");
        float heightOfTriangle = sc.nextFloat();
        Triangle t = new Triangle(baseOfTriangle, heightOfTriangle);
        t.calculateArea();

        System.out.println("Enter the width of the Rectangle");
        int widthOfRectangle = sc.nextInt();
        System.out.println("Enter the Height of the Rectangle");
        int heightOfRectangle = sc.nextInt();
        Rectangle r = new Rectangle(widthOfRectangle, heightOfRectangle);
        r.calculateArea();

        System.out.println("Enter the Radius of the Circle");
        float radius = sc.nextFloat();
        Circle c = new Circle(radius);
        c.calculateArea();

        System.out.println("Enter the lengths of Parallel sides and height of the Trapezium");
        float len1 = sc.nextFloat();
        float len2 = sc.nextFloat();
        float height = sc.nextFloat();
        Trapezium t1 = new Trapezium(len1, len2, height);
        t1.calculateArea();
    }
}
