class MyThread extends Thread {
public void run() {
for (int i = 1; i <= 5; i++) {
System.out.println("Thread running: " + i);
try { Thread.sleep(500); } catch (Exception e) {}
}
}
} 
public class JoinAliveExample {
public static void main(String[] args) throws Exception {
MyThread t1 = new MyThread();
System.out.println("Is Alive before start: " + t1.isAlive());
t1.start();
System.out.println("Is Alive after start: " + t1.isAlive());
t1.join(); // wait for thread to finish
System.out.println("Is Alive after completion: " + t1.isAlive());
}
}

