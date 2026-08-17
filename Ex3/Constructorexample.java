class Student {
int id;
String name;
// Constructor
Student(int i, String n) {
id = i;
name = n;
}
void display() {
System.out.println("ID: " + id + " Name: " + name);
}
}
public class ConstructorExample { public static void main(String[] args) {
Student s1 = new Student(101, "Bhargavi");
s1.display();
}
}

