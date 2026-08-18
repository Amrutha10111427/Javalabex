abstract class Shape {
abstract void area();
}
class Circle extends Shape {
double r;
Circle(double r) {
this.r = r;
}
void area() {
System.out.println("Area of Circle: " + (3.14 * r * r));
}
}
class Rectangle extends Shape {
double l, b;
Rectangle(double l, double b) {
this.l = l;
this.b = b;
}
void area() {
System.out.println("Area of Rectangle: " + (l * b));
}
}
class Triangle extends Shape {
double base, height;
Triangle(double base, double height) { this.base = base;
this.height = height;
}
void area() {
System.out.println("Area of Triangle: " + (0.5 * base * height));
}
}
public class AbstractExample {
public static void main(String[] args) {
Shape s;
s = new Circle(5);
s.area();
s = new Rectangle(4, 6);
s.area();
s = new Triangle(3, 4);
s.area();
}
}
