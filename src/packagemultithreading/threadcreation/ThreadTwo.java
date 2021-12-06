package packagemultithreading.threadcreation;


// using a class which implements Runnable interface, so it must override run() method
class ThreadTwo {

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Thread myThread = new Thread(new MyRunnable(), "My thread");
        myThread.start();
    }

}
