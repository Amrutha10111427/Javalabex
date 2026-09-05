public class BuiltInExceptionExample {
public static void main(String[] args) {
try {
String str = null;
System.out.println(str.length()); // NullPointerException
}
catch (NullPointerException e) {
System.out.println("Null Pointer Exception occurred");
}
try {
int num = Integer.parseInt("abc"); // NumberFormatException
}
catch (NumberFormatException e) {
System.out.println("Number Format Exception occurred");
}
}
}

