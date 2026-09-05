import java.util.Scanner;
// Custom Exception
class InvalidAgeException extends Exception {
InvalidAgeException(String msg) {
super(msg);
}
}
public class UserDefinedExceptionExample { static void checkAge(int age) throws InvalidAgeException {
if (age < 18)
throw new InvalidAgeException("Age must be 18 or above");
else
System.out.println("Eligible to vote");
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter age: ");
int age = sc.nextInt();
try {
checkAge(age);
}
catch (InvalidAgeException e) {
System.out.println("Exception: " + e.getMessage());
}
sc.close();
}
}

