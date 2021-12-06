package packagemultithreading;

class MyThread1 implements Runnable {

    @Override
    public void run() {
        for (int i=0; i < 50; i++) {
            try {
                System.out.println("HELLO");
                Thread.sleep(1000L);
                Thread.yield();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        for (int i=0; i< 26; i++) {
            try {
                System.out.println((char) i+97);
                Thread.sleep(1000L);
                Thread.yield();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread3 implements Runnable {
    @Override
    public void run() {
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(c + "->");
        }
    }
}

public class YieldDemo {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyThread1());
        t1.start();
        Thread t2 = new Thread(new MyThread2());
        t2.start();
        Thread t3 = new Thread(new MyThread3());
        t3.start();
    }
}
