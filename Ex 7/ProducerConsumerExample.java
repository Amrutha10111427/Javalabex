class Buffer {
int data;
boolean available = false;
synchronized void produce(int value) {
while (available) {
try { wait(); } catch (Exception e) {}
} data = value;
System.out.println("Produced: " + value);
available = true;
notify();
}
synchronized void consume() {
while (!available) {
try { wait(); } catch (Exception e) {}
}
System.out.println("Consumed: " + data);
available = false;
notify();
}
}
class Producer extends Thread {
Buffer b;
Producer(Buffer b) { this.b = b; }
public void run() {
for (int i = 1; i <= 5; i++) {
b.produce(i);
try { Thread.sleep(1000); } catch (Exception e) {}
}
}
}
class Consumer extends Thread {
Buffer b;
Consumer(Buffer b) { this.b = b; }
public void run() {
for (int i = 1; i <= 5; i++) {
b.consume();
try { Thread.sleep(1500); } catch (Exception e) {}
}
}
}
public class ProducerConsumerExample {
public static void main(String[] args) {
Buffer b = new Buffer();
new Producer(b).start();
new Consumer(b).start();
}
}

