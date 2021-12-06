package packagemultithreading;


// using Runnable interface in a lambda expression
class ThreadFour {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName());
        };

        Thread myThread = new Thread(runnable, "Thread 1");
        myThread.start();
        Thread myThread2 = new Thread(runnable, "Thread 2");
        myThread2.start();
    }

}
