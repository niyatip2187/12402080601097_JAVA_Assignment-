// Shared resource
class Buffer {
    int data;
    boolean hasData = false;

    // Produce method
    synchronized void produce(int value) {
        try {
            if (hasData) {
                wait(); // wait if data already present
            }

            data = value;
            System.out.println("Produced: " + data);

            hasData = true;
            notify(); // notify consumer

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    // Consume method
    synchronized void consume() {
        try {
            if (!hasData) {
                wait(); // wait if no data
            }

            System.out.println("Consumed: " + data);

            hasData = false;
            notify(); // notify producer

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

// Producer class
class Producer extends Thread {
    Buffer buffer;

    Producer(Buffer b) {
        buffer = b;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
        }
    }
}

// Consumer class
class Consumer extends Thread {
    Buffer buffer;

    Consumer(Buffer b) {
        buffer = b;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Buffer buffer = new Buffer();

        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}
