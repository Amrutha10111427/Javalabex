class Student {
int id;
String name;
// Default constructor
Student() {
id = 0;
name = "Unknown";
}
// Parameterized constructor
Student(int i, String n) {
id = i;
name = n;
}
void display() {
System.out.println("ID: " + id + " Name: " + name);
}
}
public class ConstructorOverloading {
public static void main(String[] args) {
Student s1 = new Student();
Student s2 = new Student(102, "Bhargavi");
s1.display();
s2.display();
}
}
