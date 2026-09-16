class MyRunnable implements Runnable {
String message;
int time;
MyRunnable(String msg, int t) {
message = msg;
time = t;
}
public void run() {
try {
while (true) {
System.out.println(message);
Thread.sleep(time);
}
} catch (Exception e) {}
}
}
public class RunnableExample {
public static void main(String[] args) {
Thread t1 = new Thread(new MyRunnable("Good Morning", 1000));
Thread t2 = new Thread(new MyRunnable("Hello", 2000));
Thread t3 = new Thread(new MyRunnable("Welcome", 3000));
t1.start();
t2.start();
t3.start();
}
}

