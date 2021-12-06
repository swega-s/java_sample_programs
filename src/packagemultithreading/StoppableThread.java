package packagemultithreading;

class StoppableThread extends Thread {

    private boolean isStopped = false;

    public synchronized void stopThread() {
        isStopped = true;
    }

    private synchronized boolean isThreadStopped() {
        return isStopped;
    }

    @Override
    public void run() {
        System.out.println("here in run");
        while (!isThreadStopped()) {
            System.out.println(Thread.currentThread().getName() + " -> hello");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public synchronized void start() {
        System.out.println("here in start");
        super.start();
    }
}

class Main {
    public static void main(String[] args) {
        StoppableThread thread = new StoppableThread();
        StoppableThread thread2 = new StoppableThread();
        thread.start();
        thread2.start();
        System.out.println("thread1 " + thread.getThreadGroup());
        System.out.println("thread2 " + thread2.getThreadGroup());

        try {
            Thread.sleep(5000);
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        thread.stopThread();
        thread2.stopThread();

        System.out.println(thread.isInterrupted());
        System.out.println(thread2.isInterrupted());

        System.out.println(thread.isAlive());
        System.out.println(thread2.isAlive());

        System.out.println(thread.isInterrupted());
        System.out.println(thread2.isInterrupted());

        System.out.println(thread.isAlive());
        System.out.println(thread2.isAlive());

        System.out.println("all threads ended");
    }
}
