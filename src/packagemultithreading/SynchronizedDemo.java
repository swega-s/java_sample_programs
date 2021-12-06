package packagemultithreading;

class MySyncThread implements Runnable {

    int count = 0;

    @Override
    public synchronized void run() {
        for (int i=0; i<10; i++) {
            System.out.println(Thread.currentThread().getName());
            count++;
        }
        System.out.println("Count: " + count);
    }
}

public class SynchronizedDemo {
    public static void main(String[] args) {
        MySyncThread thread1 = new MySyncThread();
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread1);
        t2.start();
        t1.start();
    }
}
