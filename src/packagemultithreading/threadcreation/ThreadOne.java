package packagemultithreading.threadcreation;


// using with our own thread class by extending Thread class
public class ThreadOne {

    static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println(currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
    }
}
