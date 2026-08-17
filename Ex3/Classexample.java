class Student {
int id;
String name;
void setData(int i, String n) {
id = i;
name = n;
}
void display() {
System.out.println("ID: " + id);
System.out.println("Name: " + name);
}
}
public class ClassExample {
public static void main(String[] args) {
Student s1 = new Student();
s1.setData(101, "Bhargavi");
s1.display();
}
}
