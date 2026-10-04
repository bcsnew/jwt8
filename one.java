abstract class Shape {
int a;
int b;

Shape(int a, int b) {
this.a = a;
this.b = b;
}

abstract void printArea();
}

class Rectangle extends Shape {
Rectangle(int l, int w) {
super(l, w);
}

void printArea() {
int area = a * b;
System.out.println("Area of Rectangle (" + a + " x " + b + "): " + area);
}
}

class Triangle extends Shape {
Triangle(int base, int height) {
super(base, height);
}

void printArea() {
double area = 0.5 * a * b;
System.out.println("Area of Triangle (base " + a + ", height " + b + "): " + area);
}
}

class Circle extends Shape {
Circle(int radius) {
super(radius, 0);
}

void printArea() {
double area = 3.14159 * a * a;
System.out.println("Area of Circle (radius " + a + "): " + area);
}
}

public class one {
public static void main(String[] args) {
Shape s1 = new Rectangle(10, 5);
s1.printArea();
Shape s2 = new Triangle(8, 6);
s2.printArea();
Shape s3 = new Circle(7);
s3.printArea();
}
}
