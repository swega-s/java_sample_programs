package packagemultithreading.memorymodeleg;

public class MyRunnable implements Runnable {

    private int count = 0;

    @Override
    public void run() {
        for (int i=0; i<100; i++) {
            count++;
        }
        System.out.println(Thread.currentThread().getName() + "'s count: " + count);
    }
}
