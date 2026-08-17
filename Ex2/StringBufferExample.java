import java.util.Scanner;
public class StringBufferExample {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = sc.nextLine();
StringBuffer sb = new StringBuffer(str);
// Delete a character at index
System.out.print("Enter index to delete character: ");
int index = sc.nextInt();
if (index >= 0 && index < sb.length()) {
sb.deleteCharAt(index);
System.out.println("After deleting character: " + sb);
} else {
System.out.println("Invalid index");
}
// Delete a range
System.out.print("Enter start and end index to delete: ");
int start = sc.nextInt();
int end = sc.nextInt();
if (start >= 0 && end <= sb.length() && start < end) {
sb.delete(start, end);
System.out.println("After deleting substring: " + sb);
} else {
System.out.println("Invalid range");
}
sc.close();
}
}
