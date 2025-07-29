
class counter1 {
    int count;

    public synchronized void Increment1() {
        System.out.println(count++);
    }
}

public class Rcae_Condition {
    /**
     * A Race Condition occurs when two or more threads access shared data and try
     * to change it at the same time.
     * This can lead to unexpected behavior or bugs.
     * Example: Two threads updating the same counter at the same time.
     * 
     * @throws InterruptedException
     * 
     */
    public static void main(String[] args) throws InterruptedException {

        counter1 counter = new counter1();

        Runnable Run = () -> {
            for (int i = 1; i <= 10; i++) {
                counter.Increment1();
                /*
                 * 
                 * try {
                 * Thread.sleep(300);
                 * } catch (InterruptedException e) {
                 * e.printStackTrace();
                 * }
                 */
            }
        };
        Thread T1 = new Thread(Run);
        Thread T2 = new Thread(Run);
        T1.start();
        T2.start();
        T1.join();// Waits for one thread to finish before continuing
        T2.join();

    }
}
