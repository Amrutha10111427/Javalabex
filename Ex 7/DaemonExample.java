class MyDaemon extends Thread {
public void run() {
while (true) {
System.out.println("Daemon thread running...");
try { Thread.sleep(1000); } catch (Exception e) {}
}
}
}
public class DaemonExample {
public static void main(String[] args) {
MyDaemon t = new MyDaemon();
t.setDaemon(true); // set as daemon
t.start();
System.out.println("Main thread ends");
}
}
