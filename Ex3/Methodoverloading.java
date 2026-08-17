class Overload {
void add(int a, int b) {
System.out.println("Sum (int): " + (a + b));
}
void add(double a, double b) {
System.out.println("Sum (double): " + (a + b));
}
void add(int a, int b, int c) {
System.out.println("Sum (3 ints): " + (a + b + c));
}
}
public class MethodOverloading {
public static void main(String[] args) {
Overload obj = new Overload();
obj.add(10, 20);
obj.add(5.5, 2.5);
obj.add(1, 2, 3);
}
}

