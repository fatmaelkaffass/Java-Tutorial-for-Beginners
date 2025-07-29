class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Runnable running");
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                System.out.println("Sleeping");
                e.printStackTrace();
            }
        }
    }
}

class MyRunnable2 implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Runnable2 running");
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                System.out.println("Sleeping");
                e.printStackTrace();
            }
        }
    }
}

public class Runnable_vs_Thread {
    public static void main(String[] args) {
        Runnable r = new MyRunnable();
        Thread T = new Thread(r);

        Runnable r2 = new MyRunnable2();
        Thread T2 = new Thread(r2);

        T.start();
        T2.start();

        Runnable r3 = new Runnable() {
            public void run() {// this is anonymous class
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Runnable3 running");
                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        System.out.println("Sleeping");
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread T3 = new Thread(r3);
        T3.start();

        // using Lambda Expression
        Runnable r4 = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Runnable4 running");
                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    System.out.println("Sleeping");
                    e.printStackTrace();
                }
            }
        };
        Thread T4 = new Thread(r4);

        T4.start();

    }
}
