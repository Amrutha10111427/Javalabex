public class ExceptionExample {
public static void main(String[] args) {
try {
int a = 10, b = 0;
int result = a / b; // causes exception
System.out.println("Result: " + result);
}
catch (ArithmeticException e) {
System.out.println("Exception caught: Division by zero");
}
finally {
System.out.println("Finally block always executes");
}
}
}

