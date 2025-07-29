class F extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(100);// The thread goes to a "Timed Waiting" state.
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}

class H extends Thread {
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}

// we need functions happen in the same time

public class Threads {
    public static void main(String[] args) {
        F f = new F();
        H h = new H();

        System.out.println(f.getPriority());// 5 by default //Returns thread's current priority.
        h.setPriority(Thread.MAX_PRIORITY);// Suggests to JVM which thread should get more CPU tim

        Thread Th1 = new Thread(f);
        Thread Th2 = new Thread(h);

        f.start(); // start() is a method inside the Thread class
        h.start();
    }
}
