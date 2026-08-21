class Animal {
String color = "White";
void show() {
System.out.println("Animal color: " + color);
}
}
class Dog extends Animal {
String color = "Black";
void display() {
System.out.println("Dog color: " + color);
System.out.println("Parent color using super: " + super.color);
super.show();
}
}
public class SuperExample {
public static void main(String[] args) {
Dog d = new Dog();
d.display();
}
}

