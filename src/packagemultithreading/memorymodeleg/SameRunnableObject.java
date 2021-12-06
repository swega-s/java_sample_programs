package packagemultithreading.memorymodeleg;

public class SameRunnableObject {
    public static void main(String[] args) {

        Runnable runnable = new MyRunnable();

        // same runnable object for different threads
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}
