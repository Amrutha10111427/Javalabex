class T1 extends Thread {
public void run() {
try {
while (true) {
System.out.println("Good Morning");
Thread.sleep(1000);
}
} catch (Exception e) {}
}
}
class T2 extends Thread {
public void run() {
try {
while (true) {
System.out.println("Hello");
Thread.sleep(2000);
}
} catch (Exception e) {}
}
}
class T3 extends Thread {
public void run() {
try {
while (true) {
System.out.println("Welcome");
Thread.sleep(3000);
}
} catch (Exception e) {}
}
}
public class ThreadExample {
public static void main(String[] args) { new T1().start();
new T2().start();
new T3().start();
}
}

