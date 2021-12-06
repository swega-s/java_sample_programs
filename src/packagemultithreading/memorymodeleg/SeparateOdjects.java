package packagemultithreading.memorymodeleg;

public class SeparateOdjects {
    public static void main(String[] args) {

        // separate runnable objects
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());

        thread1.start();
        thread2.start();
    }
}
